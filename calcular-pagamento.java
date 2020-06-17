package folha_pagamento;

import java.util.Scanner;

public class folha_pagamento {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int cont, cod;
		float horas_t, horas_v, sal_i,sal_min, sal_f, aux_al;
		char turno, categoria;
		sal_min = 450;
		for (cont = 1; cont <= 2; cont ++) {
			System.out.print("Digite o código do funcionário.");
			cod = input.nextInt();
			System.out.print("Digite a hora trabalhada.");
			horas_t = input.nextInt();
			System.out.print("Digite o turno do funcionário sendo M matutino, V vespertino e N noturno.");
			turno = input.next().charAt(0);
			System.out.print("Digite a categoria do funcionário, sendo O de operario e G de gerente.");
			categoria = input.next().charAt(0);
			while (turno != 'M' && turno != 'V' && turno != 'N') {
				System.out.print("O turno digitado é inválido, por favor digite novamente.");
				turno = input.next().charAt(0);}
			while (categoria != 'O' && categoria != 'G') {
				System.out.print("A categoria digitada está incorreta, por favor digite novamente..");
				categoria = input.next().charAt(0);}
			if (categoria == 'G') {
				if (turno == 'N') {
					horas_v = sal_min * 18/100;}
				else {
					horas_v = sal_min * 15/100;}}
			
			else {
				if (turno == 'N') {
					horas_v = sal_min * 13/100;}
				else {
					horas_v = sal_min * 10/100;}}
			sal_i = horas_t * horas_v;
			if (sal_i <= 300) {
				aux_al = sal_i * 20/100;}
			else if (sal_i < 600){
				     aux_al = sal_i * 15/100;}
				     else {
				       aux_al = sal_i * 5/100;}
			sal_f = sal_i + aux_al;
			System.out.println("O código do funcionário é " + cod + " .");
			System.out.println("A hora trabalhada é " + horas_t + " .");
			System.out.println("O valor da hora é " + horas_v + " .");
			System.out.println("O salário inicial é " + sal_i + " .");
			System.out.println("O valor do auxílio alimentação é " + aux_al+ " .");
			System.out.println("O salário final é de " + sal_f + " .");
		
			
			
		
			
			
		}
		
		
		
	}

}
