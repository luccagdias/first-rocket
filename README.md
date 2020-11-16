# First Rocket

Back-end do projeto desenvolvido a 5ª edição do Mega Hack.

O desafio escolhido foi proposto pela Inovativa, visando a criação de uma solução pensando nos seguintes pilares:

- Como aumentar o relacionamento e engajamento online de comunidades
locais em diferentes estágios de maturidade?
- Como otimizar a gestão e estratégia para plataformas colaborativas de
conteúdo?
- Como fomentar de forma prática ecossistemas incipientes sem cultura de
empreendedorismo disseminada?
- Como fomentar mentores/as e investidores/as fora dos grandes centros?
- Como regionalizar conteúdos e ações nacionais?

![](https://media.discordapp.net/attachments/775071084398510084/777714294673506364/unknown.png?width=1025&height=285)


# Idéia do Projeto

Diversas pessoas possuem o desejo de se tornar empreendedores e tirar do papel suas ideias de negócio. Porém, a maioria delas nao tem o conhecimento necessário para começar esse processo. Esse problema acontece ainda mais em cidades que estao longe dos grandes centros urbanos, não possuindo a cultura do empreendedorismo disseminada.

Nosso objetivo foi desenvolver uma aplicação que aproxime pessoas que estão no ínicio desse processo, de mentores que possuem experiência e conheimento e podem ajudá-las através de mentorias e acompanhamento, fomentando assim a cultura empreendedora.

# Tecnologias Utilizadas

- Java
- Spring Boot
- APIs RESTful
- PostgreSQL
- Deploy no Heroku

O Back-end da aplicação foi desenvolvido com a linguagem **_Java_**, utilizando o framework **_Spring Boot_**, disponibilizando APIs RESTful que serão consumidas pelo Front-end.

Visando facilidade no consumo dessas APIs pelo Front-end, foi realizado o deploy do Back-end na plataforma **_Heroku_**, não sendo necessário clonar o repositório para que se utilize as suas funcionalidades.

A Base de Dados usada foi o **_PostgreSQL_**, que também está integrada ao Heroku, estando totalmente online.

# Funcionalidades

A aplicação possui atualmente as seguintes funcionalidades:

- Uma pessoa que deseja ser mentorada, pode acessá-la e realizar um cadastro informado alguns dados pessoais.
- Para mentorados cadastrados , é possível realizar o login
- Após realizar o cadastro / login, o mentorado pode visualizar um dashboard com cursos recomendados, suas mentorias agendadas.
- É possivel também acessar uma página que exibe mentores disponíves, uma breve descriçao sobre eles e seus horários disponíves. Através desta tela é possível agendar uma mentoria.


# Funcionalidades a serem implementadas

 Devido ao tempo reduzido para a implementação, temos o objetivo de futuramente implementar as funcionalidades planejadas, que são as seguintes:

- Sistema de pagamentos, tendo como diferencial neste ponto a opção de Modelo de Sucesso Compartilhado(MSC), em que o mentorado só realiza o pagamento após sua empresa começar a gerar lucro.
- Mentores criarem uma conta para visualizar ideias de futuros empreendedores e visualizar suas mentorias agendadas.
- Envio de projetos dentro da plataforma para a liberação das mentorias, para filtrar quem realmente esta dedicado ao aprendizado.
- Feedback dos mentores, para que o mentorado sabia quais são os pontos fracos de sua idéia e o direcione para realizar os estudos necessários.
- Plataforma aberta para investidores se conectarem com os futuros empreendedores e possivelmente investir em seus projetos.


