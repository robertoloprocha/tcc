package tcc.tcc_roberto.persistence;

import java.util.List;

import javax.persistence.Query;

import tcc.tcc_roberto.domain.Aluno;
import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;

@PersistenceController
public class AlunoDAO extends JPACrud<Aluno, Long> {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public Aluno findUserByMatricula(String matricula, String senha) {
		Query query = createQuery("select o from Aluno o where o.matricula = :matricula and o.senha = :senha ");
		query.setParameter("matricula", matricula);
		query.setParameter("senha", senha);
		List<Aluno> alunos = query.getResultList();
		return alunos.isEmpty() ? new Aluno() : alunos.get(0);
	}
}
