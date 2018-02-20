# Test Project for Vaadin Flow and Spring Boot Jetty WebSockets
# !!! Still buggy !!!
# Based on Project Base for Vaadin Flow and Spring Boot
# @see https://github.com/vaadin/skeleton-starter-flow-spring 

There are still some exceptions:<br />
Chrome is working<br />
Firefox is not working<br /><br />

FireFox error: 
	Response didn't contain a server id. Please verify that the server is up-to-date and that the response data has not been modified in transmission.

	2018-02-20 14:46:00.399  WARN 32069 --- [  restartedMain] org.atmosphere.cpr.Universe              : More than one Universe configured. Universe class will gives wrong object reference org.atmosphere.cpr.DefaultBroadcasterFactory@132934e7
	2018-02-20 14:46:00.399  WARN 32069 --- [  restartedMain] org.atmosphere.cpr.Universe              : More than one Universe configured. Universe class will gives wrong object reference org.atmosphere.cpr.DefaultAtmosphereResourceFactory@3c56f0d
	2018-02-20 14:46:00.400  WARN 32069 --- [  restartedMain] org.atmosphere.cpr.Universe              : More than one Universe configured. Universe class will gives wrong object reference org.atmosphere.cpr.DefaultAtmosphereResourceSessionFactory@51ec404a
	2018-02-20 14:46:00.400  WARN 32069 --- [  restartedMain] org.atmosphere.cpr.Universe              : More than one Universe configured. Universe class will gives wrong object reference com.vaadin.flow.server.communication.PushRequestHandler$1@288ab186


Run application using
`mvn spring-boot:run`

Open http://localhost:8080/ in browser


For documentation on using Vaadin Flow and Spring, visit [vaadin.com/docs](https://vaadin.com/docs/v10/flow/spring/tutorial-spring-basic.html)

For more information on Vaadin Flow, visit https://vaadin.com/flow.
