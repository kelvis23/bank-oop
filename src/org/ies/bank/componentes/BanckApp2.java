package org.ies.bank.componentes;

import org.ies.bank.model.Account;
import org.ies.bank.model.Banck;

import java.util.Scanner;

public class BanckApp2 {
    private final  BanckReader banckReader;

    public BanckApp2(BanckReader banckReader) {
        this.banckReader = banckReader;
    }



    public  void  run(){
        //Simpre empesamos pidiendo los datos con el reader
        Banck banck =banckReader.reader();
        //Cuando se invoca finAccount se sustitulle
        Account account = banck.findAccount("ES0001");
        if(account!=null){
            account.deposit(500);
        }
        Account account2 =banck.findAccount("ES0002");
        if (account2!=null){
            account2.deposit(-30);

        }
    }


}

