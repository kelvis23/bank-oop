package org.ies.bank.componentes.random;

import org.ies.bank.componentes.Reader;
import org.ies.bank.model.Account;

import java.util.Random;

public class RandomAccountReader implements Reader<Account> {
    private final Random random;
    private final Reader<Account> customerReader;

    public RandomAccountReader(Random random, Reader<Account> customerReader) {
        this.random = random;
        this.customerReader = customerReader;
    }

    @Override
    public Account read() {
        return new Account(
                random.nextLong(100000)+"CBD",
                random.nextDouble(1000000),
                customerReader.read().getCustomers()
        );
    }

}
