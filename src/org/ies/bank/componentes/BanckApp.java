package org.ies.bank.componentes;

import org.ies.bank.model.Banck;

import java.util.Scanner;

public class BanckApp {
   private  final  Scanner scanner;
    private final BanckReader banckReader;
    private final AccountReader accountReader;
    private final CustomerReader customerReader;

    public BanckApp(Scanner scanner, BanckReader banckReader, AccountReader accountReader, CustomerReader customerReader) {
        this.scanner = scanner;
        this.banckReader = banckReader;
        this.accountReader = accountReader;
        this.customerReader = customerReader;
    }



    public static void menu(Banck banck) {
        Scanner scanner = new Scanner(System.in);
        int option;
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
                banck.showAccounts();

            } else if (option == 2) {
                System.out.println("introduce el iban");
                String iban = scanner.nextLine();
                banck.showAccount(iban);

            } else if (option == 3) {
                System.out.println("introduce el nif del usuario ");
                String nif =scanner.nextLine();
                banck.showCustomerAccount(nif);

            } else if (option == 4) {
                System.out.println("introduce el iban");
                String iban = scanner.nextLine();
                System.out.println("introduce la cantidad de dinero que seba ingeresar");
                double saldo = scanner.nextDouble();
                scanner.nextLine();
                banck.ingresCuenta(iban,saldo);

            } else if (option == 5) {
                System.out.println("introduce el iban");
                String iban = scanner.nextLine();
                System.out.println("introduce la cantidad de dinero que seba a sacar");
                double saldo = scanner.nextDouble();
                scanner.nextLine();
                banck.sacarCuenta(iban,saldo);

            } else if (option == 6) {
                System.out.println("Saliendo del menu del banco ...");

            } else {
                System.out.println("Error");
            }
        } while (option != 6);


    }




}