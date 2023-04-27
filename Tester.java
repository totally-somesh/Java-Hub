package com.app.Fruits;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int i = 0;
		int index = 0;
		Fruit[] frr = new Fruit[10];

		System.out.println("1.add mango 2.add orange 3.add apple");

		do {
			System.out.println("Enter choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (index < frr.length) {
					Mango m;
					System.out.println("add Mango :enter colour,weight,name of fruit");
					frr[index++] = new Mango(sc.next(), sc.nextDouble(), sc.next());
				}

				break;
			case 2:
				if (index < frr.length) {
					Orange o;
					System.out.println("add Apple :enter colour,weight,name of fruit");
					frr[index++] = new Apple(sc.next(), sc.nextDouble(), sc.next());
				}

				break;
			case 3:
				if (index < frr.length) {
					Apple a;
					System.out.println("add Orange:enter colour,weight,name of fruit");
					frr[index++] = new Orange(sc.next(), sc.nextDouble(), sc.next());
				}

				break;
			case 4: System.out.println("printing only names of all fruits");
				for (Fruit f : frr) {
					if (f != null) {
						System.out.println(f.getName());
					}
				}
				break;
			case 5:System.out.println("Ptinting all fruits details");
				for (Fruit f : frr) {
					if (f != null) {
						System.out.println(f);
					}
				}
				break;
				/*Mark a fruit in a basket , as stale(=not fresh)
			    i/p : index 
				o/p : error message (in case of invalid index) or mark it stale*/
			case 6:
				
				System.out.println("Enter match : ");
				int match = sc.nextInt();
				
				for(i=1; i<index; i++)
				{
					if(frr[i].getID() == index && match < index)
					{
						frr[i].setFresh(false);
					}
				}

				break;
			case 7:
					/*7. Mark all sour fruits stale 
					Hint : Use equals() method of the String class.*/
				    System.out.println("marking only sour fruits stale");
		
				    	for(Fruit f:frr)
				    	{
				    		if(f.taste().equals("sour"))
				    		{
				    			
				    			f.setFresh(false);	    			
				    			
				    	}
				    }
				    
				break;
				
			case 8:System.out.println("invoking fruit specific functionality");
			       System.out.println("enter match");
					int match1=sc.nextInt();
			       
					for(Fruit f:frr)
					{
						
					   if( f!=null && f.getID()==match1)	
					   {
					  	if(f instanceof Mango)
						{
						((Mango)f).pulp();
						}
						else if(f instanceof Orange)
						{
							((Orange)f).juice();
						}
						else if(f instanceof Apple)
						{
							((Apple)f).jam();
						}
					}
					}
				
				break;
			

			}

		} while (choice != 9);

	}

}
