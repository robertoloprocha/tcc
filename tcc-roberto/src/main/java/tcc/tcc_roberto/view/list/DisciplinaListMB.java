package tcc.tcc_roberto.view.list;

import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;
import javax.inject.Inject;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

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
	
	public void valueChangedAno(ValueChangeEvent vce) {
		System.out.println("------ENTROU NO LISTENER-------");
		this.ano = (Integer) vce.getNewValue();
		System.out.println("ANO: "+ano);
		
	}
	
	public void valueChangedSemestre(ValueChangeEvent vce) {
		System.out.println("------ENTROU NO LISTENER-------");
		this.semestre = (Integer) vce.getNewValue();
		System.out.println("SEMESTRE: "+semestre);
		
	}

	@Override
	protected List<Disciplina> handleResultList() {
		System.out.println("Ano: "+ano);
		System.out.println("Semestre: "+semestre);
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