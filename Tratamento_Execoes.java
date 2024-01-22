package prog2_aula19;
import java.util.Scanner;

public class Tratamento_Execoes {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		 System.out.println("Digite dois números: \n");
		 int a = ler.nextInt();
		 int b = ler.nextInt();
		 int result = div(a,b);
		 System.out.println(a + "/" + b + "=" + result); 
	}
	     
		 public static int div (int x, int y) {
		try {
			return x/y;}
			
		catch (ArithmeticException e) {
			 System.out.println("Exceção capturada da div.");
			 return 0;
				}

		 }
	}



