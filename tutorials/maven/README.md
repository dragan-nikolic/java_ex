# Maven

* [Jenkov Maven Tutorial](http://tutorials.jenkov.com/maven/maven-tutorial.html) - part of GridU Web Development with Java and Spring
* http://www.vogella.com/tutorials/ApacheMaven/article.html
* https://www.mkyong.com/maven/how-to-create-a-java-project-with-maven/
* https://www.baeldung.com/maven

## Simple Maven project

### Create project from template

    $ mvn archetype:generate -DgroupId=com.dragan.app -DartifactId=hello -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

### Update POM

#### Update JDK version
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>

#### Update jUnit version
    <dependency>
	    <groupId>junit</groupId>
	    <artifactId>junit</artifactId>
	    <version>4.12</version>
	    <scope>test</scope>
    </dependency>

### Build
    $ mvn package

### Run
    $java -cp target/hello-1.0-SNAPSHOT.jar com.dragan.App
