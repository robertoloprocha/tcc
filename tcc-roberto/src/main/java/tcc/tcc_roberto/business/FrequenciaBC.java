package tcc.tcc_roberto.business;

import java.util.List;

import tcc.tcc_roberto.domain.Aluno;
import tcc.tcc_roberto.domain.Disciplina;
import tcc.tcc_roberto.domain.Frequencia;
import tcc.tcc_roberto.persistence.FrequenciaDAO;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;

@BusinessController
public class FrequenciaBC extends DelegateCrud<Frequencia, Long, FrequenciaDAO> {
	private static final long serialVersionUID = 1L;

	public List<Frequencia> findFrequeciaByAlunoAndDisciplinaAndMes(Aluno aluno, Disciplina disciplina, String mes) {
		return getDelegate().findFrequeciaByAlunoAndDisciplinaMes(aluno, disciplina, mes);
	}

}
