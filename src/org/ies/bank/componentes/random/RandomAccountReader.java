package org.ies.bank.componentes.random;

import org.ies.bank.componentes.AccountReader;
import org.ies.bank.componentes.CustomerReader;
import org.ies.bank.model.Account;
import org.ies.bank.model.Customer;

import java.util.Random;

public class RandomAccountReader implements AccountReader{
    private final Random random;
    private final CustomerReader customerReader;

    public RandomAccountReader(Random random, CustomerReader customerReader) {
        this.random = random;
        this.customerReader = customerReader;
    }

    @Override
    public Account read() {
        return new Account(
                random.nextLong(100000)+"CBD",
                random.nextDouble(1000000),
                customerReader.read()
        );
    }
}
