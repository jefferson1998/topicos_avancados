package ifpe.edu.teste.topicos_avancados;

import static org.junit.Assert.*;
import org.junit.Test;
import ifpe.edu.topicos_avancados.model.Aluno;

public class testeAluno {
	
	Aluno aluno = new Aluno ("Asaph Souza", "12456");

	@Test
	public void testeCadastroValido() {
		assertTrue(aluno.getAD().cadastrarAluno(aluno));
	}
	
	@Test
	public void testeCadastroInvalido() {
		Aluno aluno1 = new Aluno("Asaph Souza", "12456");
		assertFalse(aluno.getAD().cadastrarAluno(aluno1));
	}
	
	@Test
	public void testeListagemCorreta() {
		assertTrue(aluno.getAD().listagemAluno().contains("Asaph"));
	}
	
	@Test
	public void testeRemovaoValida() {
		assertTrue(aluno.getAD().removerAluno("12456"));
	}
	
	@Test
	public void testeRemocaoInvalido() {
		assertFalse(aluno.getAD().removerAluno("123"));
	}
	
}
