package org.ies.bank.componentes;

import org.ies.bank.model.Account;
import org.ies.bank.model.Customer;

import java.util.Scanner;

public class AccountReader {
    private final Scanner scanner;
    private final  CustomerReader customerReader;

    public AccountReader(Scanner scanner, CustomerReader customerReader) {
        this.scanner = scanner;
        this.customerReader = customerReader;
    }

    public Account read(){
        System.out.println("Itroduce los datos de la cuenta");
        System.out.println(" Introduce el iban de la cuenta");
        String iban = scanner.nextLine();
        System.out.println(" Introduce el saldo de la cuenta");
        double balance =scanner.nextDouble();
        scanner.nextLine();
        System.out.println(" Introduce el cliente de la cuenta");
        Customer customer = customerReader.read();
        return new Account(
                iban,
                balance,
                customer
        );
    }
}
