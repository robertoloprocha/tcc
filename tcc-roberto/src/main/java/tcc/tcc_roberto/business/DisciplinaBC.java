package tcc.tcc_roberto.business;

import java.util.List;

import tcc.tcc_roberto.domain.Aluno;
import tcc.tcc_roberto.domain.Disciplina;
import tcc.tcc_roberto.persistence.DisciplinaDAO;
import br.gov.frameworkdemoiselle.annotation.Startup;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@BusinessController
public class DisciplinaBC extends DelegateCrud<Disciplina, Long, DisciplinaDAO> {
	private static final long serialVersionUID = 1L;

	@Startup
	@Transactional
	public void load() {
		if (findAll().isEmpty()) {
			insert(new Disciplina("Computação Paralela", 20));
			insert(new Disciplina("Engenharia de Software", 40));
		}
	}

	public List<Disciplina> findDisciplinasByAlunoAndAnoAndSemestre(Aluno aluno, Integer ano, Integer semestre) {
		return getDelegate().findDisciplinasByAlunoAndAnoAndSemestre(aluno, ano, semestre);
	}

}
