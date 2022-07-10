package desafio;

public class Teste {

	public static void main(String[] args) {

		Carro f1 = new Ferrari();
		Carro c1 = new Civic();

		System.out.println("Velocidade atual do c1: " + c1.velocidadeAtual);
		System.out.println("Velocidade atual da f1: " + f1.velocidadeAtual);

		c1.acelerar();
		f1.acelerar();

		System.out.println("Velocidade atual do c1: " + c1.velocidadeAtual);
		System.out.println("Velocidade atual da f1: " + f1.velocidadeAtual);

		c1.frear();
		f1.frear();
		f1.frear();
		f1.frear();
		f1.frear();
		f1.frear();

		System.out.println("Velocidade atual do c1: " + c1.velocidadeAtual);
		System.out.println("Velocidade atual da f1: " + f1.velocidadeAtual);

	}

}
