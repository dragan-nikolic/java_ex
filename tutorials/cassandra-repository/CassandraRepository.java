package com.apple.amp.repository;

import com.apple.amp.connector.CassandraClusterConnector;
import com.datastax.driver.core.ColumnDefinitions;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.querybuilder.Select;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

@Slf4j
@AllArgsConstructor
public abstract class CassandraRepository<E> {

    private final CassandraClusterConnector cassandraConnector;

    public ResultSet selectFromTable(@NotNull Select select, Object... parameters) {
        log.info("Execute: {}", select);
        log.info("With parameters: {}", Arrays.asList(parameters));

        PreparedStatement preparedSelect = cassandraConnector.getSession().prepare(select);
        final ResultSet resultSet = cassandraConnector.getSession()
                .execute(preparedSelect.bind(parameters));

        log.info("[{}] records selected from Cassandra...", resultSet.getAvailableWithoutFetching());

        return resultSet;
    }

    public void printResultSet(ResultSet resultSet, String message) {
        log.info(message);
        ColumnDefinitions columnDefinitions = resultSet.getColumnDefinitions();
        int columnCount = columnDefinitions.size();
        for (Row item: resultSet) {
            for (int i = 0; i < columnCount; i++) {
                log.info("column: {}, value: {}", columnDefinitions.getName(i), item.getObject(i));
            }
        }
    }

    public abstract List<E> map(@NotNull final ResultSet resultSet);

}
