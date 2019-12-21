/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;



import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/**
 *
 * @author bolly
 */
public class Listing {
        String Member_ID;
        String Member_Name;
        String Transaction_ID;
        String Item_ID;
        String Date;

   public static void ReadCsvFile() {
//   

//this holds the Csv file location
    String csvFile =("C:/Users/bolly/Documents/NetBeansProjects/Library/src/library/DADSA_CWK_2017_18_ITEM.csv");
        String line = "";
        //as we have to split the file from commas
        String splitBy = ","; 

        //Buffered reader class is a java.io class which reads 
        //a character input file ,it reads lines and arrays 
        //File reader opens the given file in read mode 
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            //readline function is use to read a line form the file
            while ((line = br.readLine()) != null) {
            //loop will continue until the line ends 
            String[] name = line.split(splitBy);
            //split function use to split the words in the line by commas
            System.out.println("Item_No:"+ name[0]+ " , Title:" + name[1]+ " , Number_availablel:" + name[2]);
            //this is to print the each csv line 
            }
        } catch (IOException e) {
                //e.printStackTrace();
        }

    }
   String csvFile =("src/library/DADSA_CWK_2017_18_ITEM.csv");
   CSVReader csvReader = new CSVReader (new InputStreamReader(csvFile.getInputStream()));
    while ((record = csvReader.readNext()) != null) {
            System.out.println(record);
}

    public Listing(String Member_ID, String Member_Name, String Item_ID) {
        List<Members>ParseCSVLineByLine(FileReader("src/library/DADSA_CWK_2017_18_ITEM.csv");
        this.Member_ID = Member_ID;
        this.Member_Name = Member_Name;
        this.Item_ID = Item_ID;
    }

    public void setMember_ID(String Member_ID) {
        this.Member_ID = Member_ID;
    }

    public void setMember_Name(String Member_Name) {
        this.Member_Name = Member_Name;
    }

    public void setItem_ID(String Item_ID) {
        this.Item_ID = Item_ID;
    }

    public String getMember_ID() {
        return Member_ID;
    }

    public String getMember_Name() {
        return Member_Name;
    }

    public String getItem_ID() {
        return Item_ID;
    }
 
   public static void ParseCSVLineByLine()// throws FileNotFoundException
   {
      //Build reader instance
      //Read DADSA Item File
      //Default seperator is comma
      //Default quote character is double quote
      //Start reading from line number 2 (line numbers start from zero)
     try (CSVReader reader = new CSVReader(new FileReader("src/library/DADSA_CWK_2017_18_ITEM.csv"), ',' , '"' , 1)){
       
      //Read CSV line by line and use the string array as you want
      String[] nextLine;
      while ((nextLine = reader.readNext()) != null) {
         if (nextLine != null) {
            //Verifying the read data here
//            System.out.println(Arrays.toString(nextLine));
       String vah = Arrays.toString(nextLine);
             System.out.println(Arrays.toString(nextLine));
             
         }}}
      catch (IOException e){
              //e.printStackTrace();
              }
   }
   

   
  
}
   


