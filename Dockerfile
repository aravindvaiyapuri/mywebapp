From eclipse-temurin:17
copy target/mywebapp.jar mywebapp.jar
CMD [ "java","-jar","mywebapp.jar"]
