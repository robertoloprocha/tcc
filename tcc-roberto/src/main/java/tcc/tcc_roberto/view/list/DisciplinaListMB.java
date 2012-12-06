package tcc.tcc_roberto.view.list;

import java.util.List;

import javax.inject.Inject;

import tcc.tcc_roberto.business.DisciplinaBC;
import tcc.tcc_roberto.domain.Disciplina;
import tcc.tcc_roberto.view.SessionMB;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractListPageBean;

@ViewController
public class DisciplinaListMB extends AbstractListPageBean<Disciplina, Long> {
	private static final long serialVersionUID = 1L;

	@Inject
	private DisciplinaBC bc;

	@Inject
	private SessionMB sessionMB;

	@Override
	protected List<Disciplina> handleResultList() {
		return bc.findDisciplinasByAluno(sessionMB.getAluno());
	}

}
