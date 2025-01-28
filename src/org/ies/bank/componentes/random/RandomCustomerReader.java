package org.ies.bank.componentes.random;

import org.ies.bank.componentes.CustomerReader;
import org.ies.bank.model.Customer;

import java.util.Random;

public class RandomCustomerReader implements CustomerReader {
    private final static String[] NAME = {
            "Pepa", "GORGE", "BOB", "Pocoyo", "Calamardo", ",Elly"
    };
    private final static String[] SURNAMES = {
            "Pig", "Esponja", "López", "Pérez", "Sánchez", "Álvarez"
    };
    private final Random random;

    public RandomCustomerReader(Random random) {
        this.random = random;
    }


    @Override
    public Customer read() {
        return new Customer(
                random.nextLong(100000)+"X",
                NAME[random.nextInt(NAME.length)],
                SURNAMES[random.nextInt(SURNAMES.length)]
        );
    }
}
