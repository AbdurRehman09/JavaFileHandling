/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author Abdul Rehman
 */
    import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class IO {
//    public static void main(String args[]){
//   String filename="sample.txt";
//   int count=0;
//   try(BufferedReader in=new BufferedReader(new FileReader(filename))){
//       String line;
//       while((line=in.readLine())!=null)
//       {
//           String[] words = line.split("\\s+");
//                count += words.length;
//           System.out.println(line);
//       }
//       
//   }catch(IOException e){
//       e.printStackTrace();
//   }
//    System.out.println("Total words in the file: " + count);
//   
//}   
    
    //TAsk 8,9
    public static void main(String[] args) {
        String sourceFileName = "sample.txt"; // Replace with the path to the source file
        String destinationFileName = "destination.txt"; // Replace with the path to the destination file
         String search = "chl"; // Replace with the word you want to search
        String newword = "chal";

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFileName))){
               //BufferedWriter write1 = new BufferedWriter(new FileWriter(sourceFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line=line.replace(search,newword);
                writer.write(line);
                writer.newLine();
                //write1.write(line);
                //write1.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("File copied successfully.");
    }
    
   
    
}


