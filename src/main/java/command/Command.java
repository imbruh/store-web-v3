package command;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.padroes.storewebv3.domain.Order;
import br.edu.ifpb.padroes.storewebv3.domain.OrderItem;

public abstract class Command {
	public Order order;
	protected List<List<OrderItem>> backup = new ArrayList<>();

    Command(Order order) {
        this.order = order;
    }

    void backup() {
        backup.add(order.getItems());
    }
    
    public void undo() {
    	backup.remove(0);
    }

    public abstract boolean execute();

}
