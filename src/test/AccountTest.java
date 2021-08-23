package test;

import main.Account;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AccountTest {

    @Test
    public void testAccount() throws Exception{
        Account account = new Account(10000);
    }

    @Test
    public void testGetBalance() throws Exception{
        Account account = new Account(10000);
        assertEquals("10000원으로 계좌 생성 후 잔고 조회", 10000, account.getBalance());

        account = new Account(1000);
        assertEquals(1000, account.getBalance());

        account = new Account(0);
        assertEquals(0, account.getBalance());
    }

}
