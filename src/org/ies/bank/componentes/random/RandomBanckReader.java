package org.ies.bank.componentes.random;

import org.ies.bank.componentes.AccountReader;
import org.ies.bank.componentes.BanckReader;
import org.ies.bank.model.Account;
import org.ies.bank.model.Banck;

import java.util.Random;
import java.util.Scanner;

public class RandomBanckReader implements BanckReader {
    private final static String[] NAME = {
            "BBA", "SANTADER", "BACO REAL", " iNG"
    };
    private final Random random;
    private final AccountReader accountReader;

    public RandomBanckReader(Random random, AccountReader accountReader) {
        this.random = random;
        this.accountReader = accountReader;
    }

    @Override
    public Banck read() {
        return new Banck(
                NAME[random.nextInt(NAME.length)],
                new Account[]{accountReader.read()}
        );
    }
}


