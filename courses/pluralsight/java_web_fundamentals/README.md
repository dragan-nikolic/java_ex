# [Java Web Fundamentals](https://app.pluralsight.com/library/courses/java-web-fundamentals/table-of-contents)

## Setup Development Environment

### Setup Web Server - Tomcat

Download and install v7 from Tomcat download.

Start Tomcat using command: `$ catalina start`
Stop Tomcat using command: `$ catalina stop`

## How to deploy an application

For initial deployment use maven `tomcat7:deploy`

For subsequent deployment use maven: `tomcat7:redeploy`

These commands are located under `Plugins/tomcat7` section.

See SimpleServlet for an example. It is important to include `tomcat7-maven-plugin`
in the pom.xml.
