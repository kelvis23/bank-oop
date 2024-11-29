package org.ies.bank.componentes;

import org.ies.bank.model.Customer;

import java.util.Scanner;

public class CustomerReader {
    private final Scanner scanner;

    public CustomerReader(Scanner scanner) {
        this.scanner = scanner;
    }
    public Customer read (){
        System.out.println("Introduce los datos del cliente");
        System.out.println("Introduce el nif del cliente");
        String nif =scanner.nextLine();
        System.out.println("Introduce el nombre del cliente");
        String name =scanner.nextLine();
        System.out.println("Introduce el apellido del cliente");
        String surname =scanner.nextLine();

        return new Customer(
                nif,
                name,
                surname
        );
    }
}
