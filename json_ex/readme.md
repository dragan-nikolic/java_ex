# JSON Examples

## Simple Maven proejct

Create it using following command:

mvn archetype:generate \
    -DgroupId=com.mycompany.app \
    -DartifactId=my-app \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DarchetypeVersion=1.4 \
    -DinteractiveMode=false

mvn package

java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App

## JSON Path Example

java -cp target/json_path_ex-1.0-SNAPSHOT.jar com.dragan.app.JsonPathEx
