package ifpe.edu.teste.topicos_avancados;

import static org.junit.Assert.*;

import org.junit.Test;

import ifpe.edu.topicos_avancados.model.Professor;

public class testeAluno {
	
	Aluno aluno = new Aluno ("Asaph Souza", "12456");
	
	@Test
	public void testeCadastroValido() {
		assertTrue(aluno.getPD().cadastrarAluno(aluno));

	}
	
	@Test
	public void testeCadastroInvalido() {
		Aluno aluno1 = new Aluno("Asaph Souza", "12456");
		assertFalse(aluno.getPD().cadastrarAluno(aluno1));
	}
	
	@Test
	public void testeListagemCorreta() {
		assertTrue(aluno.getPD().listagemAluno().contains("Asaph"));
	}
	
	@Test
	public void testeRemovaoValida() {
		assertTrue(aluno.getPD().removerAluno("12456"));
	}
	
	@Test
	public void testeRemocaoInvalido() {
		assertFalse(aluno.getPD().removerAluno("123"));
	}

	
}
