package ifpe.edu.teste.topicos_avancados;

import static org.junit.Assert.*;

import org.junit.Test;

public class testeAluno {
	
	@Test
	public void testeCadastroValido() {
		Aluno aluno = new aluno ("Rodrigo", "20171D");
		assertTrue(addAluno(aluno));
	}
	
	@Test
	public void testeCadastroInvalido() {
		Aluno aluno = new aluno ("Rodrigo", "20171D");
		assertFalse(addAluno(aluno));
	}
	
	@Test
	public void testeListagemCorreta() {
		assertNotNull(listagemAluno());
	}
	
	@Test
	public void testeRemocaoInvalido() {
		Aluno aluno = new aluno ("Rodrigo", "20171D32");
		assertFalse(removerAluno(aluno));
	}
	
	@Test
	public void testeRemovaoValida() {
		Aluno aluno = new aluno ("Rodrigo", "20171D");
		assertTrue(removerAluno(aluno));
	}

	@Test
	public void testeEncontrarPeloCodigoValido() {
		assertTrue(aluno.findByCode("2"));
	}
	
	@Test
	public void testEncontrarPeloCodigoInvalido() {
		assertFalse(aluno.findByCode("3"));
	}
	
}
