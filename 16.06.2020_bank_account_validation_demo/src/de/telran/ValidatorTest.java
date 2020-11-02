package de.telran;

import de.telran.exception.InvalidAgeException;
import de.telran.model.BankAccount;
import de.telran.model.Customer;
import org.junit.Test;

public class ValidatorTest {

    @Test(expected = InvalidAgeException.class)
    public void testValidateCustomer() throws InvalidAgeException {
        Customer customer = new Customer("Ivan", 15, new BankAccount("DE12121212121212"));
        Validator.validateCustomer(customer);
    }
    //test is failing

}
