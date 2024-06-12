import java.util.Scanner;

public class App {
    public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			Contador.contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
		}
	
        terminal.close();
	}
	
}
