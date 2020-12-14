public class BankAccount {
//comment for commin
    private String _accountNumber;
    private int _balance;
    private int _credit;
    private int _debit;

    public setBalance(int balance){

        this._balance = balance;

    }

    public credit(int credit){
        this._credit = credit;

    }

    public debit(int debit){

        this._debit = debit;

    }

    public accountBalance() {

        this._balance = this._balance + this._credit;

        if (this._balance < this._debit) {
            System.out.println("Сумма снятия больше чем остаток на счету!");
        }
        else
            this._balance = this._balance - this._debit;
        return this._balance;


    }
}
   /* Создать класс BankAccount который будет иметь два поля 	accountNumber и balance.
        Реализовать в классе методы setBalance() который будет задавать баланс , credit() метод должен начислять средства на счет, debit() - снимать средтва со  счета.
        Реализовать условие что если сумма снятия меньше чем остаток на счету - вывести сообщение : “Сумма снятия больше чем остаок на счету!” .
        Создать обьект класса и проверить работу программы. */
