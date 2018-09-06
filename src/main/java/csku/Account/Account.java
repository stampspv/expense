package csku.Account;

public class Account {

    private String name;
    private double income;
    private double expense;

    public  Account(String name,double income,double expense){
        this.name = name;
        this.income = income;
        this.expense = expense;
    }

    public void addIncome(double add){
        this.income += add;
    }

    public void addExpense(double add){
        this.expense += add;
    }

    public String getName() {
        return name;
    }

    public double getIncome() {
        return income;
    }

    public double getExpense() {
        return expense;
    }

    @Override
    public String toString() {
        return "csku.Account.Account{" +
                "name='" + name + '\'' +
                ", income=" + income +
                ", expense=" + expense +
                ", summary=" + (income - expense) +
                '}';
    }
}
