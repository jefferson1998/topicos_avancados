package ifpe.edu.topicos_avancados.model;

import ifpe.edu.topicos_avancados.model.DAO.AlunoDao;

public class Aluno extends Pessoa{

	private String matricula;
	private AlunoDao AD = AlunoDao.getAlunoDao();
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

	public AlunoDao getAD() {
		return AD;
	}

	@Override
	public String toString() {
		return "Aluno [Nome=" + super.getNome() + ", matricula=" + this.matricula + "]";
	}
	
}
