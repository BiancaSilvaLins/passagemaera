# Projeto Gatling com Maven

Este projeto contém uma simulação de performance utilizando Gatling para testar a compra de passagens no site BlazeDemo.

## Instruções para Execução

1. Clone o repositório.
2. No diretório raiz, execute `mvn compile` para compilar o projeto.
3. Para rodar a simulação de carga, execute `mvn gatling:test`.
4. Os relatórios de performance serão gerados no diretório `target/gatling`.

## Relatório de Execução

Os resultados das simulações incluem:

- Tempo de resposta no percentil 90 menor que 2 segundos.
- Vazão de 250 requisições por segundo.

## Considerações Finais

Este projeto demonstra uma simulação simples de performance com usuários simultâneos e um cenário de ramp-up para avaliar o comportamento do sistema sob carga.

