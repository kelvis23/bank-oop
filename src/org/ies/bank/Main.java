package org.ies.bank;

import org.ies.bank.componentes.scanner.ScannerAccountReader;
import org.ies.bank.componentes.BanckApp;
import org.ies.bank.componentes.scanner.ScannerBanckReader;
import org.ies.bank.componentes.scanner.ScannerCustomerReader;
import org.ies.bank.model.Banck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        ScannerCustomerReader scannerCustomerReader = new ScannerCustomerReader(scanner);
        ScannerAccountReader scannerAccountReader =new ScannerAccountReader(scanner, scannerCustomerReader);
        ScannerBanckReader scannerBanckReader = new ScannerBanckReader(scanner, scannerAccountReader);
        BanckApp banckApp= new BanckApp(scanner, scannerBanckReader, scannerAccountReader, scannerCustomerReader);

        Banck banck = scannerBanckReader.reader();
        BanckApp.menu(banck);
    }
}