# Detalhamento das atividades #

**1. Contratante publica um projeto, que chega até um freelancer com perfil adequado**

Tarefas necessárias:

* Criação do perfil na plataforma.
* Preencher os detalhes do projeto, incluindo título, descrição, categoria, prazo e orçamento.
* Confirmar e publicar o projeto.
  
**Criação do perfil**

| **Campo**       | **Tipo**         | **Restrições** |
| ---             | ---              | ---            |
| Nome de usuário           | Caixa de Texto   | Máximo de 50 caracteres, alfanumérico, 0-9, A-Z , obrigatório preencher |
| E-mail           | Caixa de Texto   | Mínimo de 8 caracteres, obrigatório preencher, deve conter um '@' e um '.' |
| Senha           | Caixa de Texto   | Mínimo de 8 caracteres, alfanumérico, 0-9, A-Z ,obrigatório preencher, deve conter no minimo uma letra maiúscula, uma minúscula, um caractere especial |
| Tipo de Cadastro           | Caixa de seleção   | Obrigatório preencher  |

**Publicação do projeto**

| **Campo**       | **Tipo**         | **Restrições** |
| ---             | ---              | ---            |
| Título do projeto           | Caixa de Texto   | máximo de 100 caracteres |
| Descrição do Projeto           | Caixa de Texto   | máximo de 255 caracteres |
| Categoria           | Seleção múltipla   | Campo obrigatório |
| Prazo           | Data   | campo do tipo data (dd-mm-aaaa) |
| Orçamento da Contratação          | Caixa de Texto   | máximo de 25 caracteres |

---

**2. Freelancer cria um perfil com suas características profissionais, que servirá para alcançar possíveis clientes**

Tarefas necessárias:

* Criação do perfil na plataforma.
* Preencher os detalhes do perfil com caracteristicas profissionais, incluindo descrição do perfil, área de atuação, habilidades específicas, link para portfólio em site externo, etc.
* Salvar o Perfil para que ele seja publicado para alcançar os clientes.

**Detalhamento do Perfil**

| **Campo**       | **Tipo**         | **Restrições** |
| ---             | ---              | ---            |
| Descrição do perfil           | Caixa de Texto   | máximo de 255 caracteres |
| Área de atuação           | Caixa de Texto   | mínimo de 20 caracteres |
| Habilidades específicas           | Caixa de Texto   | mínimo de 255 caracteres |
| Link para portfólio em site externo           | Link   | deve ser uma URL |

---

**3. Freelancer submete suas propostas, que serão avaliadas pelo Contratante**

Tarefas necessárias:

* Criação do perfil na plataforma.
* Preencher os detalhes do perfil.
* Selecionar projeto publicado por um Contratante.
* Enviar proposta no projeto para o Contratante.

---

**4. Freelancer negocia os termos e condições com o Contratante**

Tarefas necessárias:

* Contratante aceita proposta do Freelancer.
* Contratante entra em contato com o Freelancer.
* Freelancer e Contratante negociam os termos, prazos e condições.
* Freelancer e Contratante fecham um acordo, realizando a contratação.

---

**5. Freelancer realiza o trabalho acordado, e recebe seu pagamento vindo do Contratante**

Tarefas necessárias:

* Freelancer conclui o trabalho solicitado.
* Contratante confirma que o trabalho foi concluido.
* O pagamento é enviado para o Freelancer.
