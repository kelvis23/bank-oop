package org.ies.bank;

import org.ies.bank.componentes.AccountReader;
import org.ies.bank.componentes.BanckApp;
import org.ies.bank.componentes.BanckReader;
import org.ies.bank.componentes.CustomerReader;
import org.ies.bank.model.Banck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        CustomerReader customerReader = new CustomerReader(scanner);
        AccountReader accountReader =new AccountReader(scanner,customerReader);
        BanckReader banckReader = new BanckReader (scanner,accountReader);
        BanckApp banckApp= new BanckApp(scanner,banckReader,accountReader,customerReader);

        Banck banck = banckReader.reader();
        BanckApp.menu(banck);
    }
}