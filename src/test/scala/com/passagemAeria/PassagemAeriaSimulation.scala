package com.passagemAeria

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class GatlingSimulation extends Simulation {

  val httpProtocol = http
    .baseUrl("https://www.blazedemo.com") // URL base para o teste
    .acceptHeader("text/html") // Cabeçalho de aceitação

  val scn = scenario("Compra de Passagem Aérea")
    .exec(
      http("Comprar Passagem")
        .get("/")
        .check(status.is(200))
    )
    .pause(2) // Pausa de 2 segundos entre as execuções

  setUp(
    scn.inject(
      atOnceUsers(10), // Simular 10 usuários imediatamente
      rampUsers(240).during(60.seconds) // Ramp-up para 240 usuários em 60 segundos
    )
  ).protocols(httpProtocol)
}
