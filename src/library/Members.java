/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import static library.Listing.ParseCSVLineByLine;

/**
 *
 * @author bolly
 */
public class Members {
    List<Members> treeParser = new CSVreader(FileReader("src/library/DADSA_CWK_2017_18_ITEM.csv")).withType(Members.class).build().parse();
        String Member_ID;
        String Member_Name;

    public Members(String Member_ID, String Member_Name) {
        this.Member_ID = Member_ID;
        this.Member_Name = Member_Name;
    }

    public void setMember_ID(String Member_ID) {
        this.Member_ID = Member_ID;
    }

    public void setMember_Name(String Member_Name) {
        this.Member_Name = Member_Name;
    }

    public String getMember_ID() {
        return Member_ID;
    }

    public String getMember_Name() {
        return Member_Name;
    }
  
//Scanner Log_details = new Scanner(System.in)


    public static void Login() {
 
        
        System.out.println("Enter Member Name");
        Members.Member_Name = Log_details.nextLine();
        System.out.println("Enter Member ID");
        String Member_ID = Log_details.nextLine();
       // System.out.println(Listing.ParseCSVLineByLine(vah()));
//        if(ParseCSVLineByLine()== Member_ID)
//        {
//        System.out.println("Welcome Dear "+Member_Name+"("+Member_ID+")");
//        }

    }
        
}