package command;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.padroes.storewebv3.domain.Order;

public class CommandHistory {

	 	public List<Order> history = new ArrayList<>();

	    public void push(Order o) {
	        history.add(o);
	    }

	    public void pop() {
	        history.remove(0);
	    }
	   
	    public boolean isEmpty() { return history.isEmpty(); }
}
