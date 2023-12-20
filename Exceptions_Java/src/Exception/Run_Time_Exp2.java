package Exception;

public class Run_Time_Exp2 {
	public static void main(String[] args) {
		int a=100;
		int b=0;
		try {
			System.out.println(a/b);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("arith");
		}
		catch (NullPointerException e) {
			// TODO:handle exception
			System.out.println("nll");
		}
	}

}
