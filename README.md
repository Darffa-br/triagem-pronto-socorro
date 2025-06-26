# Sistema de Triagem de Pronto Socorro

## Requisitos

Antes de executar o projeto, verifique se você tem:

- [Java 17 JDK](https://adoptium.net/en-GB/)
- [Maven](https://maven.apache.org/) instalado (ou use o wrapper `mvnw`)
- [Visual Studio Code (VS Code)](https://code.visualstudio.com/)
- Extensões recomendadas no VS Code:
  - [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
  - [Maven for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-maven)
  - (Opcional) [Spring Boot Extension Pack](https://marketplace.visualstudio.com/items?itemName=Pivotal.vscode-spring-boot)

---

## Execução no VS Code

### Passo 1 – Abrir o projeto
1. Extraia o ZIP do projeto.
2. No VS Code, clique em `File > Open Folder` e selecione a pasta `triagem-pronto-socorro`.

### Passo 2 – Adicionar ou verificar a classe principal

Certifique-se de que o arquivo `TriagemApplication.java` existe:

📄 `src/main/java/com/triagem/TriagemApplication.java`

```java
package com.triagem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TriagemApplication {
    public static void main(String[] args) {
        SpringApplication.run(TriagemApplication.class, args);
    }
}
```

> Ponto de entrada da aplicação Spring Boot.

---

### Passo 3 – Rodar o projeto

Você pode rodar de duas maneiras:

 A) Pelo terminal:

Abra o terminal no VS Code (`Ctrl + \``) e digite:

```bash
./mvnw spring-boot:run
```

Ou, se estiver no Windows:

```bash
mvn spring-boot:run
```

B) Pelo menu lateral:

1. Vá até a aba **"Run and Debug"** 
2. Clique em `Run` na classe `TriagemApplication`

---

Endpoints disponíveis

- `GET /health` – Verifica se o sistema está online
- `POST /triagem` – Cadastra um paciente
- `POST /medicos` – Cadastra um médico
- `PUT /medicos/{id}/plantao?emPlantao=true` – Atualiza status de plantão do médico
- `GET /pacientes/{id}` – Consulta paciente pelo ID
- `GET /atendimento/proximo` – Retorna o próximo paciente a ser atendido

---

Acessar o banco de dados (H2 Console)

- URL: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- JDBC URL: `jdbc:h2:mem:triagem`
- Usuário: `sa`
- Senha: *(deixe em branco)*
