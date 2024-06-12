public class Contador {
    public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
        if(contagem < 0){throw new ParametrosInvalidosException();}
        else{
            for (int i = 0; i < contagem; i++) {
                System.out.println("Imprimindo o número "+ i);
            }
        }
		//realizar o for para imprimir os números com base na variável contagem
	}
}
