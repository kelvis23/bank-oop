package org.ies.bank;

import org.ies.bank.componentes.scanner.ScannerAccountReader;
import org.ies.bank.componentes.BanckApp3;
import org.ies.bank.componentes.scanner.ScannerBanckReader;
import org.ies.bank.componentes.scanner.ScannerCustomerReader;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        var scanner =new Scanner(System.in);
        var customerReader = new ScannerCustomerReader(scanner);
        var accountReader =new ScannerAccountReader(scanner,customerReader);
        var banckReader = new ScannerBanckReader(scanner,accountReader);
        BanckApp3 banckApp3 = new BanckApp3(banckReader);


        banckApp3.run(banckReader);

    }
}

