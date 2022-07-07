# springboot-ionic-backend

    Este é o repositório de backend do projeto de implementação de um sistema de compra de produtos 
### Arquitetura do Projeto:

* Config: Classes de configuração do projeto, como tipo de  persistência a ser usada;   
* Domain: Classes que representam objetos do bando de dados;   
* DTO: Objetos utilizados para fazer requisições;  
* Repositories: São as interfaces que realizaram consultas no banco de dados;  
* Exceptions: API REST do projeto junto com classes úteis e tratamento de execeção;  
* Security: Classes úteis para fornecer segurança de acesso aos endpoints da aplicação;
Services: Contém classes com regras de negócio junto com classes úteis e que acessam os repositories.

## Endpoints atuais disponíveis 
### H2  
* /h2-console - GET: Acesso ao bando de dados H2
Clientes  

### clientes

* /clientes - GET: Obtém todos os clientes;
* /clientes/{id} - GET: Obtém um cliente por id

* /clientes/{id} - POST: Cadastro de cliente  

* /clientes/{id} - PUT: Atualização de cliente por id

* /clientes/{id} - DELETE: Deleção de cliente por id

### categorias
* /categorias - GET: Obtém todos as categorias

* /categorias - POST: Cadastro de categoria
* /categorias/{id} - GET: Obtém uma categoria por id
* /categorias/{id} - PUT: Atualização de categoria por id
* /categorias/{id} - DELETE: Deleção de categoria por id

### pedidos
* /pedidos/{id} - GET: Obtém todos um pedido por id
* /pedidos/{id} - POST: Cadastra um pedido por id

### produtos
* /produtos/{id} - GET: Obtém um pedido

