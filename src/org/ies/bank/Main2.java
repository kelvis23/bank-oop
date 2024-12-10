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
       var banckApp2= new BanckApp(scanner,banckReader,accountReader,customerReader);

        Banck banck = banckReader.reader();

    }
}
