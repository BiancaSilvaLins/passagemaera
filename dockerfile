FROM hseeberger/scala-sbt:11.0.13_1.9.8_2.12.18

WORKDIR /app

COPY . /app

RUN sbt compile

CMD ["sbt", "gatling:test"]
