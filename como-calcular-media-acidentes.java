import java.util.Scanner;

public class Acidentes {
	public static void main(String[]args) {
		int cont, cod, num_vei, num_acid, soma_vei;
		int maior, cid_maior, menor, cid_menor, cont_acid;
		float media_vei, media_acid, soma_acid;
		Scanner input = new Scanner(System.in);
		soma_vei = 0;
		soma_acid = 0;
		cont_acid = 0;
		maior = 0;
		menor = 0;
		cid_maior = 0;
		cid_menor = 0;
		   for (cont =1; cont <=3; cont ++) {
			   System.out.print("Digite o código da cidade " + cont + " .");
			   cod = input.nextInt();
			   System.out.print("Digite o número de veiculos da cidade " + cont + " .");
			   num_vei = input.nextInt();
			   System.out.print("Digite o número de acidentes da cidade " + cont + " .");
			   num_acid = input.nextInt();
			   if (cont == 1)
			        {
				        maior = num_acid;
				        cid_maior = cod;
				        menor = num_acid;
				        cid_menor = cod;
				   
			         }
			    
			   
				   if (num_acid > maior) 
				   {
					   maior = num_acid;
					   cid_maior = cod;					   
				   }
				   if (num_acid < menor)
				   {
					   menor = num_acid;
					   cid_menor = cod;
					   
				   }
			   
			   soma_vei = soma_vei + num_vei;
			   if (num_vei < 2000	)
			   {
				   soma_acid = soma_acid + num_acid;
				   cont_acid = cont_acid + 1;
				   
			   }
			   
				   
		   }
		   System.out.println("Maior número de acidentes " + maior + " na cidade de código " + cid_maior + " .");
		   System.out.println("Menor número de acidentes " + menor + " na cidade de código " + cid_menor + " .");
           media_vei = soma_vei/3;
           System.out.println("Média de veículos nas 5 cidades " + media_vei + " .");
           if (cont_acid == 0) 
        	   System.out.println("Não foi digitada nenhuma cidade menor que 2000 veículos");
           else 
           {
        	   media_acid = soma_acid/cont_acid;
        	   System.out.println("Média com acidentes em cidades com menos de 2000 veículos " + media_acid + ".");
           }
        	   
           
	}

}
