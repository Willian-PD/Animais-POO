package POLIMORFISMO;

/*
Willian Pereira Domingues
0050015918
*/

public  abstract class Animal {
	private float peso;
	private int idade;
	private int membros;
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(double d) {
		this.peso = (float) d;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}
	public void emitirSom(String string) {		
		// TODO
	}
	public void locomover(String string) {
		// TODO
	}
	public void alimentar(String string) {
		// TODO
	}
}
