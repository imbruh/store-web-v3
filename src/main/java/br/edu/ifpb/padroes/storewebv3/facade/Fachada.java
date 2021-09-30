package br.edu.ifpb.padroes.storewebv3.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.edu.ifpb.padroes.storewebv3.domain.Order;
import br.edu.ifpb.padroes.storewebv3.domain.Product;
import br.edu.ifpb.padroes.storewebv3.repository.ProductRepository;
import br.edu.ifpb.padroes.storewebv3.rest.ProductResource;
import br.edu.ifpb.padroes.storewebv3.service.OrderService;
import command.CommandHistory;
import command.CreateOrderCommand;
import mediator.Mediator;

@Component
public class Fachada {
	
	@Autowired
	OrderService orderService;
	
	@Autowired
	private ProductRepository productRepository;

	public Order criarPedido(Order order) {
		return orderService.createOrder(order);
	}
	
	public List<Product> listarProdutosDisponiveis() {
		return productRepository.getProductList();
	}
}
