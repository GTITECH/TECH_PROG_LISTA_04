package listaQuatro;

public class Empregado {

	public String nome;
	public String sobreNome;
	public double salarioMes;
	
	public static void main(String[] args) {
	
		Empregado empregado1 = new Empregado("", "", 0);
		Empregado empregado2 = new Empregado("", "", 0);
		
		empregado1.nome = "joao";
		empregado1.sobreNome = "paulo";
		empregado1.salarioMes = 200;
		
		empregado2.nome = "pedro";
		empregado2.sobreNome = "jose";
		empregado2.salarioMes = 100;
		
	System.out.println("Nome: "+empregado1.nome+" Salario: "+empregado1.salarioMes);	
	System.out.println("Nome: "+empregado2.nome+" Salario: "+empregado2.salarioMes);
	
			empregado1.salarioMes += empregado1.salarioMes*0.1;
			empregado2.salarioMes += empregado2.salarioMes*0.1;
	
	System.out.println("Nome: "+empregado1.nome+" Salario: "+empregado1.salarioMes);	
	System.out.println("Nome: "+empregado2.nome+" Salario: "+empregado2.salarioMes);
	}
	
	public Empregado(String nome, String sobreNome, double salarioMes) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.salarioMes = salarioMes;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public double getSalarioMes() {
		return salarioMes;
	}
	public void setSalarioMes(float salarioMes) {
		if (salarioMes < 0)
		this.salarioMes = salarioMes+0;
	}
	
}