package tcc.tcc_roberto.view.list;

import java.util.List;

import javax.inject.Inject;

import tcc.tcc_roberto.business.AlunoBC;
import tcc.tcc_roberto.domain.Aluno;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractListPageBean;

@ViewController
public class AlunoListMB extends AbstractListPageBean<Aluno, Long> {
	private static final long serialVersionUID = 1L;

	@Inject
	private AlunoBC bc;

	@Override
	protected List<Aluno> handleResultList() {
		return bc.findAll();
	}

}
