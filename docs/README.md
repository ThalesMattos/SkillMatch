# SKILLMATCH


**Arthur Henrique Araújo Santos, arthurhsantos2020@gmail.com**

**Davi Fernandes Ferreira Silva, davif127@gmail.com**

**Lucas Jácome Magalhães de Jesus, lucas.jacome66@gmail.com**

**Lucas Ribeiro do Nascimento, learn_02@hotmail.com**

**Thales Eduardo de Carvalho Mattos, thalescarvalho622@gmail.com**

**Victor Ferreira de Almeida, victorferreiralmeida@gmail.com**

---

Professores:

**Prof. Cristiano de Macêdo Neto**

**Prof. Danilo Boechat Seufitelli**

---

_Curso de Engenharia de Software_

_Instituto de Informática e Ciências Exatas – Pontifícia Universidade Católica de Minas Gerais (PUC MINAS), Belo Horizonte – MG – Brasil_

---

_**Resumo**. O SkillMatch é um software dedicado a aprimorar a comunicação entre contratantes e profissionais freelancers, visando a facilitar a busca e seleção dos melhores perfis para ambas as partes._

---


## 1. Introdução

Plataforma de contato entre freelancers e contratantes.

### 1.1 Contextualização

Nos últimos anos, o mercado de trabalho tem passado por significativas transformações impulsionadas pela ascensão da economia digital e da globalização. Uma tendência notável nesse cenário é o crescimento exponencial do trabalho freelancer ou autônomo. Segundo pesquisa realizada pela plataforma de freelancers Upwork e pela Freelancers Union, em 2020, cerca de 36% da força de trabalho nos Estados Unidos era composta por freelancers, representando um aumento de 22% desde 2019 (Upwork & Freelancers Union, 2020).

Nesse contexto, surge a necessidade de aprimorar os processos de comunicação entre contratantes e freelancers, a fim de garantir a eficiência na busca e seleção de profissionais qualificados para os projetos. Muitas vezes, contratantes e freelancers enfrentam desafios na identificação mútua de expectativas, habilidades necessárias e disponibilidade, o que pode resultar em atrasos, insatisfação e até mesmo falha na conclusão dos projetos.

Assim, este trabalho propõe o desenvolvimento de um software voltado para melhorar a comunicação entre contratantes e profissionais freelancers. O objetivo é criar uma plataforma que facilite a conexão entre as partes, permitindo uma busca eficiente e uma seleção criteriosa dos melhores perfis para cada projeto específico.

### 1.2 Problema

No contexto dinâmico do mercado de trabalho freelancer, um dos principais desafios enfrentados tanto por contratantes quanto por profissionais freelancers é a dificuldade em encontrar o perfil mais adequado para cada projeto. Muitas vezes, a comunicação inicial é limitada a poucas trocas de mensagens e informações dispersas, o que pode levar a mal-entendidos, expectativas não atendidas e até mesmo ao fracasso do projeto.

Imagine um cenário comum: um pequeno empresário precisa contratar um designer gráfico freelancer para criar a identidade visual de sua nova marca. Ele posta o projeto em uma plataforma de freelancers, recebe várias propostas de diferentes profissionais, cada um com seu próprio conjunto de habilidades e experiência. O empresário fica sobrecarregado ao tentar comparar os perfis, portfólios e preços de cada freelancer. Por outro lado, os freelancers podem se sentir perdidos ao tentar entender exatamente o que o cliente deseja, resultando em propostas que não estão alinhadas com as expectativas do contratante.

Este problema não é isolado. Uma pesquisa conduzida pela Global Workplace Analytics revelou que 53% dos profissionais freelancers consideram a comunicação com os clientes como um dos principais desafios de trabalhar remotamente (Global Workplace Analytics, 2021). Portanto, é evidente a necessidade de uma solução que facilite essa comunicação, tornando o processo de seleção e contratação mais eficiente e transparente para ambas as partes envolvidas.

### 1.3 Objetivo geral

Como objetivo geral, visamos aprimorar e/ou facilitar a comunicação entre empresas que procuram profissionais autônomos (freelancers) e tais profissionais, buscando facilitar para os contratantes a procura por profissionais que atendem especificamente às suas demandas, bem como facilitar para os profissionais freelancers a encontrar trabalhos que fazem parte do seu nicho e escopo profissional.

#### 1.3.1 Objetivos específicos

Como objetivos específicos, temos alguns pontos que nos permitirão aprofundar nosso entendimento sobre o projeto, os quais incluem:
- Análise das necessidades de comunicação: Investigar as principais lacunas na comunicação entre contratantes e freelancers, identificando os pontos de atrito mais comuns que levam atrasos ou falhas nos projetos;
- Levantamento das expectativas: Pesquisar as expectativas de contratantes e freelancers em relação à comunicação durante o processo de seleção e execução dos projetos, destacando as principais áreas de desalinhamento;
- Identificação de habilidades críticas: Analisar as habilidades mais demandadas pelos contratantes e as habilidades mais valorizadas pelos freelancers, a fim de desenvolver critérios de seleção mais precisos na plataforma;
- Avaliação da satisfação do usuário: Conduzir estudos de satisfação do usuário para avaliar a eficácia da plataforma em melhorar a comunicação entre contratantes e freelancers, bem como identificar áreas para futuras melhorias;
- Avaliação da eficácia das plataformas existentes: Investigar as plataformas de comunicação entre contratantes e freelancers já existentes, analisando suas características, pontos fortes e fraquezas para identificar oportunidades de melhoria;
- Implementação de recursos de busca avançada: Pesquisar e desenvolver algoritmos e recursos de busca que permitam aos contratantes encontrar rapidamente os freelancers mais adequados com base em critérios como habilidades, experiência e disponibilidade.

### 1.4 Justificativas

- Demanda Crescente: Com a necessidade de contratar um freelancer, há uma demanda crescente por ferramentas que facilitem a comunicação entre contratantes e freelancers para otimizar a seleção e execução de projetos. Como citado na pesquisa da Upwork, “Em 2019, 45% dos freelancers relataram realizar algum tipo de serviço especializado como parte de seu trabalho independente. No entanto, em 2021, observamos que o percentual de freelancers que oferecem serviços especializados aumentou para 53%, um aumento de 8 pontos percentuais nos últimos dois anos.”
- Identificação precisa das habilidades necessárias para cada projeto específico: Muitas vezes, os contratantes têm dificuldade em encontrar freelancers com as habilidades exatas necessárias para seus projetos, enquanto freelancers podem encontrar dificuldades em destacar suas habilidades de maneira eficaz para os projetos adequados. Isso pode levar a uma seleção inadequada de profissionais e resultar em projetos mal sucedidos ou incompletos. A plataforma proposta visa resolver esse problema, facilitando a correspondência entre as habilidades dos freelancers e as necessidades dos contratantes.

## 2. Participantes do processo

### Processos por parte do contratante:
- Publica projetos na plataforma.
- Procura profissionais com habilidades específicas.
- Avalia propostas e portfólios de freelancers.
- Comunica-se para esclarecer requisitos e negociar termos.
- Realiza pagamentos pelos serviços.

### Processos por parte do freelancer:
- Cria um perfil com suas habilidades, experiência e portfólio.
- Procura por projetos adequados às suas habilidades e interesses.
- Submete propostas para projetos.
- Negocia termos e condições com os contratantes.
- Realiza o trabalho conforme acordado e envia entregas.
- Recebe pagamentos pelos serviços prestados.

## 3. Modelagem do processo de negócio

### 3.1. Análise da situação atual

Atualmente, nosso projeto possui um objetivo definido, e estamos trabalhando para dividir as tarefas para cada membro para continuar desenvolvendo o produto. Estamos analisando os requisitos, tanto funcionais quanto não funcionais, e principalmente definindo processos e seus participantes, uma vez que percebemos que, na última sprint, não demos a devida atenção para essa parte do projeto, o que resultou em uma seção confusa e fora dos padrões que ela deveria representar.

### 3.2. Descrição geral da proposta

### 3.2.1 Descrição da proposta de melhoria:

O SkillMatch visa aprimorar a comunicação entre contratantes e profissionais freelancers, facilitando a busca e seleção dos melhores perfis para ambos. A comunicação pode ser importante até mesmo após o processo ser concluído, alertando os próximos contratantes ou até mesmo os próximos freelancers da qualidade do trabalho de ambas as partes. Tendo isso em mente, optamos pela adição de um feedback de ambas as partes sobre como foi a comunicação entre eles após a conclusão do processo. Com base nesses feedbacks, a plataforma poderia fornecer recomendações personalizadas para melhorar a comunicação e a colaboração em projetos futuros, além de ajudar na construção de reputação tanto para os contratantes quanto para os freelancers.

### 3.3. Modelagem dos processos

[PROCESSO 1 - Cadastro de Freelancer](Processo-1-Cadastro-de-Freelancers.md)

[PROCESSO 2 - Publicação de um novo projeto](Processo-2-Publicação-de-um-novo-projeto.md)

[PROCESSO 3 - Cadastro de Contratante](Processo-3-Cadastro-de-contratantes.md)

[PROCESSO 4 - Exibir projetos publicados](Processo-4-Exibir-Projetos-Publicados.md)

[PROCESSO 5 - Busca e contratação de Freelancers](Processo-5-Busca-e-contratação-de-Freelancers.md)

## 4. Projeto da solução

O documento a seguir apresenta o detalhamento do projeto da solução. São apresentadas duas seções que descrevem, respectivamente: modelo relacional e tecnologias.

[Projeto da solução](solution-design.md)


## 5. Indicadores de desempenho

O documento a seguir apresenta os indicadores de desempenho dos processos.

[Indicadores de desempenho dos processos](performance-indicators.md)


## 6. Interface do sistema

A sessão a seguir apresenta a descrição do produto de software desenvolvido. 

[Documentação da interface do sistema](interface.md)

## 7. Conclusão

Em conclusão, os resultados obtidos por nosso grupo foram satisfatórios para todos os membros. Foi um projeto que nos ajudou a crescer, tanto como desenvolvedores de software, quanto como equipe. O resultado final está alinhado com nossos planos iniciais. Houveram mudanças e adaptações, mas tudo correu de uma maneira controlada.

# REFERÊNCIAS


**[1.1]** - _Upwork & Freelancers Union. (2021).  Acesso em: [15 de Setembro de 2020]._

**[1.2]** - _Global Workplace Analytics. (2021). Remote Work Statistics. Acesso em: [18 de Outubro de 2023]._

**[1.3]** - _Freelance Forward Economist Report. (2020). Acesso em: [05 de Março de 2024]._


# APÊNDICES



## Apêndice A - Código fonte

[Código do front-end](../src/front) -- repositório do código do front-end

[Código do back-end](../src/back)  -- repositório do código do back-end


## Apêndice B - Apresentação final


[Slides da apresentação final](presentations/)


[Vídeo da apresentação final](video/)






