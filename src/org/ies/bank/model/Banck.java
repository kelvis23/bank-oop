package org.ies.bank.model;

import java.util.Arrays;
import java.util.Objects;

public class Banck {
    private String name;
    private Account[]accounts;

    public Banck(String name, Account[] accounts) {
        this.name = name;
        this.accounts = accounts;
    }
    public void showAccounts( ){
        for(var account :accounts){
            account.showInfo();
            //System.out.println("IBAN "+account.getIban()+" saldo :"+account.getSaldo()+" NIF "+account.getCustomers().getNif());
        }

    }
    public void showAccount(String iban){
        for (var account: accounts){
            if (account.getIban().equals(iban)){
                //error en esta parte
               account.showInfo();
            }
        }
    }
    public void showCustomerAccount(String nif){
        for (var acount : accounts){
            if (acount.getCustomers().getNif().equals(nif)){
                //error en esta parte
                acount.showInfo();
            }


        }

    }
    public  void  ingresCuenta(String iban,double saldo ){
        for (Account account : accounts){
            if (account.getIban().equals(iban)){
                account.setSaldo(account.getSaldo()+saldo);
            }
        }
    }

    public void  sacarCuenta(String iban , double saldo ){
        for (Account account: accounts){
            if (account.getIban().equals(iban)){
                account.setSaldo(account.getSaldo()-saldo);

            }
        }


    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Banck banck = (Banck) o;
        return Objects.equals(name, banck.name) && Objects.deepEquals(accounts, banck.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Arrays.hashCode(accounts));
    }

    @Override
    public String toString() {
        return "Banck{" +
                "name='" + name + '\'' +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }
}
