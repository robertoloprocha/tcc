package tcc.tcc_roberto.view.list;

import java.util.List;

import javax.inject.Inject;

import tcc.tcc_roberto.business.FrequenciaBC;
import tcc.tcc_roberto.domain.Frequencia;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractListPageBean;

@ViewController
public class FrequenciaListMB extends AbstractListPageBean<Frequencia, Long> {
	private static final long serialVersionUID = 1L;

	@Inject
	private FrequenciaBC bc;

	@Override
	protected List<Frequencia> handleResultList() {
		return bc.findAll();
	}

}
