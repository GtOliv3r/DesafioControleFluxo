
import java.util.Scanner;


	

public class Contador {

	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
    
    int numero1;
    int numero2;
		
		
		try {
			System.out.print("Informe o primeiro numero: ");
			numero1 = scanner.nextInt();
			
			System.out.print("Informe o segundo numero: ");
			numero2 = scanner.nextInt();
			
			
			String numeros = formatarCep(numero1,numero2);
			System.out.println(numeros);
			
			for(int i = numero1;i<=numero2;i++) {
				System.out.println("imprimindo número " + numero1);
				numero1++;}
			
		} catch (ParametrosInvalidosException e) {
			System.out.println("O segundo numero deve ser maior que o primeiro");
		}
	}
static String formatarCep(int n1,int n2) throws ParametrosInvalidosException{
	if(n1>n2)
		throw new ParametrosInvalidosException();
	
	return "Tudo certo! ";


}
}
