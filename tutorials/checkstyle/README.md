# Checkstyle

* https://www.baeldung.com/checkstyle-java
* CalcEngine is taken from Pluralsight Java Language course :)

## Report Generation

### Using Maven
To generate a report for our code run `mvn site` command. 
Once the build finishes, the report is available in the `target/site` folder 
under the name `checkstyle.html`.

### Using Command Line
Download the tool from https://github.com/checkstyle/checkstyle/releases/.

Check single file:
`java -jar checkstyle-8.24-all.jar -c my_google_checks.xml src/main/javacom/dragan/calcengine/Adder.java`

Check multiple files (Linux or GitBash on Windows):
`java -jar checkstyle-8.24-all.jar -c my_google_checks.xml src/main/javacom/dragan/**/*.java`

### Using IntelliJ IDEA
Install IntelliJ plugin CheckStyle-IDEA (https://github.com/jshiell/checkstyle-idea/blob/master/README.md).

To create report open a file then scan it in CheckStyle Tool Window.
To autofix the issues, select the code then press Ctrl+Alt+L

## References
* https://checkstyle.sourceforge.io/
* https://stackoverflow.com/questions/8409074/how-can-i-easily-fix-checkstyle-errors
* https://stackoverflow.com/questions/26955766/intellij-idea-checkstyle



