package ifpe.edu.topicos_avancados.model;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa{

	private List<Professor> listaProfessor = new ArrayList<>();
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
	
	public boolean cadastrarProfessor(Professor professor) {
		return addProfessor(professor);
	}
	
	private boolean addProfessor(Professor professor) {
		
		if(findByCode(professor.codigo) instanceof Professor) {
			return false;
		}
		
		return listaProfessor.add(professor);
	}
	
	public String listagemProfessor() {
		return this.listaProfessor.toArray().toString();
	}
	
	public Professor findByCode(String code) {
		for (int i = 0; i < listaProfessor.size(); i++) {
			if(listaProfessor.get(i).codigo.equals(code))
				return listaProfessor.get(i);
		}
		return null;
	}
	
	public boolean removerProfessor(String codigo) {
		for (int i = 0; i < listaProfessor.size(); i++) {
			if(listaProfessor.get(i).codigo.equals(codigo)) {
				listaProfessor.remove(i);
				return true;
			}
			
		}
		return false;
	}
	
}
