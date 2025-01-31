package org.ies.bank;

import org.ies.bank.model.Banck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        BanckReader banckReader= new BanckReader() {
            @Override
            public Banck read() {
                return null;
            }
        };

    }
}