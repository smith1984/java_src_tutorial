package ru.smith.beans;

import java.util.Random;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import ru.smith.qualifiers.Premium;

@Named
@RequestScoped
public class CustomerController {

    private static final Logger logger = Logger.getLogger(
            CustomerController.class.getName());
    @Inject
    @Premium
    private Customer customer;

    public String saveCustomer() {

        PremiumCustomer premiumCustomer = (PremiumCustomer) customer;

        logger.info("Сохраненяется следующая информация \n"
                + premiumCustomer.getFirstName() + " "
                + premiumCustomer.getLastName()
                + ", код скидки = "
                + premiumCustomer.getDiscountCode());

        return "confirmation";
    }
}
