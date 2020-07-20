# 2º Avaliação POO - Etapa 2

   Você e sua equipe foram contratados para implementar o sistema para a reserva de ingressos de um cinema. O analista da sua equipe, em conversa com o cliente, obteve as seguintes informações sobre as necessidades desejadas:
1 - sistema será acessado por dois tipos de usuário: o gestor e o cliente
2 - o gestor deverá ser previamente cadastrado e poderá: cadastrar novas sessões, visualizar as sessões cadastradas e desabilitar uma sessão ativa e verificar quantos e quais ingressos foram vendidos para uma sessão.
3 - o cliente poderá: consultar as sessões disponíveis e reservar um ingresso para a sessão desejada, bem como a poltrona que deseja sentar
3.1 - Etapas da reserva de ingresso funcionará assim:
a) São exibidas todas as sessões ativas cadastradas
b) O cliente informa a sessão desejada
c) O cliente informa a quantidade de ingressos que deseja reservar
d) É exibida uma matriz com a disposição das poltronas disponíveis na sala, as indisponíveis devem aparecer com um “X”
e) O cliente informa as poltronas desejadas
f) O sistema confirma os dados da sessão, as poltronas e o valor do ingresso
g) O cliente confirma a reserva
h) O sistema informa se a reserva foi concluída com sucesso ou se houve erro
i) O sistema voltar para o menu principal
4 - o valor do ingresso é R$ 10 

Considerando essas informações, você e sua equipe montaram as classes iniciais pertencentes ao sistema, no entanto, tiveram divergências sobre como compor a classe “Ingresso” e resolveram iniciar a codificação da área do “gerente” antes de concluir a modelagem da classe “Ingresso”. O diagrama montado resultou no seguinte:

 Usuario -> id, nome, login, senha, matricula, cargo
 Sessao -> id, data, hora, filme, sala, flgativo
 Ingresso -> id, poltrona, valorpago, datacompra, horacompra, idsessao

Após avançar no desenvolvimento da área do “Gerente”. Você e sua equipe iniciaram o desenvolvimento da área do “Cliente” e considerando a eficiência da sua equipe, seu analista deu o prazo ao cliente para a entrega do sistema até o dia 23/07 as 12h. 

Observações:
a) O sistema deve conectar com o banco de dados PostgreSql e inserir, atualizar e consultar os dados manipulados pela aplicação
b) A equipe deve elaborar o diagrama ER com as tabelas do Banco de Dados e seus relacionamentos
c) A equipe deve enviar o código-fonte do programa (.zip ou .rar), o digrama ER do banco de dados e o script de criação das tabelas e carregamento das tabelas para o e-mail 160100981@prof.uninassau.edu.br, com o assunto “2 Avaliação POO – 2 Etapa – primeiro nome dos membros da equipe”;
d) Não esquecer de assinar o código-fonte e o ER com o nome e a matrícula dos membros da equipe.
e) Devem ser utilizados os conceitos de POO e Banco de dados aprendidos nas disciplinas.
f) o projeto pode ser baixado pelo repositorio: https://github.com/rahkelMCTF/avaliacaopoo.git
g) Antes de enviar o código-fonte o aluno deve mudar  a conexão do banco de dados para:
      public ConexaoBanco() {     
	        url="jdbc:postgresql://localhost:5432/cinema";
	        usr="usrcinema";
	        pass="123456";
	    }

