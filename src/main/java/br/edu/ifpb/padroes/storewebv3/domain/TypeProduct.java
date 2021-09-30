package br.edu.ifpb.padroes.storewebv3.domain;

import visitor.ProductDiscount;

public interface TypeProduct {
	Long discount(ProductDiscount pd);
}
