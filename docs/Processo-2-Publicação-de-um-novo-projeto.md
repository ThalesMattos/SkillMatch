### 3.3.2 Processo 2 – Publicação de um novo projeto

# Resumo da Modelagem de Processo

### Etapas do Processo

## 1. Criação de um Novo Projeto
**Descrição:** Esta é a fase inicial onde o cliente inicia a criação de um novo projeto dentro do sistema SkillMatch.

## 2. Preenchimento dos detalhes do Projeto
**Descrição:** Nesta etapa, o cliente preenche todos os detalhes necessários do projeto, como escopo, requisitos, prazos, e orçamento.

#### Verificação dos Detalhes Preenchidos
**Descrição:** Após o preenchimento, o sistema verifica se todos os detalhes do projeto estão corretos.

**Possíveis Resultados:**
- **Detalhes Incorretos:** Se os detalhes não estiverem corretos, o sistema indica que há erros que precisam ser corrigidos. O cliente então retorna a esta etapa para ajustar as informações conforme necessário.
- **Detalhes Corretos:** Se todos os detalhes estiverem corretos, o sistema prossegue para a próxima etapa.

## 3. Publicação do Projeto
**Descrição:** Uma vez que todos os detalhes estejam corretos e verificados, o projeto é publicado na plataforma, tornando-o visível para os freelancers.

### Componentes Visuais
- **Início/Fim:** O processo é representado visualmente com linhas verdes e vermelhas indicando o início e o término do processo, respectivamente.
- **Decisão:** Um losango amarelo é utilizado para representar a tomada de decisão sobre a correção dos detalhes do projeto.
- **Banco de Dados:** Um cilindro cinza é usado para simbolizar o armazenamento dos detalhes do projeto em um banco de dados.

---

![Publicação de Projetos](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2024-1-ti2-1381100-skillmatch/assets/103903195/9774b154-4f68-4779-9baa-6dd34ef3e600)

#### Detalhamento das atividades

#### Campos

| **Campo**       | **Tipo**         | **Restrições** |
| ---             | ---              | ---            |
| Título           | Caixa de Texto   | Máximo de 64 caracteres, obrigatório preencher, deve estar de acordo como registrado no cadastro, alfanumérico a-z, A-Z, 0-9, espaços, caracteres especiais |
| Descrição           | Caixa de Texto   | Máximo de 512 caracteres, obrigatório preencher, alfanumérico a-z, A-Z, 0-9 , espaços, caracteres especiais |
| Categoria           | Caixa de Seleção   | Deve escolher uma Categoria |
| Orçamento           | Caixa de Texto   | Deve inserir um valor mínimo e máximo disponível para orçamento |
| Prazo           | Data   | campo do tipo data (dd-mm-aaaa) |

#### Comandos
| **Número**       | **Nome**         | **Ação** | **Restrições** |
| ---             | ---              | ---            | ---            |
| 1           | Botão Alterar imagem   | O sistema solicita o envio de uma imagem para o usuário, após envio ele altera a imagem do projeto no sistema | A imagem deve ter no mínimo 500x500px e o formato JPEG ou PNG   |
| 2           | Botão Publicar   | O sistema salva as informações enviadas e publica o projeto para que outros usuários possam visualizar | Todos os campos devem ser preenchidos corretamente   |

