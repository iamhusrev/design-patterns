package _1_behavioral_patterns._6_command_pattern;

import _1_behavioral_patterns._6_command_pattern.fx.Command;

public class AddCustomerCommand implements Command {

    private final CustomerService customerService;

    public AddCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void execute() {
        customerService.addCustomer();

    }
}
