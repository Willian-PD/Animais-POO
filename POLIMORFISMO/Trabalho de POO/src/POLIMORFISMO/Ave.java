package POLIMORFISMO;

/*
Willian Pereira Domingues
0050015918
*/

public class Ave extends Animal{

	private String corPena;

	public String corPena() {
		return corPena;
	}
	public void fazerNinho()
	{
		System.out.println("Construiu um ninho");
	}

	@Override
	public void locomover() {
		
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		
		System.out.println("Comendo Frutas");
	}

	@Override
	public void emitirSom() {
		
		System.out.println("Som de ave PRU PRU");
	}

}
