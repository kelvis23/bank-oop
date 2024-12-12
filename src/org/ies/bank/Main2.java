package org.ies.bank;

import org.ies.bank.componentes.*;
import org.ies.bank.model.Banck;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        var scanner =new Scanner(System.in);
        var customerReader = new CustomerReader(scanner);
        var accountReader =new AccountReader(scanner,customerReader);
        var banckReader = new BanckReader (scanner,accountReader);
        BanckApp2 banckApp2 =new BanckApp2(banckReader);


        BanckApp2.run(banckReader);

    }
}
