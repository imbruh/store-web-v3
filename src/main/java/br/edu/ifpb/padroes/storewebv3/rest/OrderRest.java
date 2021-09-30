package br.edu.ifpb.padroes.storewebv3.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpb.padroes.storewebv3.domain.Order;
import br.edu.ifpb.padroes.storewebv3.facade.Fachada;
import br.edu.ifpb.padroes.storewebv3.service.OrderService;

@RestController
@RequestMapping("/api/order")
public class OrderRest {

	@Autowired
	OrderService orderService;
	
	@Autowired
	Fachada fachada;
	
	@PostMapping("/create")
	 public Order createOrder(@RequestBody Order order) {
        return fachada.criarPedido(order); 
    }
	
	@PostMapping("/createSku")
	 public boolean createSku(@RequestBody Order order) {
       return orderService.createSku(order);
   }
	
	@GetMapping("/list")
	 public List<Order> listOrder() {
       return orderService.getOrders();
   }
}
