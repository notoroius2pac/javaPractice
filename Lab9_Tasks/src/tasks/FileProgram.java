package tasks;

import java.io.FileInputStream;

public class FileProgram{
	
	CopyDataThread t1 = new CopyDataThread("sourceFile.txt","destinationFile.txt");{
	try {
		   FileInputStream fin=new FileInputStream("sourceFile.txt");    
		   byte[] buffer = new byte[4];
		   int i=fin.read(buffer, 0, 5);  
		   System.out.println(buffer.toString());
		   fin.close();
	   }catch(Exception e) {
		   System.out.println("Exception caught :\t" + e);
	   }
}}