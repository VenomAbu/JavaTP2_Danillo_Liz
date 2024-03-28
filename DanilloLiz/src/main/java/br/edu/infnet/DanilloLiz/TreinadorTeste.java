package br.edu.infnet.DanilloLiz;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.DanilloLiz.model.domain.Treinador;

@Component
public class TreinadorTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
		// Instanciando dos objetos para apresentar no console
		Treinador t1 = new Treinador();
		t1.setNome("Daigo Umehara");
		t1.setRegistro(1);
		t1.setSalario(4000);
		t1.setExCampeao(true);
		System.out.println();
		
		
		Treinador t2 = new Treinador();
		t2.setNome("Nephew");
		t2.setRegistro(2);
		t2.setSalario(4000);
		t2.setExCampeao(false);
		System.out.println();
		
		
		// Apresentação dos dados no console e implementação dos métodos da classe Treinador
		System.out.println("Nome: " + t1.getNome());
		System.out.println("Registro: " + t1.getRegistro());
		System.out.println("Salario: " + t1.CalcularSalarioCampeao());
		System.out.println("É campeão?: " + t1.VerificarCampeao());
		System.out.println();
		System.out.println("Nome: " + t2.getNome());
		System.out.println("Registro: " + t2.getRegistro());
		System.out.println("Salario: " + t2.CalcularSalarioCampeao());
		System.out.println("É campeão?: " + t2.VerificarCampeao());
		System.out.println();
		
	}
}
