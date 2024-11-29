package org.ies.bank.componentes;

import org.ies.bank.model.Account;
import org.ies.bank.model.Banck;

import java.util.Scanner;

public class BanckReader {
    private  final  Scanner scanner;
    private  final  AccountReader accountReader;

    public BanckReader(Scanner scanner, AccountReader accountReader) {
        this.scanner = scanner;
        this.accountReader = accountReader;

    }
    public Banck reader (){
        System.out.println("imtroduce los datos del banco");
        System.out.println("introduce el nombre del banco");
        String name =scanner.nextLine();
        System.out.println("Cuentas en el banco");
        int size =scanner.nextInt();
        scanner.nextLine();
        Account[]accounts =new Account[size];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i]=accountReader.read();

        }
        return new  Banck (
                name,
                accounts
        );
    }
}
