package fibonnaci;

public class fibonnaci {
	public static void main(String[]args) {
		int cont, num1, num2, seq;
		num1 = 0;
		num2 = 1;
		for(cont = 1; cont <= 5; cont++) {
			seq = num1 + num2;
			System.out.println("seq é" + seq);
			num1 = num2;
			System.out.println("num1" + num1);
			num2 = seq;
			System.out.println("num2" + num2);
		}
			
		
	}

}
