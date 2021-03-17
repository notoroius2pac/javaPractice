package tasks;

import java.util.*;
public class Exercise2 {
   public static void main(String []args) {
      Task t1 = new Task("Task 1");
      Timer t = new Timer();
      t.schedule(t1,0, 10000); //  executes for every 10 seconds

   }
}
class Task extends TimerTask {
   private String name;
   public Task(String name) {
       this.name = name;
   }
   public void run() {
      System.out.println("[" + new Date() + "] " + name );
   }
}