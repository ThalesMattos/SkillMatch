### 3.3.1 Processo 1 – Cadastro de Freelancers

# Resumo da Modelagem de Processo

## 1. Introdução
Este documento apresenta um resumo da modelagem de processo relacionada ao cadastro de freelancers na plataforma SkillMatch, conforme ilustrado no diagrama de processos.

## 2. Descrição do Processo

### Início do Processo
- **Passo Inicial:** O processo começa com o cadastro do freelancer na plataforma.

### Preenchimento do Perfil
- **Ação:** O freelancer preenche os detalhes do perfil, incluindo informações pessoais, habilidades, área de atuação, e portfólio.

### Verificação das Habilidades
- **Ação:** Após o preenchimento dos dados, verifica-se se as informações sobre as habilidades foram preenchidas corretamente.
- **Condição:** Se as habilidades não estão preenchidas corretamente, o processo requer uma correção das informações.

### Correção de Informações
- **Ação:** Se os detalhes estiverem incorretos, o processo retorna ao passo de cadastro para que o freelancer possa corrigir as informações.

### Cadastro Concluído
- **Condição:** Se as habilidades e demais informações estiverem corretas, o freelancer é cadastrado na plataforma.
- **Resultado:** O cadastro do freelancer é concluído com sucesso.

## 3. Conclusão
Este fluxo de processo assegura que as informações dos freelancers sejam precisas e completas antes de serem registradas na plataforma SkillMatch. Isso melhora a qualidade dos dados e garante que a plataforma tenha informações confiáveis sobre os freelancers cadastrados.

## 4. Anexo: Diagrama do Processo
*Este documento descreve o processo de cadastro em formato textual, que pode ser complementado por um diagrama visual para melhor entendimento.*


![Cadastrar Freelancers](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2024-1-ti2-1381100-skillmatch/assets/103903195/be7f7684-1d00-41e2-b586-fb7d999d29cc)

#### Detalhamento das atividades

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
