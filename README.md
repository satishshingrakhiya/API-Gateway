# API-Gateway
This Project Demonstrates use of Spring Cloud Gateway for Microservices using config file and java code both

### Prerequisite
1. Java 11
2. Intellij or any other IDE
3. Postman (Not necessary can be tested in Browser)

### How to install and run project
1. Clone the repository and open in your favourite IDE.
2. Start FirstService and SecondService. (Path: FirstService/src/main/java/com.stasih.FirstService/FirstServiceApplication)
3. Check endpoints http://localhost:8081/first/get and http://localhost:8082/second/get and see ouput in Postman or any browser.
4. Now start GatewayConfigFile project and visit above two endpoints through this Gateway http://localhost:8080/first/get and http://localhost:8080/second/get. Same output will be received as was given by FirstService and SecondService.
5. This Gateway is configured in application.yml file (Path: GatewayConfile/scr/main/resources/application.yml). Following dependency should be added in pom.xml to use this gateway

    <dependency>
    
			<groupId>org.springframework.cloud</groupId>
      
			<artifactId>spring-cloud-starter-gateway</artifactId>
      
		</dependency>
    
6. Now start GatewayJavaCode projct and visit 3rd point endpoints through this Gateway http://localhost:8085/first/get and http://localhost:8085/second/get. Same output will be received as was given by FirstService and SecondService.
7. This Gateway's configuration are in RouterConfiguration.java file (Path: GatewayJavaCode/src/main/java/com.stasih.GatewayJavaCode/RouterConfiguration.java). Dependency mentioned in 5th point is also required for this.
