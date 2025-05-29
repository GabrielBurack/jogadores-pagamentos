# 🏆 API de Gerenciamento de Pagamentos de Jogadores

## Alunos
- Gabriel Burack Rosa 
- João Elias Annes de Assis

Este projeto é uma **API REST** desenvolvida em **Java** com **Spring Boot**, seguindo o padrão arquitetural **MVC**, com o objetivo de gerenciar os **pagamentos mensais** realizados por jogadores em campeonatos de futebol.

---

## 📦 Estrutura da Aplicação

### 🧍 Jogador
Representa um jogador que realiza pagamentos mensais.

### 💳 Pagamento
Representa o pagamento realizado por um jogador.

### 🔗 Relacionamento entre entidades
- Um **jogador** pode realizar **vários pagamentos** (relação *um-para-muitos*).
- Um **pagamento** pertence a apenas **um jogador** (relação *muitos-para-um*).

---

## 🗃️ Camadas da Aplicação

### 📁 Repository
Utiliza a interface `JpaRepository` do **Spring Data**, permitindo:
- Salvar
- Consultar
- Deletar jogadores e pagamentos  
Tudo isso sem necessidade de escrever SQL manualmente.

### 🧠 Service
Camada responsável por:
- Encapsular a lógica de negócio
- Validar operações
- Coordenar o acesso aos dados

Esses serviços são utilizados pelos controladores.

### 🌐 Controllers
Responsáveis por lidar com as requisições HTTP e retornar as respostas apropriadas.

#### **Jogadores**
- `GET /jogadores` → Lista todos os jogadores  
- `POST /jogadores` → Cadastra um novo jogador  
- `GET /jogadores/{id}` → Busca um jogador pelo ID  

#### **Pagamentos**
- `GET /pagamentos` → Lista todos os pagamentos  
- `POST /pagamentos` → Cadastra um novo pagamento  
- `GET /pagamentos/{id}` → Busca um pagamento pelo ID  
- `GET /jogadores/{id}/pagamentos` → Lista todos os pagamentos de um jogador específico  

---

## 🧪 Como Testar a API

Você pode testar os endpoints utilizando ferramentas como:

- [Postman](https://www.postman.com/)
- [Insomnia](https://insomnia.rest/)
- `curl` via terminal
- Qualquer outra ferramenta de testes para APIs REST

---

## ✅ Conclusão

Este projeto demonstra um exemplo simples e funcional de uma **API REST** utilizando **Spring Boot** e **JPA**.  
Permite o cadastro de jogadores e o registro de seus pagamentos mensais, com:

- Modelo relacional bem definido
- Boa separação de responsabilidades em camadas:
  - Modelo
  - Repositório
  - Serviço
  - Controlador

> **Nota**: A interface gráfica não é necessária, pois toda a comunicação ocorre via **API HTTP**.
