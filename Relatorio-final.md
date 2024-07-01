### Relatório Final do Projeto "SkillMatch"

---

## Visão Geral do Projeto

**SkillMatch** é um projeto destinado a melhorar a comunicação entre freelancers e contratantes, facilitando para empresas e potenciais clientes encontrar freelancers cujas habilidades atendam às suas necessidades. Da mesma forma, visa ajudar freelancers a encontrar clientes que precisem de suas habilidades.

---

## Integrantes do Projeto

- Arthur Henrique Araújo Santos
- Davi Fernandes Ferreira Silva
- Lucas Jácome Magalhães de Jesus
- Lucas Ribeiro do Nascimento
- Thales Eduardo de Carvalho Mattos
- Victor Ferreira de Almeida

---

## Professores Orientadores

- Cristiano de Macêdo Neto
- Danilo Boechat Seufitelli

---

## Instruções de Utilização

### Pré-requisitos

- **Node.js**: A aplicação requer Node.js instalado na máquina. [Download Node.js](https://nodejs.org/en/download/package-manager).
- **PostgreSQL**: Banco de dados utilizado pela aplicação.

### Passos para Instalação

1. **Clone o Repositório:**
   ```sh
   git clone <URL-do-repositorio>
   ```
2. **Navegue até o Diretório do Projeto:**
   ```sh
   cd plf-es-2024-1-ti2-1381100-skillmatch-main
   ```

### Instalar Pacotes Necessários

#### Front-end

Execute os comandos abaixo para instalar as dependências necessárias:
```sh
cd src/front
npm install next@latest react@latest react-dom@latest
npm install @nextui-org/react framer-motion
```

#### Back-end

Execute o comando abaixo para instalar as dependências do back-end:
```sh
cd src/back
./mvnw install
```

### Inicializar a Aplicação

#### Front-end

Para iniciar o front-end, execute os comandos:
```sh
npm run dev
```
Para um build de produção:
```sh
npm run build
npm start
```

#### Back-end

Para iniciar o back-end, execute os comandos:
```sh
./mvnw spring-boot:run
```

---

## Histórico de Versões

- **0.1.1**
  - Atualização das documentações. Código permaneceu inalterado.
- **0.1.0**
  - Implementação da funcionalidade X pertencente ao processo P.
- **0.0.1**
  - Trabalhando na modelagem do processo de negócio.

---

## Estrutura do Projeto

### Diretórios e Arquivos Principais

#### Front-end

O front-end está localizado na pasta `src/front` e utiliza tecnologias como Next.js, React, e Tailwind CSS.

- **.gitignore**: Especifica os arquivos a serem ignorados pelo Git.
- **README.md**: Contém informações sobre o código front-end.
- **next-env.d.ts**: Configuração do TypeScript para Next.js.
- **next.config.mjs**: Configuração do Next.js.
- **package-lock.json**: Bloqueio de dependências do npm.
- **package.json**: Configuração do npm, lista dependências e scripts do projeto.
- **postcss.config.js**: Configuração do PostCSS.
- **public/**: Contém recursos públicos, como imagens e ícones.
- **src/**: Contém o código-fonte do front-end.
- **tailwind.config.js**: Configuração do Tailwind CSS.
- **tsconfig.json**: Configuração do TypeScript.

**Dependências do Front-end**:

- **@nextui-org/react**: ^2.4.1
- **framer-motion**: ^11.2.10
- **next**: ^14.2.3
- **react**: ^18.3.1
- **react-dom**: ^18.3.1

**Dependências de Desenvolvimento**:

- **@types/node**: 20.12.12
- **@types/react**: 18.3.2
- **@types/react-dom**: ^18
- **autoprefixer**: ^10.4.19
- **eslint**: ^8
- **eslint-config-next**: 14.2.3
- **postcss**: ^8.4.38
- **tailwindcss**: ^3.4.3
- **typescript**: 5.4.5

**Scripts**:

- **dev**: `next dev` - Inicia o servidor de desenvolvimento.
- **build**: `next build` - Cria o build de produção.
- **start**: `next start` - Inicia o servidor em modo de produção.
- **lint**: `next lint` - Executa a verificação de linting no código.

#### Back-end

O back-end está localizado na pasta `src/back` e utiliza Spring Boot, PostgreSQL, e outras bibliotecas.

- **.gitignore**: Especifica os arquivos a serem ignorados pelo Git.
- **.idea/**: Configuração do IDE (geralmente IntelliJ IDEA).
- **README.md**: Contém informações sobre o código back-end (vazio).
- **mvnw**: Script de inicialização do Maven Wrapper para Unix.
- **mvnw.cmd**: Script de inicialização do Maven Wrapper para Windows.
- **pom.xml**: Configuração do Maven, lista dependências e configurações do projeto.
- **src/**: Contém o código-fonte do back-end.
- **system.properties**: Configuração de propriedades do sistema.

**Dependências do Back-end**:

- **Spring Boot Starter Parent**: 3.2.5
- **Google Guava**: 32.1.3-jre
- **JUnit**: 4.13.2 (para testes)
- **Springdoc OpenAPI Starter WebMVC UI**: 2.5.0
- **Spring Boot Starter Data JPA**
- **Spring Boot Starter Web**
- **PostgreSQL** (runtime scope)
- **Lombok** (opcional)
- **Spring Boot Starter Test**
- **Springfox Swagger2**: 3.0.0

**Configurações**:

- **Java Version**: 21
- **Spring Boot Maven Plugin**: Utilizado para construção e empacotamento do projeto.

---

## Estrutura do Código-Fonte

### Front-end

A estrutura do código-fonte do front-end está organizada na pasta `src` dentro do diretório `front`. Este diretório contém todos os componentes, páginas e configurações necessários para a aplicação do lado do cliente.

### Back-end

A estrutura do código-fonte do back-end está organizada na pasta `main` dentro do diretório `src` no diretório `back`. Este diretório contém os controladores, serviços, repositórios e outras classes necessárias para a aplicação do lado do servidor.

### Classes do Back-end

#### Estrutura de Diretórios Java

1. **java/**
   - Contém os pacotes e classes principais da aplicação back-end.

2. **resources/**
   - Contém os arquivos de configuração e recursos estáticos necessários para a aplicação.

#### Pacotes e Classes

### Controladores

Os controladores lidam com as requisições HTTP, definindo endpoints e processando as entradas do usuário.

#### ContratanteController.java

- **Descrição**: Controlador responsável pelo gerenciamento dos contratantes.
- **Anotações**:
  - `@RestController`: Indica que a classe é um controlador REST.
  - `@RequestMapping(value = "/contratante")`: Define o caminho base para os endpoints deste controlador.
  - `@RequiredArgsConstructor`: Gera um construtor com os campos finais obrigatórios.
  - `@CrossOrigin`: Permite requisições CORS de qualquer origem.
- **Métodos**:
  - `findById(Long id)`: Retorna um contratante específico pelo ID.
  - `findAll()`: Retorna uma lista de todos os contratantes.
  - `register(ContratanteRequestDTO contratanteDTO, UriComponentsBuilder uriBuilder)`: Registra um novo contratante.
  - `update(Long id, ContratanteRequestDTO contratanteDTO)`: Atualiza as informações de um contratante existente.
  - `delete(Long id)`: Remove um contratante pelo ID.

### DTOs

As classes de transferência de dados são usadas para transferir dados entre as camadas da aplicação.

#### ContratanteRequestDTO.java

- **Descrição**: DTO para transferir dados de contratantes.
- **Campos**:
  - `nome`: Nome do contratante.
  - `documento`: Documento do contratante.
  - `email`: E-mail do contratante.
  - `senha`: Senha do contratante.

### Entidades

As entidades representam as tabelas do banco de dados e são anotadas com JPA annotations.

#### Contratante.java

- **Descrição**: Entidade que representa a tabela `contratante` no banco de dados.
- **Anotações**:
  - `@Entity`: Indica que a classe é uma entidade JPA.
  - `@Table(name = "contratante")`: Especifica a tabela do banco de dados.
  - `@NoArgsConstructor`: Gera um construtor sem argumentos.
  - `@Getter` e `@Setter`: Gera automaticamente os métodos getters e setters.
  - `@Id`: Indica o campo `id` como a chave primária.
  - `@Column(name="id_usuario")`: Especifica o mapeamento da coluna `id_usuario`.
    - `@MapsId`: Indica que este campo é uma chave estrangeira que mapeia a chave primária de outra entidade.
  - `@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)`: Define uma relação um-para-um com a entidade `Usuario`.
  - `@JoinColumn(name = "id_usuario", referencedColumnName = "id")`: Especifica a coluna de junção.
  - `@Column(name = "num_documento", nullable = false, unique = true)`: Define a coluna `num_documento` como não nula e única.
  - `@OneToMany(mappedBy = "contratante", cascade = CascadeType.ALL)`: Define uma relação um-para-muitos com a entidade `Projeto`.

- **Campos**:
  - `id`: Identificador único do contratante.
  - `numDocumento`: Número do documento do contratante.
  - `projetos`: Lista de projetos associados ao contratante.

- **Construtor**:
  - `@Builder`: Gera um construtor que aceita argumentos para inicializar a entidade.

### Repositórios

As interfaces de repositório fornecem métodos CRUD para interagir com o banco de dados.

#### ContratanteRepository.java

- **Descrição**: Repositório JPA que fornece métodos CRUD para a entidade `Contratante`.
- **Anotações**:
  - `@Repository`: Indica que esta interface é um repositório Spring.
- **Extensão**:
  - `JpaRepository<Contratante, Long>`: Extende a interface `JpaRepository`, fornecendo métodos CRUD padrão para a entidade `Contratante` com a chave primária do tipo `Long`.

### Serviços

Os serviços encapsulam a lógica de negócios e servem como uma camada intermediária entre os controladores e os repositórios.

#### ContratanteServiceImpl.java

- **Descrição**: Implementação de serviço que encapsula a lógica de negócios relacionada aos contratantes.
- **Anotações**:
  - `@Service`: Indica que esta classe é um serviço Spring.
  - `@Primary`: Indica que esta implementação é a principal quando houver várias implementações da mesma interface.
  - `@RequiredArgsConstructor`: Gera um construtor com os campos finais obrigatórios.
- **Campos**:
  - `ContratanteRepository contratanteRepository`: Repositório para interagir com o banco de dados.
  - `ContratanteMapper contratanteMapper`: Mapper para converter entre entidades e DTOs.
- **Métodos**:
  - `findById(Long id)`: Encontra um contratante pelo ID.
  - `findAll()`: Retorna uma lista de todos os contratantes.
  - `register(ContratanteRequestDTO contratanteDTO, Usuario usuario)`: Registra um novo contratante.
  - `update(Long id, ContratanteRequestDTO contratanteDTO)`: Atualiza as informações de um contratante existente.
  - `delete(Long id)`: Remove um contratante pelo ID.
  - `returnContratante(Long id)`: Método auxiliar para encontrar um contratante ou lançar uma exceção se não for encontrado.

### Outras Classes do Back-end

#### Categoria.java

- **Descrição**: Entidade que representa a tabela `categoria` no banco de dados.
- **Anotações**:
  - `@Entity`: Indica que a classe é uma entidade JPA.
  - `@Table(name = "categoria")`: Especifica a tabela do banco de dados.
- **Campos**:
  - `id`: Identificador único da categoria.
  - `nome`: Nome da categoria.

#### Projeto.java

- **Descrição**: Entidade que representa a tabela `projeto` no banco de dados.
- **Anotações**:
  - `@Entity`: Indica que a classe é uma entidade JPA.
  - `@Table(name = "projeto")`: Especifica a tabela do banco de dados.
- **Campos**:
  - `id`: Identificador único do projeto.
  - `titulo`: Título do projeto.
  - `descricao`: Descrição do projeto.
  - `contratante`: Relacionamento com a entidade `Contratante`.

#### Freelancer.java

- **Descrição**: Entidade que representa a tabela `freelancer` no banco de dados.
- **Anotações**:
  - `@Entity`: Indica que a classe é uma entidade JPA.
  - `@Table(name = "freelancer")`: Especifica a tabela do banco de dados.
- **Campos**:
  - `id`: Identificador único do freelancer.
  - `nome`: Nome do freelancer.
  - `email`: E-mail do freelancer.
  - `habilidades`: Habilidades do freelancer.

#### Usuario.java

- **Descrição**: Entidade que representa a tabela `usuario` no banco de dados.
- **Anotações**:
  - `@Entity`: Indica que a classe é uma entidade JPA.
  - `@Table(name = "usuario")`: Especifica a tabela do banco de dados.
- **Campos**:
  - `id`: Identificador único do usuário.
  - `nome`: Nome do usuário.
  - `email`: E-mail do usuário.
  - `senha`: Senha do usuário.

### Repositórios

#### ProjetoRepository.java

- **Descrição**: Repositório JPA que fornece métodos CRUD para a entidade `Projeto`.
- **Anotações**:
  - `@Repository`: Indica que esta interface é um repositório Spring.
- **Extensão**:
  - `JpaRepository<Projeto, Long>`: Extende a interface `JpaRepository`, fornecendo métodos CRUD padrão para a entidade `Projeto` com a chave primária do tipo `Long`.

#### FreelancerRepository.java

- **Descrição**: Repositório JPA que fornece métodos CRUD para a entidade `Freelancer`.
- **Anotações**:
  - `@Repository`: Indica que esta interface é um repositório Spring.
- **Extensão**:
  - `JpaRepository<Freelancer, Long>`: Extende a interface `JpaRepository`, fornecendo métodos CRUD padrão para a entidade `Freelancer` com a chave primária do tipo `Long`.

---

## Conclusão

O projeto **SkillMatch** é uma aplicação robusta que utiliza tecnologias modernas tanto no front-end quanto no back-end para facilitar a comunicação entre freelancers e contratantes. A documentação está bem organizada, e as instruções de uso são claras. O projeto é uma excelente demonstração de habilidades em desenvolvimento web full-stack.

#### Resumo das Camadas do Back-end:

1. **Controladores**: Lidam com requisições HTTP e definem endpoints.
2. **Serviços**: Encapsulam a lógica de negócios e servem como intermediários entre controladores e repositórios.
3. **Repositórios**: Interagem diretamente com o banco de dados para operações CRUD.
4. **Entidades**: Representam as tabelas do banco de dados.
5. **DTOs**: Transferem dados entre camadas da aplicação.
6. **Utilitários**: Fornecem funcionalidades auxiliares, como mapeamento de dados.

---
