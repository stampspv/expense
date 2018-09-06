package account;

import csku.Account.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class UnitTestIncome {

    Account ac;
    @BeforeEach
    void init(){
        ac = new Account ("Stamp",0,0);
        ac.addIncome(3000);
    }
    @Test
    public void testCurrentincome(){
        assertEquals(2500,ac.getIncome());
    }

    @Test
    public void testNormalCaseofspendmoney(){
        ac.addExpense(500);
        assertEquals(500,ac.getExpense());
    }

    @Test
    public void addMoneytoaccount(){
        ac.addIncome(700);
        assertEquals(3700,ac.getIncome());
    }

    @Test
    public void lastSpend(){
        ac.addExpense(2000);
        assertEquals(2500,ac.getExpense());
    }

}

