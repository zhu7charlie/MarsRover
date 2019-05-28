FROM java:8
#EXPOSE 8080
MAINTAINER Changhai Zhu
COPY inputfile.txt ./
ADD target/mavenMarsRover-0.0.1-SNAPSHOT.jar czMarsRover.jar
ENTRYPOINT ["java","-cp", "czMarsRover.jar", "com.charlie.it.mainMarsRover" ]
#CMD exec java -cp /czMarsRover.jar com.charlie.it.mainMarsRover