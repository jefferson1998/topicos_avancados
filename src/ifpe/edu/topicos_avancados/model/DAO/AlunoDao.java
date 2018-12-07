package ifpe.edu.topicos_avancados.model.DAO;

import java.util.ArrayList;
import java.util.List;
import ifpe.edu.topicos_avancados.model.Aluno;

public class AlunoDao {
	
private static AlunoDao AD;
	
	private List<Aluno> listaAluno;
	
	private AlunoDao() {
		listaAluno = new ArrayList<>();
	}
	
	public static AlunoDao getAlunoDao() {
		
		if(AD != null)
			return AD;
		AD = new AlunoDao();
		return AD;
		
	}
	
	public boolean cadastrarAluno(Aluno aluno) {
		return addAluno(aluno);
	}
	
	private boolean addAluno(Aluno aluno) {
		
		if(findByCode(aluno.getMatricula()) instanceof Aluno) {
			return false;
		}
		
		return listaAluno.add(aluno);
	}
	
	public Aluno findByCode(String matricula) {
		for (int i = 0; i < listaAluno.size(); i++) {
			if(listaAluno.get(i).getMatricula().equals(matricula))
				return listaAluno.get(i);
		}
		return null;
	}
	
	public String listagemAluno() {
		String str = "";
		for(int i = 0; i < this.listaAluno.size(); i++) {
			str = str + this.listaAluno.get(i).toString() + "\n";
		}
		return str;
	}
	
	

}
