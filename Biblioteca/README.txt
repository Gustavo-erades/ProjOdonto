--- Como a Biblioteca funciona? ---

Aba �Pesquisar Livo�:
	Nessa aba ser�o apresentados todos os livros cadastrados, seu nome, status(alugado ou n�o), categoria, autor, se foi emprestado, data de entrega e Id (n�mero identificador).
	Al�m disso essa aba tamb�m apresenta algumas funcionalidades como �Consultar�, �Gerar consultas�, �Excluir Livro�, �Pesquisar	� e �Mostrar Todos�.

-Consultar:
	Ao selecionar uma tupla(linha) na caixa dos registros listados e clicar em �consultar� uma nova janela ser� apresentada mostrando os dados da pessoa que alugou aquele livro.

-Gerar consultas:
	Ao clicar nesse bot�o um arquivo de texto ser� criado e alocado na mesma pasta que o programa est�. Esse arquivo de texto cont�m os dados de todas as pessoas que est�o com livros alugados e tamb�m diz que livros s�o esses.

-Excluir livro:
	Ao selecionar uma tupla(linha) na caixa dos registros listados e clicar em �Excluir livro�, o livro selecionado ser� deletado do banco de dados da Biblioteca. Essa fun��o s� ser� poss�vel caso o livro selecionado n�o esteja alugado

-Pesquisar:
	O texto digitado na caixa � esquerda ser� pesquisado por todos os registros existentes

-Mostrar Todos:
	Todos os registros feitos ser�o listados.
------------------------------------------------------------------

Aba �Cadastrar Livo�:
	Nessa aba ser� feito o cadastro de todos os livros da Biblioteca; o �Nome do livro� deve conter apenas letras, na caixa �Selecione a categoria� inicialmente n�o apresentar� nada, pois nela ficar�o todas as categorias que forem cadastradas (para posterior sele��o), o campo �Autor(a) do livro� tamb�m deve come�ar com letra mai�scula e conter apenas letras.
	Uma vez clicado em �Cadastrar� o livro j� estar� no banco de dados (uma mensagem de sucesso aparecer� para confirmar isso), por�m o campo de �categoria� s� ser� atualizado na pr�xima inicializa��o do programa. Indo na aba �Pesquisasr Livro� e clicando em �Mostrar Todos� ser� poss�vel ver os novos registros, por�m vale ressaltar que os campos de �ID� das abas �Empr�stimo� e �Devolu��o� tamb�m s� ser�o atualizados na pr�xima inicializa��o do programa. 
------------------------------------------------------------------

Aba �Empr�stimo�:
	Nessa aba ser�o feito os empr�stimos dos livros. Todos os campos possuem valida��o (para que um padr�o seja mantido, o que visa facilitar o entendimento) e portanto todos os campos devem seguir essas regras:
	-Nome:
		Conter apenas letras
	-CPF:
		Deve estar no padr�o: 000.000.000-00, com exatos 11 n�meros, sendo os 6 primeiros separados por um �.� em blocos de 3 n�meros e os 8 �ltimos separados por �-� em um bloco de tr�s n�meros � esquerda e um bloco de 2 n�meros � direita.
	-Matr�cula:
		conter apenas n�emeros
	-Telefone para contato:
		Conter apenas n�meros, com DD do estado entre par�nteses, divido em 2 blocos de n�meros, um com 5 e outro com 4. Ex:(61) 12345-1234; o espa�o entre o fechamento do par�ntese e in�cio do bloco de n�meros � opcional.
------------------------------------------------------------------

Aba �Devolu��o�:
	Nessa aba ser� feita a devolu��o dos livros emprestados. Todos os campos tamb�m possuem valida��o (e seguem as mesmas regas dos campos de mesmo nome da aba �Empr�stimo�), aqui o campo �Nome� deve ser preenchido exatamente da mesma forma que o mesmo campo foi preenchido no empr�stimo, assim como o campo �CPF�. O ID do livro deve ser consultado na aba �Pesquisar Livro� e pode conter apenas n�meros, ap�s tudo preenchido e validado a devolu��o � feita e o status do livro deixa de ser �Alugado�.
------------------------------------------------------------------
Campo �Menu�:
	Esse campo apresenta tr�s funcionalidades: �Gerar Banco�,�Zerar Banco� e �Sair�; a op��o �Sair� apenas encerra a execu��o do programa de Biblioteca (por�m os dados permanecem salvos, n�o se preocupe), a op��o �Gerar Banco� cria um arquivo de texto com a listagem dos dados de todos os livros j� cadastrados na biblioteca e salva esse arquivo na mesma pasta em que o programa se encontra, j� a op��o �Zerar Banco� deve ser evitada ao m�ximo e s� deve ser usada em situa��es espec�ficas. O cuidado com essa funcionalidade se faz necess�rio pois ela vai deletar todos os registros do banco de dados de forma permanente, por�m s� ter� �xito caso n�o hajam livros emprestados. Caso essa fun��o seja ativada uma pasta de backup ser� criada dentro do mesmo diret�rio que esse programa se encontra, dentro dessa nova pasta ser� criado um arquivo de texto com todos os registros que tinham na biblioteca antes da dele��o total dos dados.

------------------------------------------------------------------
Um pouco mais sobre o programa:
	
	*Os Ids s�o gerados autom�ticamente, o pr�prio programa escolhe n�meros aleat�rios numa faixa de de 100 a 10000, esse sistema foi feito para facilitar o cadastro dos livros, pois voc�, como usu�rio, n�o precisa se preocupar com os ids.
	Por�m, caso queira personalizar os ids para melhorar sua organiza��o � poss�vel. Basta, ao cadastrar o livro, alterar o campo de 'id do livro'; OBS: os ids podem ter at� 5 caracteres e podem conter tanto letras quanto n�meros.
	
	*O campo de CPF e de Matr�cula t�m a mesma fun��o (servir de identificador para quem alugou o livro) e por isso caso um esteja preenchido, preencher o outro se torna opcional. O campo de CPF precisa estar no padr�o 000.000.000-00, mas a �nica restri��o que o campo de matr�cula tem � de poder conter apenas n�meros.
	
	*Os campos de datas podem usar como separador a / ou o -, ambos podem ser usados para separara dia, m�s e ano.
	
	*A pasta desse programa � necess�ria para seu pleno funcionamento, portanto voc� N�O deve retir�-la do seu computador. Essa pasta tamb�m servir� como base para o programa. O que significa que quando for necess�rio gerar uma pasta de backup ou um arquivo txt qualquer, a pasta de destino ser� a mesma de origem desse programa. Mas, fique a vontade para alocar essa pasta onde preferir ou criar um atalho desse programa. OBS: caso queira abrir o programa clicando em seu �cone por�m fora da pasta de origem, crie um atalho e o aloque onde preferir. 


