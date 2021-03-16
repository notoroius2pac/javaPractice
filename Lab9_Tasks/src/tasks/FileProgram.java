package tasks;

import java.util.Timer;
import java.util.TimerTask;

public class FileProgram extends TimerTask{

	CopyDataThread t1 = new CopyDataThread("F:\\Capgemini Workspace\\STS\\Lab9_Tasks\\src\\tasks\\sourceFile.txt","F:\\Capgemini Workspace\\STS\\Lab9_Tasks\\src\\tasks\\destinationFile.txt");
	
	@Override
	public void run() {
	      Task t1 = new Task("10 characters are copied");
	      Timer t = new Timer();
	      t.schedule(t1,0, 5000);

	}
	}