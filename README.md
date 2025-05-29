Este projeto é uma API REST desenvolvida em Java com Spring Boot, seguindo o padrão arquitetural MVC, com objetivo de gerenciar os pagamentos mensais realizados por jogadores em campeonatos de futebol.

Estrutura da Aplicação
Jogador: representa um jogador que realiza pagamentos mensais.
Pagamento: representa o pagamento realizado por um jogador.

As entidades estão relacionadas da seguinte forma:
Um jogador pode realizar vários pagamentos (relação um-para-muitos).
Um pagamento pertence a apenas um jogador (relação muitos-para-um).

Camada Repository
Foi utilizada a interface JpaRepository do Spring Data para criar repositórios que permitem salvar, consultar e deletar jogadores e pagamentos sem a necessidade de escrever SQL manualmente.

Camada Service
Os serviços encapsulam a lógica de negócio e são responsáveis por coordenar o acesso aos dados e validar operações. Eles são chamados pelos controladores.

Controladores (Controllers)
São responsáveis por receber as requisições HTTP e responder com os dados apropriados. 
Para Jogadores:
GET /jogadores → Lista todos os jogadores
POST /jogadores → Cadastra um novo jogador
GET /jogadores/{id} → Busca um jogador pelo ID

Para Pagamentos:
GET /pagamentos → Lista todos os pagamentos
POST /pagamentos → Cadastra um novo pagamento
GET /pagamentos/{id} → Busca um pagamento pelo ID
GET /jogadores/{id}/pagamentos → Lista todos os pagamentos de um jogador específico

Como Testar a API
Você pode testar os endpoints usando:
->Postman
->Insomnia
->curl
Ou qualquer ferramenta de teste de API REST

Conclusão
Esse projeto demonstra um exemplo simples de API REST utilizando Spring Boot e JPA. Ele permite o cadastro de jogadores e o registro de seus pagamentos mensais, 
om um modelo relacional bem definido e boa separação de responsabilidades em camadas (modelo, repositório, serviço e controlador). A interface gráfica não é necessária, 
pois toda a comunicação ocorre via API HTTP.
