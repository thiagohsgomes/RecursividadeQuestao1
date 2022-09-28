import java.util.Scanner;

public class Main {
	
	public static int soma(int n) {
		if(n == 0) {
			return 0;
		}
		return n +soma(n-1);
	}

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int n = entrada.nextInt();
		System.out.println();
		
		int x = Main.soma(n);
		System.out.println(x);
		
		entrada.close();
	}	
}
