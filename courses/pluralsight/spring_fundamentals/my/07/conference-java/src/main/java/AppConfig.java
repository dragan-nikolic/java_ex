import org.dragan.util.CalendarFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

@Configuration
@ComponentScan({"org.dragan"})
public class AppConfig {

    @Bean(name="cal")
    public CalendarFactory calFactory() {
        System.out.println("calFactory Bean");
        CalendarFactory calendarFactory = new CalendarFactory();
        calendarFactory.addDays(2);

        return calendarFactory;
    }

    @Bean
    public Calendar cal() throws Exception {
        System.out.println("cal Bean");
        return calFactory().getObject();
    }
}
