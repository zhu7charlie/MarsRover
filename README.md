PROBLEM: MARS ROVERS

A Maven Project was created on Eclipse Neon to solve this problem.

  1. It's a Plain Java 8 application -- structure & file names are all self-explanatory
  
  2. a plain inputfile.txt is in the root of application
  
  3. jUnit & Cucumber ComponentTest were included
  
  4. pushed to github, dockerHub 
    github: https://github.com/zhu7charlie/MarsRover (https://github.com/zhu7charlie/MarsRover.git)
    DockerHub: https://hub.docker.com/r/zhu7charlie/cz-mars-rover
    
  5. can clone/pull to your local and run it on IDE or DOS/Mac/CLI
    run/test on IDE (manually)
    DOS:ProjectWorkspce\mavenMarsRover>mvn clean install
    DOS:ProjectWorkspce\mavenMarsRover>mvn test
    DOS:ProjectWorkspce\mavenMarsRover>java -cp target\mavenMarsRover-0.0.1-SNAPSHOT.jar com.charlie.it.mainMarsRover
    
    $ docker pull zhu7charlie/cz-mars-rover
    $ docker run zhu7charlie/cz-mars-rover

To use Docker CLI:

cd ProjectRoot-onDockerWindow (e.g. MINGW64 ~/workspace/mavenMarsRover)

$ docker build -f Dockerfile -t zhu7charlie/cz-mars-rover .

$ docker images

$ docker run zhu7charlie/cz-mars-rover
