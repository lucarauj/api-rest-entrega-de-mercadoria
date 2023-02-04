REST APIs com Spring

API - Application Programming Interface (Interface de Programação de uma Aplicação)
Web Services - API que fornece sua interface de comunicação pela web

REST - Representational State Transfer: estio arquitetural para desenvolver web services.

URI - Uniform Resource Identifier: Identificador de Recurso Uniforme.

JPA - Java Persistence API: representa uma simplificação do modelo de programação de persistência. 
A especificação JPA define explicitamente o mapeamento relacional de objetos, em vez de depender das implementações de mapeamento específicas do fornecedor. 
A JPA padroniza a importante tarefa de mapeamento relacional de objetos utilizando anotações ou o XML para mapear objetos para uma ou mais tabelas de um banco de dados.

## O Projeto consiste no Desenvolvimento de uma aplicação de entrega de mercadoria: logística;

### Dependências utilizadas no projeto:

- Spring Web
- Spring Data Jpa
- Lombok
- Mysql
- Flyway
- Validation
- ModelMapper

### Gerando arquivo Fat JAR:

- Run AS
- Maven build
- Goals: clean package
- Run
- target java -jar {nome do arquivo JAR}

### Utilizando o Postman

#### Clientes

- POST Clientes - cadastrar
- GET Clientes - listar
- GET Clientes - listar id
- PUT Clientes - atualizar
- DEL Clientes - excluir

#### Entregas

- POST Entregas - solicitar
- GET Entregas - listar
- GET Entregas - listar id
- PUT Entregas - finalizar

#### Ocorrências

- POST Ocorrências - registrar
- GET Ocorrências - listar


### Dependência para receber XML na requisição
```
<dependency>
 <groupId>com.fasterxml.jackson.dataformat</groupId>
 <artifactId>jackson-dataformat-xml</artifactId>
</dependency>
```

Postman -> Headers -> Accept -> application/xml


### Anotações utilizadas:

- @Autowired
- @AllArgsConstructor
- @Bean
- @Component
- @Column
- @ConvertGroup(from = Default.class, to = ValidationGroups.{parâmetro}.class: converte de um "validation group" para outro;
- @Configuration
- @ControllerAdvice
- @Email
- @Embeddable
- @Embedded
- @Enumerated(EnumType.STRING): armazena na coluna do parâmetro na tabela a String que representa a constante da enumeração;
- @Entity
- @ExceptionHandler
- @EqualsAndHashCode
- @GetMapping
- @Getter
- @GenerateValue(IDENTITY)
- @Id
- @JsonInclude(Include.NON_NULL): inclui apenas as propriedades não nulas
- @JsonProperty(access = READ_ONLY): indica que o parâmetro aceita somente leitura;
- @ManyToOne
- @NotNull
- @NotBlank
- @OneToMany(mappedBy = "nome propridedade do relacionamento", cascade = CascadeType.ALL)
- @PathVariable
- @PostMapping
- @PutMapping
- @RestController
- @RequestMapping
- @RequestBody
- @Repository
- @ResponseStatus(HttpStatus.CREATED)
- @ResponseStatus(HttpStatus.NO_CONTENT)
- @Service
- @Setter
- @Size
- @Transactional
- @Valid





