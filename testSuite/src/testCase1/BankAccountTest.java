package testCase1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

	BankAccount acc = new BankAccount();
	
	@Test
	public void testDepositCash() {
		//fail("Not yet implemented");
		assertEquals(200,acc.depositCash(100));
	}

	@Test
	public void testWithdrawCash() {
		//fail("Not yet implemented");
		assertEquals(60,acc.withdrawCash(40));
	}

	@Test
	public void testGetBalance() {
		//fail("Not yet implemented");
		assertEquals(100,acc.getBalance());
		
	}

}
