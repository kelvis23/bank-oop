package org.ies.bank.componentes;

import org.ies.bank.componentes.scanner.ScannerAccountReader;
import org.ies.bank.componentes.scanner.ScannerBanckReader;
import org.ies.bank.componentes.scanner.ScannerCustomerReader;
import org.ies.bank.model.Banck;

import java.util.Scanner;

public class BanckApp {
    private final Scanner scanner;
    private final ScannerBanckReader scannerBanckReader;
    private final ScannerAccountReader scannerAccountReader;
    private final ScannerCustomerReader scannerCustomerReader;

    public BanckApp(Scanner scanner, ScannerBanckReader scannerBanckReader, ScannerAccountReader scannerAccountReader, ScannerCustomerReader scannerCustomerReader) {
        this.scanner = scanner;
        this.scannerBanckReader = scannerBanckReader;
        this.scannerAccountReader = scannerAccountReader;
        this.scannerCustomerReader = scannerCustomerReader;
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
            System.out.println("6. buscar cuentas que tengan el mismo nif");
            System.out.println("7. tranferensia");
            System.out.println("8. salir");
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
                String nif = scanner.nextLine();
                banck.showCustomerAccount(nif);

            } else if (option == 4) {
                System.out.println("introduce el iban");
                String iban = scanner.nextLine();
                System.out.println("introduce la cantidad de dinero que seba ingeresar");
                double saldo = scanner.nextDouble();
                scanner.nextLine();
                banck.deposit(iban, saldo);

            } else if (option == 5) {
                System.out.println("introduce el iban");
                String iban = scanner.nextLine();
                System.out.println("introduce la cantidad de dinero que seba a sacar");
                double saldo = scanner.nextDouble();
                scanner.nextLine();
                banck.sacarCuenta(iban, saldo);

            } else if (option == 6) {
                System.out.println("introduce el nif del usuario ");
                String nif = scanner.nextLine();
                int customer = banck.countCustomerAccounts(nif);
                System.out.println(" este nif" + nif + " tiene " + customer + "  cuentas vinculadas");
            } else if (option ==7) {
                System.out.println("introduce un iban");
                String iban = scanner.nextLine();
                System.out.println("introduce el dinero que quieres sacar de la primera cuenta");
                double saldo =scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Introduce el iban de la segunda cuenta");
                String iabn2 = scanner.nextLine();

            } else if (option == 8) {
                System.out.println("Saliendo del menu del banco ...");

            } else {
                System.out.println("Error");
            }
        } while (option != 8);


    }


}