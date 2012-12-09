package tcc.tcc_roberto.view.list;

import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Inject;

import tcc.tcc_roberto.business.FrequenciaBC;
import tcc.tcc_roberto.domain.Disciplina;
import tcc.tcc_roberto.domain.Frequencia;
import tcc.tcc_roberto.view.SessionMB;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractListPageBean;

@ViewController
@SessionScoped
public class FrequenciaListMB extends AbstractListPageBean<Frequencia, Long> {
	private static final long serialVersionUID = 1L;

	@Inject
	private FrequenciaBC bc;

	@Inject
	private SessionMB sessionMB;

	private Disciplina disciplina;

	private String mes;

	public void valueChangedDisciplina(ValueChangeEvent vce){
		System.out.println("----------ENTROU NO LISTENER DISCIPLINA-------------");
		this.disciplina = (Disciplina) vce.getNewValue();
		System.out.println("DISCIPLINA: " + disciplina.getDescricao());
	}
	
	public void valueChangedMes(ValueChangeEvent vce){
		System.out.println("----------ENTROU NO LISTENER MÊS-------------");
		this.mes = (String) vce.getNewValue();
		System.out.println("MÊS: " + mes);
	}
	
	@Override
	protected List<Frequencia> handleResultList() {
		//System.out.println("MÊS: " + mes);
		//System.out.println("DISCIPLINAAAAAAAA" + disciplina.getDescricao());
		return bc.findFrequeciaByAlunoAndDisciplinaAndMes(sessionMB.getAluno(), disciplina, mes);
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

}