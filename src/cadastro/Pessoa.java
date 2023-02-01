package cadastro;

public class Pessoa {

	private String nome;
	private int idade;
	private long cpf;
	private float renda;
	
	public Pessoa(String nome, int idade, long cpf, float renda) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.renda = renda;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public float getRenda() {
		return renda;
	}
	public void setRenda(float renda) {
		this.renda = renda;
	}
	
	
	
	
}
