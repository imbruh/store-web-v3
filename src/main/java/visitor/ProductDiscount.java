package visitor;

import br.edu.ifpb.padroes.storewebv3.domain.BookProduct;
import br.edu.ifpb.padroes.storewebv3.domain.EletronicProduct;

public interface ProductDiscount {
	public Long discountBook(BookProduct book);
	public Long discountEletronic(EletronicProduct eletronic);
}
