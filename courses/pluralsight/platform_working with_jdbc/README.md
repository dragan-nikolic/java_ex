# [Java Platform: Working with Databases Using JDBC](https://app.pluralsight.com/library/courses/jdbc-java-platform-working-with-databases/table-of-contents)

## Setup Oracle

### Install Oracle XE 18c

Download file from Oracle and install.

### [How to log to HR sample database](https://www.youtube.com/watch?v=wKvojzCCdBk)

- Start SQL Plus Command Line
- Login username: system, password: oadmin
- Connect to XEPDB1 db as HR user: `connect hr/hr@localhost:1521/XEPDB1`
- Check HR tables: `select table_name from user_tables;`

### Connecting to Oracle using JDBC

- Download JDBC driver (jar file)
- Copy JAR file to the libs folder
- Setup your IDE to use it

See example TestOracleConnection.java.

## Setup MySQL

### Install MySQL 8.0.21

Download file from MySQL and install.

root password: madmin
user: dragan, madmin
port: 3306

### Connect to sample database World

- Start MySQL Workbench
- Select Local instance MySQL80
- In Navigator select Schemas tab at the bottom and select 'world' schema
- in Query 1 tab execute `select * from country` 

### Connecting to MySQL using JDBC

- Download and install JDBC driver from https://dev.mysql.com/downloads/connector/j/
- For Windows select Platfrom indepemdent driver
- Copy JAR file to the libs folder
- Setup your IDE to use it

