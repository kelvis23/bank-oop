package org.ies.bank.componentes.scanner;

import org.ies.bank.model.Account;
import org.ies.bank.model.Banck;

import java.util.Scanner;

public class ScannerBanckReader {
    private  final  Scanner scanner;
    private  final ScannerAccountReader scannerAccountReader;

    public ScannerBanckReader(Scanner scanner, ScannerAccountReader scannerAccountReader) {
        this.scanner = scanner;
        this.scannerAccountReader = scannerAccountReader;

    }
    public Banck reader (){
        System.out.println("introduce el nombre del banco");
        String name =scanner.nextLine();
        System.out.println("Cuentas en el banco");
        int size =scanner.nextInt();
        scanner.nextLine();
        Account[]accounts =new Account[size];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i]= scannerAccountReader.read();

        }
        return new  Banck (
                name,
                accounts
        );
    }
}
