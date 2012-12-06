package tcc.tcc_roberto.business;

import tcc.tcc_roberto.domain.Frequencia;
import tcc.tcc_roberto.persistence.FrequenciaDAO;
import br.gov.frameworkdemoiselle.annotation.Startup;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@BusinessController
public class FrequenciaBC extends DelegateCrud<Frequencia, Long, FrequenciaDAO> {
	private static final long serialVersionUID = 1L;

	@Startup
	@Transactional
	public void load() {
		if (findAll().isEmpty()) {
			//insert(new Frequencia("0001", "Roberto Lopes", "123"));
		}
	}

	

}
