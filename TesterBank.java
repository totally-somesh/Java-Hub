package tester;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.Scanner;
import static Utils.BankUtils.*;

import com.app.Acctype.AccountType;
import com.app.Acctype.BankAccount;
import com.app.BankingException.BankingException;
import static com.app.rules.ValidationRules.*;

public class TesterBank {

	public static void main(String[] args) throws BankingException {
		try (Scanner sc = new Scanner(System.in)) {
			Map<Integer, BankAccount> acctMap = populateMap();
			boolean exit = false;
			while (!exit) {
				System.out
						.println("1.create a/c 2.display all a/c 3.tansfer funds" + " 4.close a/c  5.fetch a/c summary "
								+ "6.display customer names having specified type of account"
								+ "7.modify transfer fund operations" + "8.apply simple interest on bank a/c  ");
				System.out.println("choose an option");
				try {

					switch (sc.nextInt()) {
					case 1:
						System.out.println("accNo, customerName, actype, balance,dob,");
						BankAccount account = validateAllInputs(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(),
								sc.next(), acctMap);
						acctMap.put(account.getAccNo(), account);
						System.out.println("account  created  !!!!");

						break;
					case 2:// display all customers
						for (BankAccount a : acctMap.values()) {
							System.out.println(a);
						}

						break;
					case 3:// transfer funds
						System.out.println("enter source a/c no and dest a/c no");
						BankAccount src = acctMap.get(sc.nextInt());
						if (src == null)
							throw new BankingException("invalid src account no");
						BankAccount desc = acctMap.get(sc.nextInt());
						if (desc == null) {
							throw new BankingException("invalid desc  account no");
						}
						src.transferFunds(desc, sc.nextDouble());
						System.out.println("fund transfered");

						break;
					case 4:// close account
						System.out.println("enter a/c no to close account");
						account = acctMap.remove(sc.nextInt());
						if (account == null) {
							throw new BankingException("Invalid a/c no,pls enter correct a/c to remove");
						} else {
							System.out.println("removed " + account);
						}

						break;
					case 5:// fetch account summary
						System.out.println("enter a/c no to fetch its details");
						account = acctMap.get(sc.nextInt());
						if (account == null) {
							throw new BankingException("pls enter correct a/c no");
						} else {
							System.out.println(account);
						}

						break;
					case 6:// specified acc customer names
						System.out.println("enter account type");
						AccountType acc = validateAccountType(sc.next());
						for (BankAccount a : acctMap.values()) {
							if (a.getType() == acc) {
								System.out.println(a.getCustomerName());
							}
						}

						break;
					case 7:

						/*
						 * Modify transfer funds operation : If dest a/c is locked(in active) , restore
						 * the balance in the src account
						 */
						System.out.println("Enter scr A/c NO AND desc a/c no");
						BankAccount src1 = acctMap.get(sc.next());
						BankAccount desc1 = acctMap.get(sc.next());
						src1.transferFunds(desc1, sc.nextDouble());

						break;
					case 8:
						
						System.out.println("enter account number");
						double interest=0;
						account =acctMap.get(sc.next());
						if(account!null && account.getType()==AccountType.SAVING)
						{
							interest=simpleInterest(account);
						}else {
							throw new BankingException("invalid account no");
						}
						System.out.println("simple interest is :"+interest);
					
						
						
						break;
					case 0:
						exit = true;
						break;

					}

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

		} // sc.close(autoclosable)

	}

	
	

	

}
