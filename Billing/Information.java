/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projects;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author @blasphemeous
 */
public class Information {
    String firstName, middleName, lastName; 
    String address; 
    String id; 
    private static final String REGISTER_FILE_PATH = "C:\\Users\\\\padil\\Documents\\NetBeansProjects\\projects\\src\\projects\\RegisteredCustomer.txt"; 
    void Registration(String firstName, 
                      String middleName, 
                      String lastName, 
                      String address, 
                      String id){
        this.firstName = firstName; 
        this.middleName = middleName; 
        this.lastName = lastName; 
        this.address = address;
        this.id = id; 
        String content = String.format("NAME: %s %s %s | ADDRESS: %s | ID: %s", firstName, middleName, lastName, address, id); 
         try(BufferedWriter writer = new BufferedWriter(new FileWriter(REGISTER_FILE_PATH, true))){
             writer.write(content); 
             writer.newLine();
             
         }catch(IOException e){ 
             System.out.println("ERROR OCCURENCE IN WRITING THE FILE"); 
         }
        
    }
}
