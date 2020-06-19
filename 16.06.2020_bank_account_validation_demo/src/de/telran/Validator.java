package de.telran;

import de.telran.exception.InvalidAgeException;
import de.telran.exception.InvalidBankCountryCodeException;
import de.telran.exception.InvalidIbanLengthException;
import de.telran.model.BankAccount;
import de.telran.model.Customer;

import java.util.Arrays;
import java.util.List;

public class Validator {

    public static void main(String[] args) throws Exception {

        List<Customer> customers = Arrays.asList(
                new Customer("Ivan", 15, new BankAccount("DE12121212121212")),
                new Customer("Piotr", 19, new BankAccount("DE1212121212121")),
                new Customer("Maria", 27, new BankAccount("DE12121212121212")),
                new Customer("Svetlana", 30, new BankAccount("DE12166121212")),
                new Customer("Elena", 15, new BankAccount("ES1212121212121"))
        );

        validateCustomers(customers);

    }

    public static void validateCustomers(List<Customer> customers) throws Exception {
        for (Customer customer:customers) {
            validateCustomer(customer);
        }
    }

    public static void validateCustomer(Customer customer) {
        System.out.println(customer);
        int exceptionCounter = 0;
        try {
            validateAge(customer);
        } catch (InvalidAgeException ex) {
            exceptionCounter++;
            System.out.println(exceptionCounter + " - " + ex);
        }
        try {
            validateBankCountryCode(customer.getAccount());
        } catch (InvalidBankCountryCodeException ex) {
            exceptionCounter++;
            System.out.println(exceptionCounter + " - " + ex);
        }

        try {
            validateIbanLength(customer.getAccount());
        } catch (InvalidIbanLengthException ex) {
            exceptionCounter++;
            System.out.println(exceptionCounter + " - " + ex);
        } finally {
            if (exceptionCounter == 0) {
                System.out.println("All data is OK");
            }
        }
    }

    private static void validateAge(Customer customer) throws InvalidAgeException {
        if (customer.getAge() < 17) {
            throw new InvalidAgeException("Invalid age " + customer.getAge());
        }
    }

    private static void validateIbanLength(BankAccount account) throws InvalidIbanLengthException {
        if (account.getIban().length() != 16) {
            throw new InvalidIbanLengthException("Invalid IBAN length " + account.getIban().length());
        }
    }

    private static void validateBankCountryCode(BankAccount account) throws InvalidBankCountryCodeException {
        if (!account.getIban().startsWith("DE")) {
            throw new InvalidBankCountryCodeException("Invalid IBAN bank country code ");
        }
    }

}
