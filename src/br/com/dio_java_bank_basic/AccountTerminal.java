package br.com.dio_java_bank_basic;


import br.com.dio_java_bank_basic.model.Account;

import java.util.Scanner;

public class AccountTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        System.out.println("Por favor, digite seu nome:");
        account.setCustomerName(scanner.nextLine());

        System.out.println("Por favor, digite o número da agência:");
        account.setAgencyNumber(scanner.next());

        System.out.println("Por favor, digite o número da conta:");
        account.setNumber(scanner.nextInt());

        System.out.println("Por favor, digite o saldo:");
        account.setBalance(scanner.nextDouble());

        System.out.println("\nOlá "
                .concat(account.getCustomerName())
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(account.getAgencyNumber())
                .concat(", conta ")
                .concat(String.valueOf(account.getNumber()))
                .concat(" e seu saldo ")
                .concat(String.valueOf(account.getBalance()))
                .concat(" já está disponível para saque."));

        scanner.close();
    }
}