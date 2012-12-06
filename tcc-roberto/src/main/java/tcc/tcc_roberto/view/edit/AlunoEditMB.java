package tcc.tcc_roberto.view.edit;

import tcc.tcc_roberto.domain.Aluno;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractEditPageBean;

@ViewController
public class AlunoEditMB extends AbstractEditPageBean<Aluno, Long>{
	private static final long serialVersionUID = 1L;

	@Override
	public String delete() {
		return null;
	}

	@Override
	public String insert() {
		return null;
	}

	@Override
	public String update() {
		return null;
	}

	@Override
	protected void handleLoad() {
		
	}

}
