package org.ies.bank.componentes;

import org.ies.bank.componentes.scanner.ScannerBanckReader;
import org.ies.bank.model.Account;
import org.ies.bank.model.Banck;

import java.util.Objects;

public class BanckApp2 {
    private final ScannerBanckReader scannerBanckReader;

    public BanckApp2(ScannerBanckReader scannerBanckReader) {
        this.scannerBanckReader = scannerBanckReader;
    }



    public  static void  run(ScannerBanckReader scannerBanckReader){
        //Simpre empesamos pidiendo los datos con el reader
        Banck banck = scannerBanckReader.reader();
        //Cuando se invoca finAccount se sustitulle
        Account account = banck.findAccount("ES0001");
        if(account!=null){
            account.deposit(500);

        }
        Account account2 =banck.findAccount("ES0002");
        if (account2!=null){
            account2.deposit(-30);
        }
        banck.showAccount("ES0001");
        banck.showAccount("ES0002");
        Objects.requireNonNull(account).deposit(-500);
        Objects.requireNonNull(account2).deposit(500);
        banck.showAccounts();

    }


}

