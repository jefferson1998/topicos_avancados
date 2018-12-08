package ifpe.edu.topicos_avancados.model;

import ifpe.edu.topicos_avancados.model.DAO.ProfessorDao;

public class Professor extends Pessoa{

	private ProfessorDao PD = ProfessorDao.getProfessorDao();
	private String codigo;

	public Professor(String nome, String codigo) {
		super(nome);
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Professor [Nome=" + super.getNome() + ", codigo=" + this.codigo + "]";
	}
	
}
