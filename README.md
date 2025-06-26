# triagem-pronto-socorro

## Requisitos
- Java 17
- Maven

## Execução
```bash
./mvnw spring-boot:run
```

## Endpoints REST
- `GET /health`
- `POST /triagem`
- `POST /medicos`
- `PUT /medicos/{id}/plantao?emPlantao=true`
- `GET /pacientes/{id}`
- `GET /atendimento/proximo`

## Banco H2
- Console: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:triagem`
