package tcc.tcc_roberto.business;

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
	protected void load() {
		if (findAll().isEmpty()) {
			//insert(new Disciplina("Computação Paralela", 20, "123"));
		}
	}

}
