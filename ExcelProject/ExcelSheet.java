package com.demo.ExcelProject;

import java.io.*;
import java.util.Scanner;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

    	  
         public class ExcelSheet {
    	    public static void main(String[] args) 
    	      throws FileNotFoundException, IOException
    	    {
    	  
    	        // Creating Workbook instances
    	        XSSFWorkbook workbook = new XSSFWorkbook();
    	 
    	          
    	        // Creating Sheets using sheet object
    	        Sheet sheet1 = workbook.createSheet("Activity 1");
    	        
    	        Scanner scanner = new Scanner(System.in);
    	        int number;
    	        
    	        System.out.println("Enter the number : ");
    	        number = scanner.nextInt();
    	        for(int loop=0; loop<10; loop++)
    	        {
    	        	Row row = sheet1.createRow(loop);
    	        	Cell cell = row.createCell(0);
    	        	cell.setCellValue(number);
    	        }
    	        
    	     // An output stream accepts output bytes and sends them to sink.
    	        OutputStream fileOut = new FileOutputStream("D:\\Testing\\Test.xlsx");        
    	          
    	  
    	System.out.println("Sheets Has been Created successfully");
    	  
    	workbook.write(fileOut);
    	fileOut.close();
    	workbook.close();
    	    }
    	}
    

