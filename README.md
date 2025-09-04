# CP1JAVA - Sistema de Gerenciamento de Importação de Mercadorias

## 📖 Descrição
CP1JAVA é um sistema simples e eficiente desenvolvido em **Java** para gerenciar o processo de importação de mercadorias. Utilizando **Spring Boot** e **Thymeleaf**, o projeto oferece uma solução prática para organizar e acompanhar as etapas da importação, com uma interface web amigável e funcionalidades essenciais para o controle de dados.

## 🚀 Funcionalidades
- 📋 Cadastro e gerenciamento de mercadorias.
- 📊 Acompanhamento do status do processo de importação.
- 🖥️ Interface web intuitiva para entrada e consulta de dados, construída com Thymeleaf.
- 📈 Relatórios básicos para visualização de informações.

## 🛠️ Tecnologias Utilizadas
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)

- **Linguagem**: Java (JDK 17 ou superior)
- **Framework**: Spring Boot
- **Template Engine**: Thymeleaf
- **Ferramentas**: IntelliJ IDEA, Eclipse ou outra IDE compatível
- **Gerenciamento de Dependências**: Maven

## ⚙️ Como Executar o Projeto
### Pré-requisitos
- Java JDK 17 ou superior instalado.
- Maven instalado para gerenciamento de dependências.
- Git instalado para clonar o repositório.

### Passos para Instalação
1. Clone o repositório:
   ```bash
   git clone https://github.com/Guilherme-Pelissari/CP1JAVA.git
   ```
2. Acesse o diretório do projeto:
   ```bash
   cd CP1JAVA
   ```
3. Compile e execute com Maven:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```
### Acessar no Navegador
- **Aplicação**: [http://localhost:8080/importacoes](http://localhost:8080/importacoes)
- **Console H2**: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
  - **JDBC URL**: `jdbc:h2:mem:importacoesdb`
  - **User**: `sa`
  - **Password**: (vazio)

## 📁 Estrutura do Projeto
```
CP1JAVA/
├── src/
│   ├── main/
│   │   ├── java/               # Código-fonte Java
│   │   ├── resources/          # Arquivos de configuração e templates Thymeleaf
│   └── test/                   # Testes do projeto
├── pom.xml                     # Configuração do Maven
├── README.md                   
```


## 📬 Contato
Para dúvidas ou sugestões, entre em contato com [Guilherme Pelissari](https://github.com/Guilherme-Pelissari).
