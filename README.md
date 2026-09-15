ATIVIDADE 01 — Fluxo cliente e servidor

Primeiro o cliente envia um request em HTTP, depois o back-end recebe e faz o processamento dele, depois o cliente recebe a resposta

ATIVIDADE 02 — Responsabilidades do back-end

1-Primeiro o back-end recebe as requisições do cliente
2-Depois transforma essa requisição em um objeto no java
3-depois ele vai verificar as regras de negócio
4-salva, deleta, atualiza o curso
5-manda uma resposta para o cliente

ATIVIDADE 03 — Contrato inicial da API

As operações que a API deve fazer no gerenciamento do curso é ter o método HTTP para a conversação do cliente com o back-end, os 5 endpoints que são:
GET /CURSOS que lista todos os cursos
GET CURSUS{ID} que busca os cursos por id
POST /cursos Cadastrar um curso
PUT /cursos/{id} Atualizar um curso
DELETE /cursos/{id} Remover um curso

ATIVIDADE 04 — Projeto no Spring Initializr
ATIVIDADE 05 — Estrutura e configuração do projeto
Feitas no código

o pom.xml é tipo uma lista de materiais e o MAVEN cuida para obter.
src/main/java é onde fica o código em JAVA
classe com @SpringBootApplication- é a classe principal da aplicação
application.properties- é onde fica as configurações da aplicação

ATIVIDADE 06 — Beans e injeção de dependência
ATIVIDADE 07 — Model e conversão JSON
ATIVIDADE 08 — CRUD em memória
ESSAS 3 EU JÁ COMMITEI 

ATIVIDADE 09 — Testes HTTP
https://drive.google.com/drive/folders/1BXLLZStPfyx_lNvLSkY-jnpxG8sMmobw?hl=pt-br

ATIVIDADE 10 — Organização dos pacotes
Já estão organizados 

ATIVIDADE 11 — Repository em memória
ATIVIDADE 12 — Regras no Service
ATIVIDADE 13 — Banco e configuração da conexão
ATIVIDADE 14 — Entity e JpaRepository
Estão feitas E COMMITADAS NO GIT

ATIVIDADE 15 — Comprovação da persistência
https://drive.google.com/drive/folders/1WMsAqPx3AW3dyxUE8WFedgKKUOAXlU9B?hl=pt-br
