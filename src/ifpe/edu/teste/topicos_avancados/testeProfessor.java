package ifpe.edu.teste.topicos_avancados;

import static org.junit.Assert.*;

import org.junit.Test;

public class testeProfessor {
	
	@Test
	public void testeCadastroValido() {
		assertTrue(cadastrarProfessor("Vitor Lira", "12456"));
	}
	
	@Test
	public void testeCadastroInvalido() {
		assertFalse(cadastrarProfessor("Vitor Lira", "12456"));
	}
	
	@Test
	public void testeListagemCorreta() {
		assertNotNull(listagemProfessor());
	}
	
	@Test
	public void testeListagemIncorreta() {
		assertNull(listagemProfessor());
	}
	
	@Test
	public void testeRemocaoValida() {
		Professor professor = new Professor("Vitor Lira", "12456");
		assertTrue(removerProfessor(professor));
	}
	
	@Test
	public void testeRemovaoInvalida() {
		Professor professor = new Professor("Vitor Ferreira", "12456");
		assertFalse(removerProfessor(professor));
	}

}
