package org.ies.bank.componentes;

import org.ies.bank.model.Account;
import org.ies.bank.model.Banck;

import java.util.Scanner;

public class BanckApp {

    private final BanckReader banckReader;
    private final AccountReader accountReader;
    private final CustomerReader customerReader;

    public BanckApp(BanckReader banckReader, AccountReader accountReader, CustomerReader customerReader) {
        this.banckReader = banckReader;
        this.accountReader = accountReader;
        this.customerReader = customerReader;
    }

    public static void Menu(Banck banck) {
        Scanner scanner = new Scanner(System.in);
        int option;
        System.out.println("introduciendo datoss del banco");
        do {
            System.out.println("menu");
            System.out.println("1.mostrar las cuentas del banco");
            System.out.println("2.mostrar datos de una cuenta");
            System.out.println("3.MOSTRAR LOS DATOS DE LAS CUENTAS DE UN CLIENTE");
            System.out.println("4.ingresar dinero en cuenta");
            System.out.println("5.sacar dinero de una cuenta");
            System.out.println("6. salir");
            option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                cuentasBanck(banck.getAccounts());

            } else if (option == 2) {
                System.out.println("introduce el iban");
                String iban = scanner.nextLine();
                datosAccount(iban, banck.getAccounts());

            } else if (option == 3) {
                System.out.println("introduce el nif del usuario ");
                String nif =scanner.nextLine();
                datosNAme(banck.getAccounts(),nif );

            } else if (option == 4) {

            } else if (option == 5) {

            } else if (option == 6) {
                System.out.println("Saliendo del menu del banco ...");

            } else {
                System.out.println("Error");
            }
        } while (option != 6);


    }

    public static void cuentasBanck(Account[] accounts) {
        for (Account account : accounts) {

            System.out.println(account);
        }

    }

    public static void datosAccount(String iban, Account[] accounts) {
        for (Account account : accounts) {
            if (account.getIban().equals(iban)){
                System.out.println(account);
            }
        }

    }
    public static void datosNAme(Account[]accounts, String nif){
        for (Account account:accounts){
            if (account.getCustomers().getNif().equals(nif)){
                System.out.println(account);
            }
        }
    }
    public static void  ingresCuent(String iban,double saldo ,Account[]accounts){
        for (Account account : accounts){
            if (account.getIban().equals(iban)){
                account.setSaldo(account.getSaldo()+saldo);
            }
        }
    }
    public static void  sacarCuenta(String iban , double saldo,Account[]accounts ){
        for (Account account: accounts){
            if (account.getIban().equals(iban)){
                account.setSaldo(account.getSaldo()-saldo);
            }
        }
    }
}