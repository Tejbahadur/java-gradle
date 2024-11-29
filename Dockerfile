FROM openjdk:17-alpine
WORKDIR /opt
COPY build ./build
CMD ["java","-jar" ,"/opt/build/libs/get-going-with-gradle.jar","es"]
