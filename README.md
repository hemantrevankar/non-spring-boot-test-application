A simple web service application built using spring REST without using spring boot libraries.
Steps involved are as follows:
1> Create a simple maven project.
2> Now from the eclipse tool, configure the project to use a faceted form for Dynamic Web project. This will convert the simple maven project
   to Web project by including the WebContent/META-INF and WebContent/WEB-INF directories.
3> Add a web.xml file in the WebContent/WEB-INF directory
4> Provide the DispathcerServlet servlet definition and servlet mapping. Make sure to configure the DispatcherServlet with the 
   spring-context configuration file through the use of <init-param><param-name>contextConfigLocation</param-name></init-param>. This configuration
   will help instantiate the servlet specific WebApplicationContext
5> Add the spring application context xml configuration file in the WEB-INF directory. Make sure the below two xml tags are added for the rest application to work
- <context:component-scan />
- <mvc:annotation-driven />
6> Create a package in the src/main/java and add files for Controller and configure the controller with handler methods using the appropriate annotations.
7> You may have to add a jackson maven dependency for Json lib to convert the java object to Json and vice-versa.

References:
https://howtodoinjava.com/spring-restful/spring-rest-hello-world-xml-example/
http://websystique.com/springmvc/spring-4-mvc-rest-service-example-using-restcontroller/