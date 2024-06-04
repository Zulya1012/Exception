package exc;
public class Dispatcher {
	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int [] z = {3,6,5,2,8};
		System.out.println("Start");
		try {
			System.out.println(z[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Inside catch ArrayIndex");
			System.out.println(e);
		}
		try {
			System.out.println(x/y);
			System.out.println("After dividing");
		}
		catch(ArithmeticException e) {
			System.out.println("Inside catch Arithmetic");
			System.out.println(e);
		}
		
		System.out.println("End");


	}

}
