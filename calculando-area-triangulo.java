import java.util.Scanner;

public class T_area {
	public static void main(String[]args) {
		
		
		int T_base, T_altura, T_area;
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o valor da base do triângulo: ");
		T_base = input.nextInt();
		System.out.print("Digite o valor da altura do triângulo: ");
		T_altura = input.nextInt();
		System.out.print("A área do triângulo é o seguinte: ");
		T_area = T_base * T_altura/2;
		System.out.print(T_area);
		
		
	}

}
