package com.demo.ExcelProject;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;  
public class TextFile {  
    public static void main(String args[]) throws FileNotFoundException{    
           
           PrintWriter writer=new PrintWriter("D:\\Testing\\Testout.txt");    
           Scanner scanner = new Scanner(System.in);
	        int num;
	        
	        System.out.println("Enter the number : ");
	        num = scanner.nextInt();
	        for(int loop=0; loop<10; loop++)
	        {
	        	writer.println(num);
	        }
               
	        writer.close();    
         
     }    
}  