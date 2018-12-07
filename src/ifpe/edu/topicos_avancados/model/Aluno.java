package ifpe.edu.topicos_avancados.model;

public class Aluno extends Pessoa{

	private String matricula;

	public Aluno(String nome, String matricula) {
		super(nome);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
