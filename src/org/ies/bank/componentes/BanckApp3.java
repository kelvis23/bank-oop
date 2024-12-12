package org.ies.bank.componentes;

import org.ies.bank.model.Account;
import org.ies.bank.model.Banck;

public class BanckApp3 {
    private  final  BanckReader banckReader;

    public BanckApp3(BanckReader banckReader) {
        this.banckReader = banckReader;
    }

    public void run(BanckReader banckReader){
        Banck banck =banckReader.reader();
        Account account =banck.showAccounts();
        Account account1=banck.findAccount("Es0003");
        if (account1!=null){
            account1.deposit(-50);
        }
        Account account2=banck.showCustomerAccount("000X");
        Account account3=banck.findAccount("Es0004");
        if (account2!= null){
            account3.deposit(300);
        }
        banck.showAccounts();
        //me falta
        //mostrar los datos   del titular de la cuenta Es0001
        banck.showAccount("Es0001");

    }
}
