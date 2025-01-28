package org.ies.bank.componentes.scanner;

import org.ies.bank.model.Account;
import org.ies.bank.model.Customer;

import java.util.Scanner;

public class ScannerAccountReader {
    private final Scanner scanner;
    private final ScannerCustomerReader scannerCustomerReader;

    public ScannerAccountReader(Scanner scanner, ScannerCustomerReader scannerCustomerReader) {
        this.scanner = scanner;
        this.scannerCustomerReader = scannerCustomerReader;
    }

    public Account read(){
        System.out.println("Introduce los datos de la cuenta");
        System.out.println(" Introduce el iban de la cuenta");
        String iban = scanner.nextLine();
        System.out.println(" Introduce el saldo de la cuenta");
        double balance =scanner.nextDouble();
        scanner.nextLine();
        System.out.println(" Introduce el cliente de la cuenta");
        Customer customer = scannerCustomerReader.read();
        return new Account(
                iban,
                balance,
                customer
        );
    }
}
