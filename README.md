[![NPM](https://img.shields.io/npm/l/react)](https://github.com/lucarauj/api-rest-entrega-de-mercadoria/blob/main/LICENSE)

<h1 align="center"> Criação de API Rest com Java e Spring </h1>
<h2 align="center"> Operação de Logística </h2>

<p align="center"><img width="200px" src="https://github.com/lucarauj/assets/blob/main/ApiJavaSpring.png" /></p>

### O Projeto consiste no Desenvolvimento de uma aplicação de entrega de mercadoria: Operação de logística envolvendo clientes, entregas e ocorrências;

### ❌ Conceitos importantes:

- API - Application Programming Interface (Interface de Programação de uma Aplicação)

- Web Services - API que fornece sua interface de comunicação pela web

- REST - Representational State Transfer: estilo arquitetural para desenvolver web services.

- URI - Uniform Resource Identifier: Identificador de Recurso Uniforme.

- JPA - Java Persistence API: representa uma simplificação do modelo de programação de persistência. 
A especificação JPA define explicitamente o mapeamento relacional de objetos, em vez de depender das implementações de mapeamento específicas do fornecedor. 
A JPA padroniza a importante tarefa de mapeamento relacional de objetos utilizando anotações ou o XML para mapear objetos para uma ou mais tabelas de um banco de dados.


### ⚙ Dependências utilizadas:

- Spring Web
- Spring Data Jpa
- Lombok
- Mysql
- Flyway
- Validation
- ModelMapper
- Springdoc

### 🛠 Dependência para receber XML na requisição:

```
<dependency>
 <groupId>com.fasterxml.jackson.dataformat</groupId>
 <artifactId>jackson-dataformat-xml</artifactId>
</dependency>
```

### ⚙ Gerando arquivo Fat JAR:

- Run AS
- Maven build
- Goals: clean package
- Run
- target java -jar {nome do arquivo JAR}

```
Postman 👉 Headers 👉 Accept 👉 application/xml
```

### ❌ Utilizando o Postman:

<img width="800px" src="https://github.com/lucarauj/api-rest-entrega-de-mercadoria/blob/main/image/Postman.png"/>

### ✔ Utilizando o Swagger:

<img width="800px" src="https://github.com/lucarauj/api-rest-entrega-de-mercadoria/blob/main/image/Swagger.png"/>
<img width="800px" src="https://github.com/lucarauj/api-rest-entrega-de-mercadoria/blob/main/image/Swagger%20Schema.png"/>


### 📝 Anotações utilizadas no projeto:

- @Autowired: delega ao Spring Boot a inicialização do objeto;
- @AllArgsConstructor: fornece a criação de um construtor com todos os atributos;
- @Bean: utilizada em métodos de uma classe, geralmente marcada com @Configuration, indicando ao Spring Framework que deve invocar aquele método e gerenciar o objeto retornado por ele; 
- @Component: faz com que o bean registrado no Spring possa ser utilizado em qualquer bean, seja ele um serviço, um DAO, um controller, etc;
- @Column: usada para especificar o mapeamento entre um atributo de entidade básico e a coluna da tabela de banco de dados; 
- @ConvertGroup(from = Default.class, to = ValidationGroups.{parâmetro}.class: converte de um "validation group" para outro;
- @Configuration: define uma classe como fonte de definições de beans; 
- @ControllerAdvice: é uma especialização da anotação @Component, que permite manipular exceções em todo o aplicativo em um componente global;
- @DeleteMapping: usada para mapear solicitações HTTP DELETE em métodos manipuladores específicos;
- @Email: valida se a propriedade anotada é um e-mail válido;
- @Embeddable: usada para especificar tipos incorporáveis. Como os tipos básicos, os tipos incorporáveis não tem identidade, sendo gerenciados por sua entidade proprietária;
- @Embedded: usada para especificar que um determinado atributo de entidade representa um tipo incorporável; 
- @Enumerated(EnumType.STRING): armazena na coluna do parâmetro na tabela a String que representa a constante da enumeração;
- @Entity: utilizada para informar que uma classe também é uma entidade;
- @ExceptionHandler: parâmetro recebe a exceção a ser tratada;
- @EqualsAndHashCode: método equals e hashCode são gerados automaticamente para os campos do objeto; 
- @GetMapping: usada para mapear solicitações HTTP GET em métodos manipuladores específicos;
- @Getter: permite a criação automática do método Getter para todos os atributos da classe; 
- @GenerationValue(GenerationType.IDENTITY): informa ao provedor de persistência que os valores a serem atribuídos ao identificador único serão gerados pela coluna de auto incremento do banco de dados;
- @Id: especifica o identificador da entidade, que é usado ao carregar a entidade em um determinado contexto de persistência;
- @JsonInclude(Include.NON_NULL): inclui apenas as propriedades não nulas;
- @JsonProperty(access = READ_ONLY): indica que o parâmetro aceita somente leitura;
- @ManyToOne: indica que temos um relacionamento muitos-para-um;
- @NotNull: checa se o valor anotado não é nulo (null); 
- @NotBlank: um atributo do tipo String não pode ser nulo e nem vazio; 
- @OneToMany(mappedBy = "nome propridedade do relacionamento", cascade = CascadeType.ALL): indica que temos um relacionamento um-para-muitos;
- @PathVariable: indica que o valor da variável virá de uma informação da rota; 
- @PostMapping: usada para mapear solicitações HTTP POST em métodos específicos de manipulador;
- @PutMapping: usada para mapear solicitações HTTP PUT em métodos manipuladores específicos;
- @RestController: marca a classe como um controlador onde cada método retorna um objeto de domínio em vez de uma visão;
- @RequestMapping: usada para mapear solicitações da web para classes manipuladoras específicas e métodos manipuladores;
- @RequestBody: indica que o valor do objeto virá do corpo da requisição;
- @Repository: serve para definir uma classe como pertencente à camada de persistência;
- @ResponseStatus(HttpStatus.CREATED)
- @ResponseStatus(HttpStatus.NO_CONTENT)
- @Service: marca uma classe Java que executa algum serviço; 
- @Setter: permite a criação automática do método Setter para todos os atributos da classe;
- @Size: confere se a quantidade de elementos está entre o mínimo e o máximo, suportando tipos como: Strings, Collections, Maps e arrays; 
- @Transactional: utilizada nos métodos que precisam de transação;
- @Valid: indica que o valor do objeto virá do corpo da requisição;

## 🚀 Tecnologias

Esse projeto foi desenvolvido com as seguintes tecnologias:
<div style="display: inline_block"><br>
<img align="center" alt="Lucarauj-Java" height="50" width="60" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg">
<img align="center" alt="Lucarauj-Postman" height="60" width="110" src="https://github.com/lucarauj/assets/blob/main/postman.png">
<img align="center" alt="Lucarauj-Spring" height="40" width="50" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg">
<img align="center" alt="Lucarauj-Postgresql" height="50" width="60" src="https://github.com/lucarauj/assets/blob/main/postgresql.svg">
          
</div>

## Aluno

Lucas Araujo

<a href="https://www.linkedin.com/in/lucarauj"><img alt="lucarauj | LinkdeIN" width="40px" src="https://user-images.githubusercontent.com/43545812/144035037-0f415fc7-9f96-4517-a370-ccc6e78a714b.png" /></a>
