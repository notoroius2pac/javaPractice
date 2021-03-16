package tasks;

import java.util.Timer;

public class Exercise1 {

	public static void main(String[] args) {
		FileProgram fp = new FileProgram();
		fp.t1.run();
	}
}
class CopyDataThread extends Timer implements Runnable{
	String sourceFile , destinationFile;
	
	public CopyDataThread(String sourceFile, String destinationFile) {
		this.sourceFile = sourceFile;
		this.destinationFile = destinationFile;
	}
	
	public void run() {
	      Task t1 = new Task("10 characters are copied");
	      Timer t = new Timer();
	      t.schedule(t1,0, 5000);

	}
}
