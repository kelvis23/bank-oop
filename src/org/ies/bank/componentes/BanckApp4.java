package org.ies.bank.componentes;

import org.ies.bank.componentes.scanner.ScannerBanckReader;
import org.ies.bank.model.Account;
import org.ies.bank.model.Banck;

public class BanckApp4 {
    private final ScannerBanckReader scannerBanckReader;

    public BanckApp4(ScannerBanckReader scannerBanckReader) {
        this.scannerBanckReader = scannerBanckReader;
    }
    public void  run (){
        Banck banck = scannerBanckReader.reader();
        Account account = banck.findAccount("ES0001");

        if (account!=null){
            banck.showAccount("ES0001");

        }else {
            System.out.println("no existe la cuenta ");

        }
    }
}
