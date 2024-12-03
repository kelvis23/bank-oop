package org.ies.bank.model;

import java.util.Arrays;
import java.util.Objects;

public class Account {
    private String iban;
    private double saldo;
    private Customer customers;

    public Account(String iban, double saldo, Customer customers) {
        this.iban = iban;
        this.saldo = saldo;
        this.customers = customers;
    }
    public void deposit (double amount){
        saldo+=amount;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Customer getCustomers() {
        return customers;
    }

    public void setCustomers(Customer customers) {
        this.customers = customers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(saldo, account.saldo) == 0 && Objects.equals(iban, account.iban) && Objects.equals(customers, account.customers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iban, saldo, customers);
    }

    @Override
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", saldo=" + saldo +
                ", customers=" + customers +
                '}';
    }
}
