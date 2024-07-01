### 3.3.5 Processo 5 – Busca e Contratação de Freelancers

# Resumo da Modelagem de Processo

## 1. Introdução
Este documento apresenta um resumo da modelagem de processo relacionada à busca e contratação de Freelancers na plataforma SkillMatch, conforme ilustrado no diagrama de processos.

## 2. Busca por Freelancer
Nessa etapa, o contratante procura por freelancers com as qualidades e habilidades desejadas, utilizando filtros de busca.

## 3. Seleção do Freelancer
Nessa etapa, um gateway inclusivo verificará se o perfil do freelancer está de acordo com os filtros de busca, envia convites e revisa as propostas recebidas. Assim, com todas essas etapas cumpridas, ele seleciona o freelancer desejado.

## 4.  Negociação, revisão e aprovação
Nessa etapa, os termos de contratação são negociados entre o freelancer e o contratante, o contrato em si é revisado, e a proposta é aprovada.

## 5.  Fechamento do contrato
O processo termina com a forma oval “Fim”, após passar por um gateway. Caso as etapas citadas anteriormente tenham sido cumpridas, o contrato é fechado. Caso contrário, o processo volta para a etapa de revisão, até que tudo esteja dentro dos conformes.

## 6. Descrição do processo
### Preenchimento dos filtros de busca
- **Ação:** O Contratante preenche os filtros de busca, incluindo informações que ele julgar necessário para encontrar o freelancer adequado.
### Busca por freelancer
- **Ação:** Após o preenchimento dos filtros, o sistema busca por freelancers que condizem com os filtros utilizados.
- **Condição:** Deve existir pelo menos um registro de freelancer para que a busca haja resultados.
### Seleção de freelancer
- **Ação:** Após encontrar um freelancer adequado, ele é selecionado pelo contratante, e o processo de contratação avança para a etapa seguinte.
### Fechamento de contrato
- **Condição:** As etapas anteriores devem ter sido cumpridas, além da negociação de termos, revisão do contrato e aprovação final.
- **Resultado:** O contrato é efetivado com sucesso.
## 6. Conclusão
Este fluxo de processo assegura que o freelancer a ser contratado condiz com o que o contratante busca, e que o contratante permite que o freelancer atue com o que ele deseja.

![Busca e Contratação de Freelancers](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2024-1-ti2-1381100-skillmatch/assets/103903195/5cd9fb4d-be96-4975-8d39-44c23dde69ab)

#### Detalhamento das atividades
#### Campos

| **Campo**       | **Tipo**         | **Restrições** |
| ---             | ---              | ---            |
| Procurar        | Caixa de Texto   | Máximo de 512 caracteres, alfanumérico, a-z, A-Z, 0-9, caracteres especiais |

#### Comandos
| **Número**       | **Nome**         | **Ação** | **Restrições** |
| ---             | ---              | ---            | ---            |
| 1           | Botão Filtros   | O sistema exibe uma lista de filtros para auxiliar na pesquisa | |
| 2           | Botão Pesquisar   | O sistema busca resultados semelhantes ao texto digitado pelo usuário | Deve ser digitado algo para que seja possível a pesquisa   |
| 3           | Botão Efetivar Contrato   | O sistema efetiva a contratação do freelancer pelo contratante | Deve haver uma requisição de um freelancer para realizar contratação   |
