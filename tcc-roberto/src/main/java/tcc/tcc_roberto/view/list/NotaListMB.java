package tcc.tcc_roberto.view.list;

import java.util.List;

import javax.inject.Inject;

import tcc.tcc_roberto.business.NotaBC;
import tcc.tcc_roberto.domain.Nota;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractListPageBean;

@ViewController
public class NotaListMB extends AbstractListPageBean<Nota, Long> {
	private static final long serialVersionUID = 1L;

	@Inject
	private NotaBC bc;

	@Override
	protected List<Nota> handleResultList() {
		return bc.findAll();
	}

}
