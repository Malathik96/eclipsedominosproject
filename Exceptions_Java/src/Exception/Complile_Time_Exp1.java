package Exception;

public class Complile_Time_Exp1 {
	public static void main(String[] args) throws Exception{
		
		System.out.println("Sky");
		
		Thread.sleep(1000);
		
		System.out.println("Cloud");
		
		Thread.sleep(1000);

		System.out.println("Rain");
		
		
		throw new ClassCastException();
	}

}
