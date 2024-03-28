package br.edu.infnet.DanilloLiz.model.domain;

// A classe treinador representa a entidade responsável por treinar um time de atletas.
public class Treinador {

	private int registro;
	private String nome;
	private float salario;
	private boolean exCampeao;
	
	
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public boolean isExCampeao() {
		return exCampeao;
	}
	public void setExCampeao(boolean exCampeao) {
		this.exCampeao = exCampeao;
	}
	
	// Método que aumenta o salário em 50% caso o treinador seja um renomado ex-campeão.
	public float CalcularSalarioCampeao() {
		if(exCampeao) {
			return (float) (this.salario*1.5);
		} else {
			return this.salario;
		}
	}
	
	
	// Método que retorna uma string que diz se o objeto é ou não campeão
	public String VerificarCampeao() {
		return exCampeao? "Sim" : "Não";
	}
}
