package tcc.tcc_roberto.business;

import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;

import tcc.tcc_roberto.domain.Bookmark;
import tcc.tcc_roberto.persistence.BookmarkDAO;

@BusinessController
public class BookmarkBC extends DelegateCrud<Bookmark, Long, BookmarkDAO> {
	
	private static final long serialVersionUID = 1L;
	
}
