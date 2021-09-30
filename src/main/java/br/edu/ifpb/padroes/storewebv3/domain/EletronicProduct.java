package br.edu.ifpb.padroes.storewebv3.domain;

import visitor.ProductDiscount;

public class EletronicProduct extends Product implements TypeProduct{

	@Override
	public Long discount(ProductDiscount pd) {
		return pd.discountEletronic(this);
	}
}
