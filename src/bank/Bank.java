/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package bank;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
 import java.util.IllegalFormatConversionException;
/**
 *
 * @author Zhanel
 */
public class Bank {
   
    public static int id = 0;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Имя: ");
                    String f = in.next();
                    System.out.println("Фамилия: ");
                    String l = in.next();
                    Client client = new Client(f,l);
                    System.out.println("Исходный счет:");
                    int bal = in.nextInt();
                    Account account = new Account(client,client,bal);
                   
        int user_choice = 2;

        do {
        //display menu to user
        //ask user for his choice and validate it (make sure it is between 1 and 6)
        System.out.println();
        System.out.println("1) Пополнить счет");
        System.out.println("2) Снять деньги со счета");
        System.out.println("3) Проверить счет");
        System.out.println("4) Показать счет в USD");
        System.out.println("5) Показать счет в EUR");
        System.out.println("6) История транзакций");
        System.out.println("7) Вывести транзакцию по ID");
        System.out.println("8) Информация о клиенте");
        System.out.println("9) Выход");
        System.out.println();
        System.out.print("Выберите действие [1-5]: ");
        user_choice = in.nextInt();
        switch (user_choice) {
            case 1:   
                System.out.println("Введите желаемую сумму:");
                int type1 = 1;
                int amount = in.nextInt();
                account.addTransaction(new Transaction(id++, type1, amount));
                break;
            case 2: System.out.println("Введите желаемую сумму:");
                      int w = in.nextInt();
                      int type2 = 2;
                      account.addTransaction(new Transaction(id++,type2, w));
                    break;
            case 3: System.out.println("Текущий счет: ");
                       account.getAccountBalance();
                    break;    
            case 4: System.out.println("Счет в USD: ");
                       account.convertToUSD();
                    break;
            case 5: System.out.println("Счет в EUR: ");
                   account.convertToEUR();
                    break;    
            case 6: System.out.println("История транзакций: ");
                   account.TransactionsHistory();
                    break;
            case 7: System.out.println("Введите ID транзакции: ");
                    int id = in.nextInt();
                    account.findByID(id);
                    break;
            case 8: System.out.println("Информация о клиенте: ");
                    account.getName();
                    break; 
            default: 
                     System.exit(0);
        }
}
while (user_choice != '9');
}
    } 