package tcc.tcc_roberto.persistence;

import tcc.tcc_roberto.domain.Disciplina;
import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;

@PersistenceController
public class DisciplinaDAO extends JPACrud<Disciplina, Long> {
	private static final long serialVersionUID = 1L;	

}
