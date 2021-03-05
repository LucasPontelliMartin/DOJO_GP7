/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dojo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class DOJO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
    String conteudo = readFile();
    
     try {
            conteudo = conteudo.replaceAll("(?s:/\\*.*?\\*/)|//.*", "") ;
            FileWriter fw = new FileWriter("Formatado.txt");
            fw.write(conteudo);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    System.out.println(conteudo);
    }
    


private static String readFile() throws FileNotFoundException{

String conteudo = null;

File texto = new File ("C:\\Users\\Pc\\Desktop\\DOJO\\CodigoFonte_JS.txt");
Scanner myReader = new Scanner(texto);
        

        while (myReader.hasNext()){
            conteudo += myReader.nextLine();
        }
        return conteudo;
}

}