package tcc.tcc_roberto.persistence;

import tcc.tcc_roberto.domain.Nota;
import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;

@PersistenceController
public class NotaDAO extends JPACrud<Nota, Long> {
	private static final long serialVersionUID = 1L;	

}
