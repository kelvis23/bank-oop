package org.ies.bank;

import org.ies.bank.componentes.AccountReader;
import org.ies.bank.componentes.BanckApp3;
import org.ies.bank.componentes.BanckReader;
import org.ies.bank.componentes.CustomerReader;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        var scanner =new Scanner(System.in);
        var customerReader = new CustomerReader(scanner);
        var accountReader =new AccountReader(scanner,customerReader);
        var banckReader = new BanckReader(scanner,accountReader);
        BanckApp3 banckApp3 = new BanckApp3(banckReader);


        banckApp3.run(banckReader);

    }
}

