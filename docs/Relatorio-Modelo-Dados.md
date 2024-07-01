# Relatório do Modelo de Dados da Aplicação SkillMatch

## 1. Introdução
Este relatório descreve o modelo de dados da aplicação SkillMatch, focando nas entidades principais (`Freelancer`, `Categoria`, `Contratante` e `Projeto`), suas propriedades, e as relações entre elas. O objetivo é fornecer uma visão clara da estrutura de dados utilizada na aplicação.

## 2. Entidades e Atributos

### 2.1. Entidade Freelancer
- **Descrição:** Representa um freelancer registrado na plataforma.
- **Atributos:**
  - `id`: Identificador único do freelancer.
  - `numDocumento`: Número de documento do freelancer.
  - `dataNascimento`: Data de nascimento do freelancer.
  - `descricao`: Descrição sobre o freelancer.
  - `areaAtuacao`: Área de atuação do freelancer.
  - `habilidades`: Habilidades do freelancer.
  - `portfolio`: Link para o portfólio do freelancer.

### 2.2. Entidade Categoria
- **Descrição:** Representa uma categoria de projetos.
- **Atributos:**
  - `id`: Identificador único da categoria.
  - `nome`: Nome da categoria.
  - `descricao`: Descrição da categoria.

### 2.3. Entidade Contratante
- **Descrição:** Representa um contratante registrado na plataforma.
- **Atributos:**
  - `id`: Identificador único do contratante.
  - `numDocumento`: Número de documento do contratante.
  - `projetos`: Lista de projetos associados ao contratante.

### 2.4. Entidade Projeto
- **Descrição:** Representa um projeto cadastrado na plataforma.
- **Atributos:**
  - `id`: Identificador único do projeto.
  - `titulo`: Título do projeto.
  - `descricao`: Descrição detalhada do projeto.
  - `prazo`: Data limite para a entrega do projeto.
  - `orcamento`: Orçamento estimado para a execução do projeto.
  - `categoria`: Categoria à qual o projeto pertence.
  - `contratante`: Contratante que cadastrou o projeto.

## 3. Relações entre as Entidades

### 3.1. Relação entre Projeto e Categoria
- **Tipo:** Muitos-para-um (Many-to-One)
- **Descrição:** Um projeto pertence a uma única categoria, mas uma categoria pode ter vários projetos associados a ela.

### 3.2. Relação entre Projeto e Contratante
- **Tipo:** Muitos-para-um (Many-to-One)
- **Descrição:** Um projeto é cadastrado por um único contratante, mas um contratante pode cadastrar vários projetos.
- **Detalhes:** Na classe `Projeto`, a relação é representada por uma referência ao `Contratante`. Na classe `Contratante`, a relação é representada por uma lista de `Projeto`.

## 4. Conclusão
O modelo de dados da aplicação SkillMatch está estruturado para suportar o cadastro e gerenciamento de freelancers, contratantes, categorias e projetos. As relações entre as entidades são bem definidas, permitindo uma navegação eficiente entre os dados e garantindo a integridade referencial. Este modelo serve como base para as operações CRUD e outras funcionalidades da aplicação.
