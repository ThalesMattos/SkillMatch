<p align="center">
  <img width="150" height="150" src="https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2024-1-ti2-1381100-skillmatch/blob/main/docs/images/InterfaceUsuario/logoSkillMatch.png">
  </p>
  
<h1 align="center" style="margin-top: 0px;">Projeto de Interface SkillMatch</h1>

<br>


> [!NOTE]
> Explore os detalhes das telas do SkillMatch neste documento. Desde o cadastro e login de usuários até a publicação e busca de projetos, além da personalização do perfil do freelancer. Encontre aqui uma visão detalhada das interfaces e seus elementos, simplificando o entendimento e a colaboração no desenvolvimento deste projeto.
>
> * [Link para o Figma contendo todas as telas](https://www.figma.com/file/i8DzDK3gZ9k5G7A9pFYZIX/Projeto-de-Interface-SkillMatch?type=design&node-id=1%3A2&mode=design&t=8QRviYGn1uTVQ838-1)
<br>

## Interface de Cadastro de Usuário
![](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2024-1-ti2-1381100-skillmatch/blob/main/docs/images/InterfaceUsuario/InterfaceDeCadastro.png)
#### Campos

| **Campo**       | **Tipo**         | **Restrições** |
| ---             | ---              | ---            |
| Nome de usuário           | Caixa de Texto   | Máximo de 50 caracteres, alfanumérico, 0-9, A-Z , obrigatório preencher |
| E-mail           | Caixa de Texto   | Mínimo de 8 caracteres, obrigatório preencher, deve conter um '@' e um '.' |
| Senha           | Caixa de Texto   | Mínimo de 8 caracteres, alfanumérico, 0-9, A-Z ,obrigatório preencher, deve conter no minimo uma letra maiúscula, uma minúscula, um caractere especial |
| Tipo de Cadastro           | Caixa de seleção   | Obrigatório preencher  |

#### Comandos
| **Número**       | **Nome**         | **Ação** | **Restrições** |
| ---             | ---              | ---            | ---            |
| 1           | Botão de Cadastro   | O sistema salva as informações fornecidas | Campos inseridos corretamente, todos os campos preenchidos   |

---
## Interface de Login de Usuário
![](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2024-1-ti2-1381100-skillmatch/blob/main/docs/images/InterfaceUsuario/InterfaceDeLogin.png)
#### Campos

| **Campo**       | **Tipo**         | **Restrições** |
| ---             | ---              | ---            |
| Nome de usuário           | Caixa de Texto   | Máximo de 50 caracteres, obrigatório preencher, deve estar de acordo como registrado no cadastro |
| Senha           | Caixa de Texto   | Mínimo de 8 caracteres, obrigatório preencher, deve estar de acordo como registrado no cadastro |

#### Comandos
| **Número**       | **Nome**         | **Ação** | **Restrições** |
| ---             | ---              | ---            | ---            |
| 1           | Botão de Login   | O sistema compara as informações inseridas para entrar em uma conta registrada | O nome de usuário e a senha devem ser compativeis com um login cadastrado no sistema    |
| 2           | Botão Cadastrar   | O usuário é enviado para a tela de cadastro | |

---
## Interface de Publicação de Projetos
![](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2024-1-ti2-1381100-skillmatch/blob/main/docs/images/InterfaceUsuario/InterfaceDePublica%C3%A7%C3%A3oDeProjetos.png)
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

---
## Interface de Busca de Projetos Publicados
![](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2024-1-ti2-1381100-skillmatch/blob/main/docs/images/InterfaceUsuario/InterfaceDeBuscaDeProjetosPublicados.png)
#### Campos

| **Campo**       | **Tipo**         | **Restrições** |
| ---             | ---              | ---            |
| Procurar           | Caixa de Texto   | Máximo de 512 caracteres, alfanumérico a-z, A-Z, 0-9, espaços, caracteres especiais |

#### Comandos
| **Número**       | **Nome**         | **Ação** | **Restrições** |
| ---             | ---              | ---            | ---            |
| 1           | Botão Filtros   | O sistema exibe uma lista de filtros para auxiliar na pesquisa |  |
| 2           | Botão Pesquisar   | O sistema procura resultados semelhantes ao texto digitado pelo usuário | Deve ser digitado algo para que seja possível a pesquisa  |

---
## Interface de Personalização de Perfil do Freelancer
![](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2024-1-ti2-1381100-skillmatch/blob/main/docs/images/InterfaceUsuario/InterfaceDePersonaliza%C3%A7%C3%A3oDePerfilDoFreelancer.png)
#### Campos

| **Campo**       | **Tipo**         | **Restrições** |
| ---             | ---              | ---            |
| Nome          | Caixa de Texto   | Máximo de 128 caracteres, obrigatório preencher, automaticamente preenchido quando registrado no cadastro, pode ser alterado, alfanumérico a-z, A-Z, 0-9, espaços, caracteres especiais |
| Descrição breve           | Caixa de Texto   | Máximo de 128 caracteres, alfanumérico a-z, A-Z, 0-9 , espaços, caracteres especiais |
| Biografia          | Caixa de Texto   | Máximo de 512 caracteres, alfanumérico a-z, A-Z, 0-9 , espaços, caracteres especiais |
| Competências          | Caixa de Texto   | Mínimo de 4 caracteres por competência, alfanumérico a-z, A-Z, 0-9 , espaços, caracteres especiais, apertar enter para salvar cada competência, campo obrigatório |

#### Comandos
| **Número**       | **Nome**         | **Ação** | **Restrições** |
| ---             | ---              | ---            | ---            |
| 1           | Botão Alterar imagem   | O sistema solicita o envio de uma imagem para o usuário, após envio ele altera a imagem do perfil no sistema | A imagem deve ter no mínimo 500x500px e o formato JPEG ou PNG   |
| 2           | Botão Salvar   | O sistema salva as informações enviadas e publica o perfil do Freelancer para que outros usuários possam visualizar | Todos os campos devem ser preenchidos   |
