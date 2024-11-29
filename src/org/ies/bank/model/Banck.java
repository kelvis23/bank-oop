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
