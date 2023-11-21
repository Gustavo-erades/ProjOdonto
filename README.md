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
##
![tela01 1](https://github.com/Gustavo-erades/ProjOdonto/assets/108373134/01ee3e1e-2cb5-4386-9e94-6f98b7a8ffcc)
-   Após alguma linha da tabela ser selecionada o botão "visualizar" é exibido
-   Quando esse botão é pressionado uma nova sessão é exibida e nela são retornados diversos dados de algumas tabelas do banco de dados
-   Os dados retornados são referentes aos dados pessoais e às informações iniciais fornecidas pelo paciente na tela "Novo paciente".
##
![tela01 2](https://github.com/Gustavo-erades/ProjOdonto/assets/108373134/08268203-ae24-4a53-ab5c-6996188f9e70)
-   Tela 
