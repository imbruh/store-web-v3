package br.edu.ifpb.padroes.storewebv3.domain;

import visitor.ProductDiscount;

public class BookProduct extends Product implements TypeProduct{
	
	@Override
	public Long discount(ProductDiscount pd) {
		return pd.discountBook(this);
	}
}
