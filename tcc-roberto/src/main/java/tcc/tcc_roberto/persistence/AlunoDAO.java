package tcc.tcc_roberto.persistence;

import tcc.tcc_roberto.domain.Aluno;
import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;

@PersistenceController
public class AlunoDAO extends JPACrud<Aluno, Long> {
	private static final long serialVersionUID = 1L;	

}
