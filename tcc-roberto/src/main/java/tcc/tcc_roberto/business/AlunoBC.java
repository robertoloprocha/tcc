package tcc.tcc_roberto.business;

import tcc.tcc_roberto.domain.Aluno;
import tcc.tcc_roberto.persistence.AlunoDAO;
import br.gov.frameworkdemoiselle.annotation.Startup;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@BusinessController
public class AlunoBC extends DelegateCrud<Aluno, Long, AlunoDAO> {
	private static final long serialVersionUID = 1L;

	@Startup
	@Transactional
	protected void load() {
		if (findAll().isEmpty()) {
			insert(new Aluno("0001", "Roberto Lopes", "123"));
		}
	}

}
