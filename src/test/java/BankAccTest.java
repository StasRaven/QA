import org.junit.*;

import static org.junit.Assert.*;

public class BankAccTest {

        private BankAccountId bankAccountId;


        @BeforeClass
        public static void beforeClass() {
            System.out.println("Before class");
        }
        @AfterClass
        public static void afterClass() {
            System.out.println("After cass");
        }

        @Before
        public void intTest(){
            bankAccountId = new BankAccountId();
        }
        @After
        public void aftertest(){
            System.out.println("for all");
        }


    @Test
    public void credit(){
        Assert.assertEquals(100, bankAccountId.credit(50, 50));
    }

    @Test
    public  void debit(){
        Assert.assertEquals(50, bankAccountId.debit(100, 50) );
    }

    @Test
        public  void debitMoreThenBalance(){
        Assert.assertEquals("Сумма снятия больше чем остаток на счету!",  100, bankAccountId.debitMoreThenBalance(100, 50,200) );

    }




}

   /* Создать класс BankAccount который будет иметь два поля 	accountNumber и balance.
        Реализовать в классе методы setBalance() который будет задавать баланс , credit() метод должен начислять средства на счет, debit() - снимать средтва со  счета.
        Реализовать условие что если сумма снятия меньше чем остаток на счету - вывести сообщение : “Сумма снятия больше чем остаок на счету!” .
        Создать обьект класса и проверить работу программы. */