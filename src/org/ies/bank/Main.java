package org.ies.bank;

import org.ies.bank.componentes.Reader;
import org.ies.bank.componentes.random.RandomAccountReader;
import org.ies.bank.model.Account;
import org.ies.bank.model.Banck;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random =new Random();
        Reader<Account> randomAccountReader = new RandomAccountReader();

    }
}