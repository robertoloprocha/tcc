package tcc.tcc_roberto.business;

import tcc.tcc_roberto.domain.Nota;
import tcc.tcc_roberto.persistence.NotaDAO;
import br.gov.frameworkdemoiselle.annotation.Startup;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@BusinessController
public class NotaBC extends DelegateCrud<Nota, Long, NotaDAO> {
	private static final long serialVersionUID = 1L;

	@Startup
	@Transactional
	public void load() {
		if (findAll().isEmpty()) {
			//insert(new Nota("Computação Paralela", 20, "123"));
		}
	}

}
