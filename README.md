# Microsserviços — Currency Report & Currency History

Este projeto implementa dois microsserviços integrados via Eureka Naming Server, API Gateway e Docker Compose, incluindo um pipeline básico de CI.

---

## Como subir o ambiente

```bash
docker compose up --build

Testes via curl

Currency Report
curl http://localhost:8100/health
curl "http://localhost:8100/quote?from=USD&to=BRL"

Currency History
curl http://localhost:8101/health
curl "http://localhost:8101/history?from=USD&to=BRL"

Testes via API Gateway

Currency Report
curl http://localhost:8080/currency-report/health
curl "http://localhost:8080/currency-report/quote?from=USD&to=BRL"

Currency History
curl http://localhost:8080/currency-history/health
curl "http://localhost:8080/currency-history/history?from=USD&to=BRL"

Pipeline CI (GitHub Actions)
O pipeline executa:

build

test

docker build

Arquivo de configuração: .github/workflows/ci.yml
