FROM openjdk:19
ADD target/PortfolioBack-0.0.1-SNAPSHOT.jar PortfolioBack-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/PortfolioBack-0.0.1-SNAPSHOT.jar"]

CMD ["/bin/sh"]
