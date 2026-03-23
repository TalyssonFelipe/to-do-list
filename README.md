API de lista de tarefas

Sobre o Projeto

API RESTful desenvolvida com Java 21 e Spring Boot para gerenciamento de tarefas. Estruturada com arquitetura em camadas, integração com PostgreSQL, uso de H2 para testes automatizados e documentação interativa com Swagger.

Arquitetura Completa do Projeto

Cliente (Swagger / Postman / Testes) Controlador (Camada REST) ​​Serviço (Regras de Negócio) Repositório (JPA / Hibernate) Banco de Dados PostgreSQL (desenvolvimento) H2 (testes em memória) Estrutura organizada com separação clara de responsabilidades.

Órfão Utilizado

Java 21
Spring Boot 3;
Web da Primavera;
Spring Data JPA;
Hibernar;
PostgreSQL;
Banco de dados H2;
Swagger / OpenAPI;
Cliente de teste da Web;
Maven.
Funcionalidades

Criar tarefa;
Listar tarefas;
Atualizar tarefa;
Remover tarefa;
Ordenação por prioridade;
Validação de campos obrigatórios;
Documentação automática da API.
Testes Automatizados

A aplicação possui testes de integração utilizando Spring Boot Test e WebTestClient;
Valida:- Criação de tarefa com sucesso- Requisição inválida retornando 400- Estrutura e conteúdo do JSON- Persistência utilizando banco H2 em memória;
Banco de Dados;
Produção/Desenvolvimento: PostgreSQL;
Testes: Banco de dados H2 (em memória).
bolsos Aplicados

Programação Orientada a Objetos;
Arquitetura REST;
Arquitetura em Camadas;
Inversão de cabeça;
Injeção de Dependência;
ORM com JPA/Hibernate;
Validação de Bean (JSR-380);
Testes de Integração;
Separação de Ambientes (Dev/Test);
Documentação com OpenAPI.
Autor Felipe Talysson Pereira Macedo.
