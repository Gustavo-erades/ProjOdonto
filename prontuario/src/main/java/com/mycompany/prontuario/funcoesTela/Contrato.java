
package com.mycompany.prontuario.funcoesTela;

import com.mycompany.prontuario.entidades.Paciente;

public class Contrato {
    public void contratoPaciente(String nome,String cpf, String rg, String id){
        String texto, caminho;
        texto="\tTERMO DE CONSENTIMENTO LIVRE E ESCLARECIDO\n\n"+
"Eu, "+nome+",portador do CPF:"+cpf+" e RG:"+rg+" , por intermédio deste documento, declaro que todas as\n" +
"informações cadastrais e do questionário de saúde são verdadeiras e que fui devidamente\n" +
"informado(a) e entendi que serei atendido por estudantes do Curso de Odontologia do\n" +
"Centro Universitário Estácio de Brasília, sob a supervisão dos professores desta\n" +
"Instituição de Ensino. Declaro que fui devidamente esclarecido(a) e estou de acordo com\n" +
"que seja providenciada ficha clínica com meus dados pessoais e informações pertinentes,\n" +
"exames clínicos e complementares, radiografias e fotografias, diagnóstico e plano de\n" +
"tratamento, ciente de que estas informações constituem sigilo profissional e que é minha\n" +
"responsabilidade a manutenção da atualização destas informações. Declaro que fui\n" +
"explanado sobre as propostas para atendimento, alternativas, bem como os eventuais\n" +
"riscos e possíveis efeitos indesejados não previstos, mas que eventualmente podem\n" +
"resultar do tratamento. Declaro estar ciente que os professores do Centro Universitário\n" +
"Estácio de Brasília têm autonomia para vetar a realização, pelos alunos de Graduação do\n" +
"Curso de Odontologia, de procedimentos considerados complexos. Estou ciente que NÃO\n" +
"é de responsabilidade do Centro Universitário Estácio de Brasília resolução de casos\n" +
"considerados complexos para a realização pelos alunos de graduação deste Instituição de\n" +
"Ensino. Estou ciente que devo comparecer as consultas nos horários agendados pelos\n" +
"alunos. O não comparecimento às consultas por 2 vezes subsequentes configura\n" +
"desistência do tratamento. Nestes casos o Centro Universitário Estácio de Brasília não se\n" +
"responsabiliza pela conclusão do tratamento ou pelas complicações advindas do\n" +
"abandono.\n\n"+
"Brasília,____ /____ /____ .\n"+
"\t_________________________________________\n\n"+
"\tTERMO DE CESSÃO DE USO DE IMAGEM E DADOS\n\n"+
"Autorizo que as informações contidas no meu prontuário e quaisquer outras informações\n" +
"relevantes e pertinentes sobre o meu caso sejam utilizadas para fins didáticos e\n" +
"científicos, apresentação em congressos, publicações em livros e revistas, tanto no país\n" +
"quanto no exterior, respeitada a legislação vigente em relação ao assunto.\n\n"+
"Brasília,____ /____ /____ .\n"+
"\t_________________________________________\n\n";
        new CriarArquivo().write("Termo de Consentimento"+id+".ott",texto);
        
    }
    
}
