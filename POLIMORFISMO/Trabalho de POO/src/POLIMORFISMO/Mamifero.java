package POLIMORFISMO;

/*
Willian Pereira Domingues
0050015918
*/

public class Mamifero extends Animal{
	private String corPelo;

	public String corPelo() {
		return corPelo;
	}
	
	@Override
	public void locomover() {
		
		System.out.println("Correndo");
	}

	@Override
	public void alimentar() {
		
		System.out.println("amamentando");
	}

	@Override
	public void emitirSom() {
		
		System.out.println("Som de mamifero");
	}
	

}
