package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

    public static void main(String[] args) {
        //polimorfismo

        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingAccount(1023, "Maria", 1000.0, 0.01);
        x.withdraw(50.0);
        y.withdraw(50.0);


       /* heranca exemplos abaixo

        segunda parte abaixo.
        Account acc1 = new Account(1001, "Alex", 1000.0);
                acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingAccount(1002, "Maria", 1000.0, 0.1);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
        */


      /*  abaixo é a primeira parte dos testes
      Account acc = new Account(1001, "Alex", 0.0);


        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);
        //UP CASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0,200);
        Account acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01);

        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);
        // nem sempre é possivel fazer o downcasting, o exemplo abaixo mostra bem o problema.
        // BusinessAccount acc5 = (BusinessAccount) acc3;
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingAccount){
            SavingAccount acc5 = (SavingAccount)acc3;
            acc5.UpdateBalance();
            System.out.println("UPDATE!");



        }
   */
    }
}

