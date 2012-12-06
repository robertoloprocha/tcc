package tcc.tcc_roberto.persistence;

import java.util.List;

import javax.persistence.Query;

import tcc.tcc_roberto.domain.Aluno;
import tcc.tcc_roberto.domain.Disciplina;
import tcc.tcc_roberto.domain.Frequencia;
import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;

@PersistenceController
public class FrequenciaDAO extends JPACrud<Frequencia, Long> {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public List<Frequencia> findFrequeciaByAlunoAndDisciplinaMes(Aluno aluno, Disciplina disciplina, String mes) {
		Query query = createQuery("select f from Frequencia f left join f.disciplina.alunos a where f.disciplina = :disciplina and a.matricula = :matricula and f.mes = :mes ");
		query.setParameter("disciplina", disciplina);
		query.setParameter("matricula", aluno.getMatricula());
		query.setParameter("mes", mes);
		return query.getResultList();
	}
}
