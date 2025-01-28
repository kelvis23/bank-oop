package org.ies.bank;

import org.ies.bank.componentes.*;
import org.ies.bank.componentes.scanner.ScannerAccountReader;
import org.ies.bank.componentes.scanner.ScannerBanckReader;
import org.ies.bank.componentes.scanner.ScannerCustomerReader;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        var scanner =new Scanner(System.in);
        var customerReader = new ScannerCustomerReader(scanner);
        var accountReader =new ScannerAccountReader(scanner,customerReader);
        var banckReader = new ScannerBanckReader(scanner,accountReader);
        BanckApp2 banckApp2 =new BanckApp2(banckReader);


        BanckApp2.run(banckReader);

    }
}
