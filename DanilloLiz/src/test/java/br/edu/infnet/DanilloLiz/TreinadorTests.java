package br.edu.infnet.DanilloLiz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.DanilloLiz.model.domain.Treinador;

@SpringBootTest
class TreinadorTests {

	private Treinador treinador;
	
	@BeforeEach
	void setUp() {
		treinador = new Treinador();
		treinador.setNome("Daigo Umehara");
		treinador.setRegistro(1);
		treinador.setExCampeao(false);
		treinador.setSalario(0);
	}
	
	
	@Test
	void TreinadorCampeao() {
		treinador.setSalario(4000);
		treinador.setExCampeao(true);
		System.out.println();
		
		assertEquals("Daigo Umehara", treinador.getNome());
		assertEquals(1, treinador.getRegistro());
		assertEquals(4000, treinador.getSalario());
		assertEquals(true, treinador.isExCampeao());
		assertEquals("Sim", treinador.VerificarCampeao());
		assertEquals(6000, treinador.CalcularSalarioCampeao());
	}

	@Test
	void TreinadorNaoCampeao() {
		treinador.setNome("Nephew");
		treinador.setRegistro(2);
		treinador.setSalario(4000);
		treinador.setExCampeao(false);
		System.out.println();
		
		assertEquals("Nephew", treinador.getNome());
		assertEquals(2, treinador.getRegistro());
		assertEquals(4000, treinador.getSalario());
		assertEquals(false, treinador.isExCampeao());
		assertEquals("Não", treinador.VerificarCampeao());
		assertEquals(4000, treinador.CalcularSalarioCampeao());
	}	

}
