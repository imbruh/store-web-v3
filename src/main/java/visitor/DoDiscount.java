package visitor;

import br.edu.ifpb.padroes.storewebv3.domain.BookProduct;
import br.edu.ifpb.padroes.storewebv3.domain.EletronicProduct;

public class DoDiscount implements ProductDiscount{
	
	public Long discountBook(BookProduct book) {
		return book.getPrice() - 20; 
	}
	
	public Long discountEletronic(EletronicProduct eletronic) {
		return eletronic.getPrice() - 40; 
	}
}
