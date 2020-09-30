package POLIMORFISMO;

/*
Willian Pereira Domingues
0050015918
*/

public class Peixe extends Animal {

	private String corEscama;

	public String corEscama() {
		return corEscama;
	}
	public void soltarbolha() {
		System.out.println("Soltou uma bolha");
	}
	
	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe não faz som");
	}
}
