package command;

import br.edu.ifpb.padroes.storewebv3.domain.Order;

public class CreateOrderCommand extends Command{
	
	public CreateOrderCommand(Order order) {
        super(order);
    }
	
    @Override
    public boolean execute() {

    	if(!this.backup.isEmpty()) {
    		this.order.setItems(backup.get(0));
    		this.undo();
    	}
    	 	
    	return true;
    }
}
