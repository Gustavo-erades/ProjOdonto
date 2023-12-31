
package com.mycompany.prontuario.funcoesTela;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CriarArquivo {
    public static String read(String caminho){
        String conteudo="";
        try{
            FileReader arq=new FileReader(caminho);
            BufferedReader lerArq=new BufferedReader(arq);
            String linha="";
            try{
                linha= lerArq.readLine();
                while(linha!=null){
                    conteudo+=linha+"\r\n";
                    linha=lerArq.readLine();
                }
                arq.close();
            } catch (IOException ex){
                conteudo="Erro: Não foi possível ler o arquivo";
            }
        }catch(FileNotFoundException ex){
            conteudo="Erro: Arquivo não encontrado!";
        }
        if(conteudo.contains("Erro")){
            return "";
        }
        else{
            return conteudo;
        }
    }
    public static boolean write(String caminho,String texto){
        try{
            FileWriter arq=new FileWriter(caminho);
            PrintWriter gravarArq=new PrintWriter(arq);
            gravarArq.println(texto);
            gravarArq.close();
            return true;
        } catch(IOException erro){
            System.out.println("DEU MERDA"+erro.getMessage());
                    return false;
        }
    }
}
