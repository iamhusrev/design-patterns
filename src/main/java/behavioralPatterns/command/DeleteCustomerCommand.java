package behavioralPatterns.command;

import behavioralPatterns.command.fx.Command;

public class DeleteCustomerCommand implements Command {

    private final CustomerService customerService;

    public DeleteCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void execute() {
        customerService.deleteCustomer();

    }
}
