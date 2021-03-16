package tasks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Timer;

public class Exercise1 {

	public static void main(String[] args) {
		FileProgram fp = new FileProgram();
		fp.run();
	}
}

class CopyDataThread extends Timer {
	String sourceFile, destinationFile;
	int j = 0;

	public CopyDataThread() {
		super();
	}
	public CopyDataThread(String sourceFile, String destinationFile) {
		super();
		this.sourceFile = sourceFile;
		this.destinationFile = destinationFile;
		System.out.println(this.sourceFile +"\t"+this.destinationFile);
	}
	{

	try{
		FileInputStream fin = new FileInputStream("F:\\Capgemini Workspace\\STS\\Lab9_Tasks\\src\\tasks\\sourceFile.txt");
		byte[] buffer = new byte[10];
		fin.read(buffer, j, j + 10);
		j += 10;
		fin.close();
		
		FileOutputStream fout = new FileOutputStream("F:\\Capgemini Workspace\\STS\\Lab9_Tasks\\src\\tasks\\destinationFile.txt");
		fout.write(buffer);
		fout.close();
	}catch(
	Exception e)
	{
		System.out.println("Exception caught :\t" + e);
	}

}
}
