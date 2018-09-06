package csku.Account;

public class Main {

    public static void main(String args[]){

        // init
        Account stamp = new Account("Stamp",0,0);

        // add income
        stamp.addIncome(500);
        System.out.println(stamp.toString());

        // add income again
        stamp.addIncome(730);
        System.out.println(stamp.toString());

        // add expense
        stamp.addExpense(300);
        System.out.println(stamp.toString());

        // add expense again
        stamp.addExpense(220);
        System.out.println(stamp.toString());

    }
}
