# Prontuário Odontológico
- O projeto consiste em um prontuário odontológico destinado aos alunos do curso de odontológia do Centro Universitário Estácio de Brasília e visa diminuir a quantidade de papel que deve ser mantido guardado para cada paciente atendido, além de agilizar e modernizar o processo de atendimento.
- Esse projeto foi desenvolvido pelos alunos do professor Almir Rogério de Macedo da disciplina de Programação Orientada a Objetos em Java, como um projeto de extensão realizado em torno de 3 meses consecultivos interamente em linguagem de programação Java.
- O cliente consistia no coodernador do curso de odontologia da instituição, Rafael Jose Santos Rodrigues e era previsto o uso efetivo da aplicação durante o primeiro semestre do ano de 2024 pela referida instituição.
- A aplicação, até a presente data de 20/11/2023, consiste apenas em um "mínimo produto viável", sendo funcional e até utilizável mas longe de estar completa para real uso. Caso a aplicação continue sendo desenvolvida e o planejamento inicial seja mantido seria necessário refatorar parte do código e implementar o restante dos requisitos arcordados com o cliente.
## Como funciona?
-  A aplicação possui três telas:
      -  Prontuário
      -  Novo paciente
      -  Novo prontuário
-  Todas as telas possuem integração com banco de dados MySQL e podem ser resumidas em operações de SELECT e INSERT INTO
### prontuário
![tela01](https://github.com/Gustavo-erades/ProjOdonto/assets/108373134/8e3df1ee-b3fb-41fc-9ab5-78e90957e0f5)
-   Essa é a tela inicial da aplicação e realiza algumas operações de consulta ao banco de dados
-   A tabela de consulta se inicia vazia e conforme forem sendo feitos os cadastros dos pacientes ela é atualizada
-   O campo de pesuisa usa o operador LIKE para buscar no banco de dados por qualquer coisa parecida com o que foi digitado.
![tela01 1](https://github.com/Gustavo-erades/ProjOdonto/assets/108373134/01ee3e1e-2cb5-4386-9e94-6f98b7a8ffcc)
-   Após alguma linha da tabela ser selecionada o botão "visualizar" é exibido
-   Quando esse botão é pressionado uma nova sessão é exibida e nela são retornados diversos dados de algumas tabelas do banco de dados
-   Os dados retornados são referentes aos dados pessoais e às informações iniciais fornecidas pelo paciente na tela "Novo paciente".
![tela01 2](https://github.com/Gustavo-erades/ProjOdonto/assets/108373134/08268203-ae24-4a53-ab5c-6996188f9e70)
-   Essa tela é aberta quando o usuário pressioanda o botão "Termo de consentimento", essa tela lê o arquivo "termo de consentimento.ott" que é criado após o botão "visualizar" ser pressionado, esse aruivo consiste em um contrato que deve ser assinado pelo paciente e pelo dentista que está atendendo.
-   Esse arquivo é preenchido automáticamente nos campos nome, rg e cpf com base em uma consulta no banco de dados feita nos dados pessoais do paciente.
![tela01 3](https://github.com/Gustavo-erades/ProjOdonto/assets/108373134/0673c047-7f06-46fa-878a-62b46e74a6e0)
-   Essa tela é aberta quando o usuário pressiona o botão "questões de saúde", essa tela retorna os dados preenchidos na aba "Novo prontuário"
-   Para validar os checkboxes que devem estar selecionados é usada a lógica do "One Hot Coding", quando os checkboxes são marcados uma String contendo 0 (desmarcado) e 1 (marcado) é registrada no banco de dados e quando é necessário retonar esses checkboxes essa String é convertida em um array que é percorrido até ser encontrada uma posição com o caractere 1, a pergunta nessa posição (somada a 1 pois o array se inicia em 0) deve estar marcada.
## Novo paciente
![tela02 0](https://github.com/Gustavo-erades/ProjOdonto/assets/108373134/4764a559-ec67-4e06-abe6-fa0030b9342a)
-   Essa tela consiste em possibilitar o cadastro dos dados pessoais do paciente e de algumas informações iniciais
-   Todos os campos que necessitam de alguma formatação estão formatados como cpf, rg, telefone, etc.
-   Mensagens de cadastro bem sucedidos, ou de falha, são exibidas. para informar ao usuário o status da operação.
## Novo prontuário
![tela03 0](https://github.com/Gustavo-erades/ProjOdonto/assets/108373134/a5777ca3-1fc3-46df-ab51-2a3e151dc6a9)
-   Essa tela consiste em possibilitar o cadastro dos dados do paciente referentes à dois questionários: um questionário de saúde geral e um questionário odontológico
-   Mensagens de cadastro bem sucedidos, ou de falha, são exibidas. para informar ao usuário o status da operação.


