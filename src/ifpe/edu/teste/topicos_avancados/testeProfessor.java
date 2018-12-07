package ifpe.edu.teste.topicos_avancados;

import static org.junit.Assert.*;
import ifpe.edu.topicos_avancados.model.Professor;
import org.junit.Test;

public class testeProfessor {
	
	Professor professor = new Professor("Victor Lira", "12456");
	
	@Test
	public void testeCadastroValido() {
		assertTrue(professor.getPD().cadastrarProfessor(professor));
	}
	
	@Test
	public void testeCadastroInvalido() {
		Professor professor1 = new Professor("Victor Lira", "12456");
		assertFalse(professor.getPD().cadastrarProfessor(professor1));
	}
	
	@Test
	public void testeListagemCorreta() {
		System.out.println(professor.getPD().listagemProfessor());
		assertTrue(professor.getPD().listagemProfessor().contains("Victor"));
	}
	
	@Test
	public void testeRemocaoValida() {
		assertTrue(professor.getPD().removerProfessor("12456"));
	}	

	@Test
	public void testeRemovaoInvalida() {
		assertFalse(professor.getPD().removerProfessor("123"));
	}
	
}


