package br.edu.ifpb.padroes.storewebv3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.ifpb.padroes.storewebv3.domain.Order;
import command.CommandHistory;
import command.CreateOrderCommand;

@Service
public class OrderService {
	
	private CommandHistory history = new CommandHistory();
		
	public boolean createOrder(Order order) {
		CreateOrderCommand create = new CreateOrderCommand(order);
		if(create.execute()) {
			history.push(order);
			return true;
		}
		return false;
	}
	
	public List<Order> getOrders() {
		return history.history;
	}
	
	private void undo() {
	        if (history.isEmpty()) return;

	        history.pop();
	}
}
