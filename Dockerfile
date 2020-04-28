# 指定基础镜像
FROM openjdk:8-jre-alpine
# 重命名
ADD ["/target/*.jar","movie-front.jar"]
# 设置时区
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

# 对外暴露端口号
EXPOSE 8080
# 运行
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/movie-front.jar"]

