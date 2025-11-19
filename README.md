# Trabalho — Engenharia de Software II

**Autores:** Enzo Lauxen Stefanello e Eduarda Rubin  
**Disciplina:** Engenharia de Software II  
**Professor:** Miguel Xavier

---

# Microsserviços — Currency Report & Currency History

Este projeto implementa dois microsserviços integrados via Eureka Naming Server, API Gateway e Docker Compose, incluindo um pipeline básico de CI.

---

## Como subir o ambiente

Para iniciar todos os serviços:

```bash
docker compose up --build
```

---

## Testes via curl (direto nos microsserviços)

### Currency Report
```bash
curl http://localhost:8100/health
curl "http://localhost:8100/quote?from=USD&to=BRL"
```

### Currency History
```bash
curl http://localhost:8101/health
curl "http://localhost:8101/history?from=USD&to=BRL"
```

---

## Testes via API Gateway

### Currency Report
```bash
curl http://localhost:8080/currency-report/health
curl "http://localhost:8080/currency-report/quote?from=USD&to=BRL"
```

### Currency History
```bash
curl http://localhost:8080/currency-history/health
curl "http://localhost:8080/currency-history/history?from=USD&to=BRL"
```

---

## Pipeline CI (GitHub Actions)

O pipeline executa:

- build  
- test  
- docker build  

Arquivo de configuração:

```
.github/workflows/ci.yml
```
