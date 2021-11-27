# -- Dockerfile --
# 这个文件负责构建包含你的程序的 Docker 容器

# 使用 Java 16
FROM openjdk:17
# 向容器内复制文件
COPY ./ /app/
# 编译程序
WORKDIR /app/
RUN mkdir out
RUN javac -encoding utf-8 -cp :./antlr-4.9.2-complete.jar -d ./out ./src/gen/*.java
RUN javac -encoding utf-8 -cp :./antlr-4.9.2-complete.jar:./out -d ./out ./src/dataStructure/*.java
RUN javac -encoding utf-8 -cp :./antlr-4.9.2-complete.jar:./out -d ./out ./src/tools/*.java
RUN javac -encoding utf-8 -cp :./antlr-4.9.2-complete.jar:./out -d ./out ./src/*.java
