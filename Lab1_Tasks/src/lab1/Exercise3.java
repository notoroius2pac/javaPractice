package lab1;

public class Exercise3 {
	static int fib(int n) 
    { 
        if (n <= 1) 
            return n; 
        return fib(n - 1) + fib(n - 2); 
    } 
  
    public static void main(String args[]) 
    { 
        int n = 14; 
        System.out.println(fib(n)); 
    } 
}
