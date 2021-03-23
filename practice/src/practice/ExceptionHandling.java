package practice;

class MyException extends Exception{
	public MyException(String str) {
		System.out.println(str);
	}
}
public class ExceptionHandling{
	public static void main(String[] args) {
		int num;
		num = 16;
		try {
			if(num<18) {
				throw new MyException("Under-Age");
			}else {
				System.out.println(num);
			}
		}catch(Exception e ) {
			
		}
	}
}
