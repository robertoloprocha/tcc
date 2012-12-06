package tcc.tcc_roberto.view.list;

import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

import tcc.tcc_roberto.business.DisciplinaBC;
import tcc.tcc_roberto.domain.Disciplina;
import tcc.tcc_roberto.view.SessionMB;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractListPageBean;

@ViewController
@SessionScoped
public class DisciplinaListMB extends AbstractListPageBean<Disciplina, Long> {
	private static final long serialVersionUID = 1L;

	@Inject
	private DisciplinaBC bc;

	@Inject
	private SessionMB sessionMB;

	private Integer ano;

	private Integer semestre;

	@Override
	protected List<Disciplina> handleResultList() {
		return bc.findDisciplinasByAlunoAndAnoAndSemestre(sessionMB.getAluno(), ano, semestre);
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getSemestre() {
		return semestre;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

}
