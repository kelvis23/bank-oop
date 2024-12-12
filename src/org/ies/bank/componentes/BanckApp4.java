package org.ies.bank.componentes;

import org.ies.bank.model.Account;
import org.ies.bank.model.Banck;

public class BanckApp4 {
    private final BanckReader banckReader;

    public BanckApp4(BanckReader banckReader) {
        this.banckReader = banckReader;
    }
    public void  run (){
        Banck banck =banckReader.reader();
        Account account = banck.findAccount("ES0001");

        if (account!=null){
            banck.showAccount("ES0001");

        }else {
            System.out.println("no existe la cuenta ");

        }
    }
}
