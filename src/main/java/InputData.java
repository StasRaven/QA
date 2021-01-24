public interface InputData {


       // int debit (int balance, int debit);
        int credit(int balance, int credit);
        boolean ifDebitMoreThenBalance(int balance, int credit, int debit);

}
