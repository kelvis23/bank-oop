package org.ies.bank.componentes.random;

import org.ies.bank.componentes.Reader;
import org.ies.bank.model.Account;
import org.ies.bank.model.Banck;

import java.util.Random;

public class RandomBanckReader implements Reader<Banck> {
    private final static String[] NAME = {
            "BBA", "SANTADER", "BACO REAL", " iNG"
    };
    private final Random random;
    private final Reader <Banck> accountReader;

    public RandomBanckReader(Random random, Reader<Banck> accountReader) {
        this.random = random;
        this.accountReader = accountReader;
    }

    @Override
    public Banck read() {
        return new Banck(
                NAME[random.nextInt(NAME.length)],
                new Account[]{accountReader.read().showAccounts()}
        );
    }


}


