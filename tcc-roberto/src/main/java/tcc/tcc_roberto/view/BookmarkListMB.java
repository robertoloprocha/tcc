package tcc.tcc_roberto.view;

import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import br.gov.frameworkdemoiselle.annotation.NextView;
import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractListPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;
import tcc.tcc_roberto.business.BookmarkBC;
import tcc.tcc_roberto.domain.Bookmark;

@ViewController
@NextView("./bookmark_edit.jsf")
@PreviousView("./bookmark_list.jsf")
public class BookmarkListMB extends AbstractListPageBean<Bookmark, Long> {

	private static final long serialVersionUID = 1L;

	@Inject
	private BookmarkBC bookmarkBC;
	
	@Override
	protected List<Bookmark> handleResultList() {
		return this.bookmarkBC.findAll();
	}
	
	@Transactional
	public String deleteSelection() {
		boolean delete;
		for (Iterator<Long> iter = getSelection().keySet().iterator(); iter.hasNext();) {
			Long id = iter.next();
			delete = getSelection().get(id);
			if (delete) {
				bookmarkBC.delete(id);
				iter.remove();
			}
		}
		return getPreviousView();
	}

}