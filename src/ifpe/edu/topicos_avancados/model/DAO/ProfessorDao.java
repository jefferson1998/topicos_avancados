package ifpe.edu.topicos_avancados.model.DAO;

import java.util.ArrayList;
import java.util.List;

import ifpe.edu.topicos_avancados.model.Professor;

public class ProfessorDao {
	
	private static ProfessorDao PD;
	
	private List<Professor> listaProfessor;
	
	private ProfessorDao() {
		listaProfessor = new ArrayList<>();
	}
	
	public static ProfessorDao getProfessorDao() {
		
		if(PD != null)
			return PD;
		PD = new ProfessorDao();
		return PD;
		
	}
	
	public boolean cadastrarProfessor(Professor professor) {
		return addProfessor(professor);
	}
	
	private boolean addProfessor(Professor professor) {
		
		if(findByCode(professor.getCodigo()) instanceof Professor) {
			return false;
		}
		
		return listaProfessor.add(professor);
	}
	
	public String listagemProfessor() {
		String str = "";
		for(int i = 0; i < this.listaProfessor.size(); i++) {
			str = str + this.listaProfessor.get(i).toString() + "\n";
		}
		return str;
	}
	
	public Professor findByCode(String code) {
		for (int i = 0; i < listaProfessor.size(); i++) {
			if(listaProfessor.get(i).getCodigo().equals(code))
				return listaProfessor.get(i);
		}
		return null;
	}
	
	public boolean removerProfessor(String codigo) {
		for (int i = 0; i < listaProfessor.size(); i++) {
			if(listaProfessor.get(i).getCodigo().equals(codigo)) {
				listaProfessor.remove(i);
				return true;
			}
		}
		return false;
	}

}
