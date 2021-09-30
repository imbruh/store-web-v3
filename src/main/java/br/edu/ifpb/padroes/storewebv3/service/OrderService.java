package br.edu.ifpb.padroes.storewebv3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stripe.model.Sku;

import br.edu.ifpb.padroes.storewebv3.domain.Order;
import br.edu.ifpb.padroes.storewebv3.domain.Product;
import br.edu.ifpb.padroes.storewebv3.payment.StripeApi;
import command.CommandHistory;
import command.CreateOrderCommand;
import mediator.Mediator;

@Service
public class OrderService {
	
	private CommandHistory history = new CommandHistory();
		
	@Autowired
	Mediator mediator;
		
	public Order createOrder(Order order) {
		CreateOrderCommand create = new CreateOrderCommand(order);
		if(create.execute()) {
			history.push(order);
			mediator.createOrder(order);
			return order;
		}
		return null;
	}
	
	public boolean createSku(Order order) {
		
		Sku sku = mediator.createSKU(order, order.getItems().get(0).getProduct());
		
		return true;
	}
	
	public List<Order> getOrders() {
		return history.history;
	}
	
	private void undo() {
	        if (history.isEmpty()) return;

	        history.pop();
	}
	
	
}
