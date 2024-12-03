package org.ies.bank.model;

import java.util.Arrays;
import java.util.Objects;

public class Banck {
    private String name;
    private Account[] accounts;

    public Banck(String name, Account[] accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public void showAccounts() {
        for (var account : accounts) {
            System.out.println("IBAN " + account.getIban() + " saldo :" + account.getSaldo() + " NIF " + account.getCustomers().getNif());
        }

    }

    public void showAccount(String iban) {
        for (var account : accounts) {
            if (account.getIban().equals(iban)) {
                System.out.println("IBAN " + account.getIban() + " saldo :" + account.getSaldo() + " NIF " + account.getCustomers().getNif());
            }else if (!iban.equals(account.getIban())){
                System.out.println("No se a encontrado una cuenta con este IBAN");
            }
        }
    }

    public void showCustomerAccount(String nif) {
        for (var account : accounts) {
            if (account.getCustomers().getNif().equals(nif)) {
                System.out.println("IBAN " + account.getIban() + " saldo :" + account.getSaldo() + " NIF " + account.getCustomers().getNif());
            } else if (!nif.equals(account.getCustomers().getNif())) {
                System.out.println("No se a encontrado una cuenta con este Nif");
            }
        }

    }

    public void deposit(String iban, double amount) {
        for (Account account : accounts) {
            if (account.getIban().equals(iban)) {
                account.deposit(amount);
            }
        }
    }
    public Account findAccount(String iban){
        for (Account account : accounts) {
            if (account.getIban().equals(iban)) {
                return account;
            }
        }
        return null;
    }

    public void sacarCuenta(String iban, double saldo) {
        for (Account account : accounts) {
            if (account.getIban().equals(iban)) {
                account.setSaldo(account.getSaldo() - saldo);

            } else if (!iban.equals(account.getIban())) {
                System.out.println("No se a encontrado una cuenta con este IBAN");

            } else  {
                if (account.getSaldo()<saldo){
                    System.out.println("El saldo en la cuenta es menor al saldo que intentas sacar");
                }
            }
        }
    }
    public int numAccount (String nif ){
        int cont =0;
        for (var acount:accounts){
            if (acount.getCustomers().getNif().equals(nif)){
                cont+=1;
            }
        }
        return cont;
    }
    public Customer ibanCliente(String iban){
        for (var acounts : accounts){
            if (acounts.getIban().equals(iban)){
                Customer customers = acounts.getCustomers();
                return customers;
            }
        }
        return null;
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
