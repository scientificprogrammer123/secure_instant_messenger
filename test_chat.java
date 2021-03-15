/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LJH
 */

/*
  4/15/2018
   Trying to use one functiion to call server then client, but not working, 
   going to try to find some other existing code.
*/

import java.io.IOException;
import rsa.rsa;
import chat.chat_client;
import chat.chat_server;
import java.util.concurrent.TimeUnit;

public class test_chat {
    public static void main(String[] args) throws IOException
    {
        rsa rsa_object = new rsa(); //create rsa object
        System.out.println("e: " + rsa_object.e());
        System.out.println("d: " + rsa_object.d());
        System.out.println("n: " + rsa_object.n());
        
        chat_server server_object = new chat_server();
        server_object.setVisible(true);
        //System.out.println("server initiated");

        try        
        {
            Thread.sleep(1000);
        } 
        catch(InterruptedException ex) 
        {
            Thread.currentThread().interrupt();
        }
        
        chat_client client_object = new chat_client();
        client_object.setVisible(true);        
        //System.out.println("client initiated");
    }
}
