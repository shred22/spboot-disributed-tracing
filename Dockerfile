FROM openjdk:11-jre
MAINTAINER Shreyas Dange
VOLUME /tmp
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
EXPOSE 8080/tcp
ENTRYPOINT ["java","-cp","app:app/lib/*","-Dspring.profiles.active=docker","com.spboot.tracing.distributed.SpbootDistributedTracingApplication"]