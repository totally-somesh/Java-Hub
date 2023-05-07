package Utils;

import java.util.HashMap;


import java.util.Map;
import com.app.Acctype.BankAccount;
import com.app.BankingException.BankingException;
import static com.app.rules.ValidationRules.*;

public class BankUtils {

	public static Map<Integer,BankAccount> populateMap() throws BankingException
	{
		HashMap<Integer,BankAccount> map=new HashMap<Integer, BankAccount>();
		System.out.println("put "+map.put(101, validateAllInputs(101,"Rama Kher","saving",12000,"2023-01-01", map)));
		System.out.println("put "+map.put(10, validateAllInputs(10,"Kiran Shekh","current",8000,"2023-02-11",map)));
		System.out.println("put "+map.put(50, validateAllInputs(50,"Shubham Agarwal","saving",14000,"2023-05-21",map)));
		System.out.println("put "+map.put(35, validateAllInputs(35,"Kunal Singh","fd",120000,"2022-11-01",map)));
		System.out.println("put "+map.put(48, validateAllInputs(48,"Rekha Patil","saving",111000,"2022-12-11",map)));
		System.out.println("put "+map.put(65, validateAllInputs(65,"Mihir Rao","saving",18000,"2023-05-01",map)));
		System.out.println("put "+map.put(90, validateAllInputs(90,"Shirish Inamdar","FD",80000,"2023-12-11",map)));
		return map;		
		
		
	}
	
}
