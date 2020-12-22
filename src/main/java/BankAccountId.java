public class BankAccountId implements InputData {

    public static void main(String[] args) {

       BankAccount account = new BankAccount("asdf11", 100, 10, 19);
        System.out.println("The balance = " + account.getDebit());

    }


    @Override
    public int debit(int balance, int debit) {
        return balance - debit;
    }

    @Override
    public int credit(int balance, int credit) {
        return balance + credit;
    }

    @Override
    public int debitMoreThenBalance(int balance, int credit, int debit) {
        return balance;
    }

}

class BankAccount {

    private String accountNumber;
    private int balance;
    private int credit;
    private int debit;

    public BankAccount(String accountNumber, int balance, int credit, int debit) {
            this.accountNumber = accountNumber;
            this.balance = balance;
            this.credit = credit;
        if(debit > balance+credit){
            System.out.println("Сумма снятия больше чем остаок на счету!");
        }
        else
            this.debit = debit;

    }


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
            }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return balance;
    }

    public void setCredit(int credit){
        this.credit = credit;
    }
    public int getCredit(){
        return balance + credit;
    }

    public void setDebit(int debit){
            this.debit = debit;
        }
    public int getDebit(){
            return balance+credit-debit;
    }



    public int credit() {
        return this.getBalance() + this.getCredit();
    }

    public int credit(int balance, int credit) {
        return balance + credit;
    }

    public int debitMoreThenBalance(int balance, int credit, int debit) {
        return balance;
    }
}

   /* Создать класс BankAccount который будет иметь два поля 	accountNumber и balance.
        Реализовать в классе методы setBalance() который будет задавать баланс , credit() метод должен начислять средства на счет, debit() - снимать средтва со  счета.
        Реализовать условие что если сумма снятия меньше чем остаток на счету - вывести сообщение : “Сумма снятия больше чем остаок на счету!” .
        Создать обьект класса и проверить работу программы. */
