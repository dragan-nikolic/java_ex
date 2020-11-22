# [Introduction to Spring MVC](https://app.pluralsight.com/library/courses/springmvc-intro/table-of-contents)

## STS4 Notes

### Setup Development Environment with STS4

Follow instructions from the course and change following:

- use pom.xml from my_exercises/FitnessTracker project
- use Java 1.8

### How to use Tomcat with STS4

- Make sure Servers view is open (Window/Show View/Other.../Server/Servers)
- Add project to the Tomcat
  - Right-click on 'Tomcat v7.0 Server at localhost' and select 'Add or Remove'
  - Add project you want to monitor
  - Remove project you don't want to monitor (if any)

## IntelliJ Notes

### Setup Development Environment with IntelliJ - COULD NOT GET IT WORKING

#### Setup Web Server - Tomcat

Download and install v7 from Tomcat download.

- Start Tomcat using command: `$ catalina start`
- Stop Tomcat using command: `$ catalina stop`

### How to deploy an application

For initial deployment use maven `tomcat7:deploy`

For subsequent deployment use maven: `tomcat7:redeploy`

In IntelliJ these commands are located under `Plugins/tomcat7` section.

See SimpleServlet for an example. It is important to include `tomcat7-maven-plugin`
in the pom.xml.

*Note: Before deploying you must start Tomcat.*

### FitnessTracker example

After deploying, try following in browser:

- `localhost:8080/FitnessTracker`
