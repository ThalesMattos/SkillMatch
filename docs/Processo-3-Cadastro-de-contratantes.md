### 3.3.3 Processo 3 – Cadastro de Contratantes

# Resumo da Modelagem de Processo

## 1. Introdução
Este documento apresenta um resumo da modelagem de processo relacionada ao cadastro de Contratantes na plataforma SkillMatch, conforme ilustrado no diagrama de processos.

## 2. Cadastro do Contratante
A próxima etapa é o “Cadastro do Contratante”. Isso envolve a coleta de informações sobre o Contratante, como nome, email, etc.

## 3. Detalhes Incorretos e Detalhes Corretos
Existem dois pontos de decisão representados por diamantes. Um deles é “Detalhes Incorretos” e o outro é “Detalhes Corretos”. Esses pontos indicam que o processo diverge com base nas respostas. Se os detalhes estiverem incorretos, o processo seguirá um caminho diferente do que se os detalhes estiverem corretos.

## 4. Contratante Cadastrado na Plataforma: 
O processo termina com a forma oval “Fim”, indicando que o Contratante foi cadastrado com sucesso na plataforma.

## 5. Descrição do Processo
### Preenchimento do Perfil
- **Ação:** O Contratante preenche os detalhes do perfil, incluindo informações pessoais, descrição do perfil, áreas de atuação de sua empresa, etc.
### Verificação das Informações
- **Ação:** Após o preenchimento dos dados, verifica-se se as informações  foram preenchidas corretamente.
- **Condição:** Se as informações não estiverem preenchidas corretamente, o processo requer uma correção.
### Correção de Informações
- **Ação:** Se os detalhes estiverem incorretos, o processo retorna ao passo de cadastro para que o Contratante possa corrigir as informações.
### Cadastro Concluído
- **Condição:** Se as habilidades e demais informações estiverem corretas, o Contratante é cadastrado na plataforma.
- **Resultado:** O cadastro do Contratante é concluído com sucesso.
## 6. Conclusão
Este fluxo de processo assegura que as informações dos Contratantes sejam precisas e completas antes de serem registradas na plataforma SkillMatch. Isso melhora a qualidade dos dados e garante que a plataforma tenha informações confiáveis sobre os Contratantes cadastrados.

![Cadastrar Contratantes](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2024-1-ti2-1381100-skillmatch/assets/103903195/3c3cefaf-cbb7-47c1-9450-e5547af7f249)

#### Detalhamento das atividades
#### Campos

| **Campo**       | **Tipo**         | **Restrições** |
| ---             | ---              | ---            |
| Nome de usuário           | Caixa de Texto   | Máximo de 50 caracteres, alfanumérico, 0-9, A-Z , obrigatório preencher |
| E-mail           | Caixa de Texto   | Mínimo de 8 caracteres, obrigatório preencher, deve conter um '@' e um '.' |
| Senha           | Caixa de Texto   | Mínimo de 8 caracteres, alfanumérico, 0-9, A-Z ,obrigatório preencher, deve conter no minimo uma letra maiúscula, uma minúscula, um caractere especial |

#### Comandos
| **Número**       | **Nome**         | **Ação** | **Restrições** |
| ---             | ---              | ---            | ---            |
| 1           | Botão de Cadastro   | O sistema salva as informações fornecidas | Campos inseridos corretamente, todos os campos preenchidos   |
