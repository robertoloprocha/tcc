package tcc.tcc_roberto.persistence;

import java.util.List;

import javax.persistence.Query;

import tcc.tcc_roberto.domain.Aluno;
import tcc.tcc_roberto.domain.Disciplina;
import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;

@PersistenceController
public class DisciplinaDAO extends JPACrud<Disciplina, Long> {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public List<Disciplina> findDisciplinasByAlunoAndAnoAndSemestre(Aluno aluno, Integer ano, Integer semestre) {
		Query query = createQuery("select d from Disciplina d left join d.alunos a where a.matricula = :matricula and d.ano = :ano and d.semestre = :semestre ");
		query.setParameter("matricula", aluno.getMatricula());
		query.setParameter("ano", ano);
		query.setParameter("semestre", semestre);
		return query.getResultList();
	}

}
