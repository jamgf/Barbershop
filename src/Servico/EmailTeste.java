/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servico;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;


public class EmailTeste {

    
    public static void main(String[] args) {
         
        
        Email email = new Email("Senha e Usuário Sistema Service Desk", "Segue usuário e senha para acesso ao sistema da barbearia\n"+"Usuario:FelipeSoster\n"+"Senha: 123456", "jmfilh@gmail.com");
        
        email.enviar();
        

    }
    
}
