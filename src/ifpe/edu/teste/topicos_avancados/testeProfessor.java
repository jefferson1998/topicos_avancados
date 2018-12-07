package ifpe.edu.teste.topicos_avancados;

import static org.junit.Assert.*;
import ifpe.edu.topicos_avancados.model.Professor;
import org.junit.Test;

public class testeProfessor {
	
	Professor professor = new Professor("Vitor Lira", "12456");
	
	@Test
	public void testeCadastroValido() {
		assertTrue(professor.cadastrarProfessor(professor));
//		System.out.println(professor.getListaProfessor().size());
	}
	
//	@Test
//	public void testeCadastroInvalido() {
//		Professor professor1 = new Professor("Vitor Lira", "12456");
//		assertFalse(professor.cadastrarProfessor(professor1));
//	}
	
	@Test
	public void testeListagemCorreta() {
//		System.out.println(professor.listagemProfessor());
//		assertNotNull(listagemProfessor());
	}
//	
//	@Test
//	public void testeListagemIncorreta() {
//		assertNull(listagemProfessor());
//	}
//	
	@Test
	public void testeRemocaoValida() {
		assertTrue(professor.cadastrarProfessor(professor));
		assertTrue(professor.removerProfessor("12456"));
	}
	
	@Test
	public void testeRemovaoInvalida() {
		assertFalse(professor.removerProfessor("1245623"));
	}

}
