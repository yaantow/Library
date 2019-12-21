/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;


//import com.opencsv.CSVReader;
import java.util.Scanner;
import java.io.FileReader;
import java.util.Arrays;
import au.com.bytecode.opencsv.CSVReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;

 
/**
 *
 * @author bolly
 */
public class Library {
    //Listing listing = new Listing();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(new File(".").getAbsoluteFile());
    Scanner Input = new Scanner(System.in);
    System.out.println("Press one");
    int choice = Input.nextInt();

    switch(choice){

            case 1:
                Listing.ReadCsvFile();
                break;

            case 2:
                Listing.ParseCSVLineByLine();
                break;
            case 3:
                Members.Login();
                break;   
                
    }
    
    
    
}



}
    
      
    
    


  
    
