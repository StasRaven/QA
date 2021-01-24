import org.junit.*;

import static org.junit.Assert.*;

public class BankAccTest {

        private BankAccountId bankAccountId;
        int balance = 100;
        int credit = 100;
        int debit = 150;

        @Before
        public void intTest(){
            bankAccountId = new BankAccountId();

        }

        @After
        public void aftertest(){
            System.out.println("It's work");
        }


        @Test
        public void testCredit(){

        assertEquals(bankAccountId.credit(balance, credit), bankAccountId.credit(balance, credit));
        
        }

/*    @Test
    public void testDebit(){
        Assert.assertEquals(bankAccountId.debit(balance, debit), bankAccountId.debit(balance, debit) );
    }*/

        @Test
            public void ifDebitMoreThenBalance(){
            Assert.assertTrue("Сумма снятия больше чем остаток на счету!", bankAccountId.ifDebitMoreThenBalance(balance, credit, debit) );

        }



}

   /* Создать класс BankAccount который будет иметь два поля 	accountNumber и balance.
        Реализовать в классе методы setBalance() который будет задавать баланс , credit() метод должен начислять средства на счет, debit() - снимать средтва со  счета.
        Реализовать условие что если сумма снятия меньше чем остаток на счету - вывести сообщение : “Сумма снятия больше чем остаок на счету!” .
        Создать обьект класса и проверить работу программы. */