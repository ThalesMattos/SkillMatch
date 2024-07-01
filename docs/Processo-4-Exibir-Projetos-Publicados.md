### 3.3.4 Processo 4 – Exibir Projetos Publicados

# Resumo da Modelagem de Processo

## 1. Introdução
Este documento apresenta um resumo da modelagem de processo relacionada à exibição de projetos para freelancers na plataforma SkillMatch, conforme ilustrado no diagrama de processos.

## 2. Login do Freelancer
- **Ação:** Nessa etapa, o freelancer faz login na plataforma SkillMatch para acessar a tela de pesquisa de projetos.

## 3. Acesso à Tela de Pesquisa
- **Ação:** Após o login bem-sucedido, o freelancer é direcionado para a tela de pesquisa, onde pode buscar projetos disponíveis.

## 4. Inserção de Critérios de Pesquisa
- **Ação:** O freelancer insere termos na caixa de pesquisa e/ou seleciona filtros específicos para refinar a busca de projetos.

## 5. Iniciar Pesquisa
- **Ação:** O freelancer aciona a pesquisa clicando no botão "Iniciar Pesquisa".
- **Condição:** Deve haver pelo menos um critério de pesquisa inserido.

## 6. Verificação dos Critérios de Pesquisa
- **Ação:** O sistema SkillMatch verifica se os critérios de pesquisa foram inseridos corretamente.
- **Condição:** Se não houver critérios, o sistema solicita que o freelancer insira algum critério.

## 7. Consulta ao Banco de Dados
- **Ação:** Se os critérios de pesquisa são válidos, o sistema envia uma consulta ao banco de dados para buscar projetos correspondentes.

## 8. Exibição dos Resultados
- **Ação:** O sistema recebe os dados do banco de dados e exibe os projetos que correspondem aos critérios de pesquisa do freelancer.
- **Resultado:** O freelancer visualiza os projetos que correspondem aos critérios de pesquisa.

## 9. Conclusão
Este fluxo de processo assegura que o freelancer pode encontrar projetos de forma eficiente e que os projetos exibidos atendem aos critérios de pesquisa especificados pelo freelancer.


![Exibição de Projetos Publicados](https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2024-1-ti2-1381100-skillmatch/blob/eeb21a1335fe3054db5b678fa1f53d49202d430b/docs/Modelagem%20do%20Processo/Exibir%20Projetos%20Publicados.png)


#### Detalhamento das atividades
#### Campos

| **Campo**       | **Tipo**         | **Restrições** |
| ---             | ---              | ---            |
| Procurar           | Caixa de Texto   | Máximo de 512 caracteres, alfanumérico a-z, A-Z, 0-9, espaços, caracteres especiais |

#### Comandos
| **Número**       | **Nome**         | **Ação** | **Restrições** |
| ---             | ---              | ---            | ---            |
| 1           | Botão Filtros   | O sistema exibe uma lista de filtros para auxiliar na pesquisa |  |
| 2           | Botão Pesquisar   | O sistema procura resultados semelhantes ao texto digitado pelo usuário | Deve ser digitado algo para que seja possível a pesquisa  |
