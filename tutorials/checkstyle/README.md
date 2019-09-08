# Checkstyle

* https://www.baeldung.com/checkstyle-java
* CalcEngine is taken from Pluralsight Java Language course :)

## Report Generation

### Using Maven
To generate a report for our code run `mvn site` command. 
Once the build finishes, the report is available in the `target/site` folder 
under the name `checkstyle.html`.

### Using Command Line
`java -jar checkstyle-N.N-all.jar -c checkstyle.xml /path/to/src`

Linux:
`java -jar checkstyle-5.5-all.jar -c checkstyle.xml /path/to/src/**/*.java`

## Autofix

### Using IntelliJ
* Select code
* Press Ctrl+Alt+L

## References
* https://checkstyle.sourceforge.io/
* https://stackoverflow.com/questions/8409074/how-can-i-easily-fix-checkstyle-errors
* https://stackoverflow.com/questions/26955766/intellij-idea-checkstyle



