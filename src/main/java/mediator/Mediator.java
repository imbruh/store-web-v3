package mediator;

import com.stripe.model.PaymentIntent;
import com.stripe.model.Sku;

import br.edu.ifpb.padroes.storewebv3.domain.Order;
import br.edu.ifpb.padroes.storewebv3.domain.Product;

public interface Mediator{
	
	public PaymentIntent createOrder(Order order);
	public Sku createSKU(Order order, Product product);
	
}
