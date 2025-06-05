package ProgrammingChallenge;

import java.time.Month;
import java.time.YearMonth;
import java.util.Scanner;

public class MonthGenerator{
	public static void main(String[] args) {			
		new	InputScanner();
	}
}

class EnterMonth{
	int month;
	
	public EnterMonth(int MonthAsNumber){
		this.month = MonthAsNumber;
		System.out.println(month);		
	
	}
}

class InputScanner{
	public InputScanner(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter date as number: ");
		int x = sc.nextInt();
		new Switch(x);		
		sc.close();
	}
}

class Switch{
	private int mNumber;

	public void Sout(){
		DaysOfMonth dm = new DaysOfMonth(mNumber);
		System.out.println( Month.of(mNumber) 
							+ " has "
							+ dm.getDaysOfTheMonth()
							+ " days"
							);
	}

	public Switch(int monthNumber){
		this.mNumber = monthNumber;	
	
		switch (monthNumber){
			case 1:	Sout();break;
			case 2:	Sout(); break;
			case 3: Sout(); break;
			case 4: Sout(); break;
			case 5: Sout(); break;
			case 6: Sout(); break;
			case 7: Sout(); break;
			case 8: Sout(); break;
			case 9: Sout(); break;
			case 10:Sout(); break;
			case 11:Sout(); break;
			case 12:Sout(); break;

			default: 
				System.out.println();
				System.out.println("(from 1-12 number only)");
				MonthGenerator.main(null);
				break;
		}
	}
}

class DaysOfMonth{
	int year = 2025;
	int doMonth;
	public DaysOfMonth(int numberOfMonth){
		YearMonth ym = YearMonth.of(year, numberOfMonth);
		int dayOfMonth = ym.lengthOfMonth();
		doMonth = dayOfMonth;
	}

	public int getDaysOfTheMonth(){
		return doMonth;
	}
}
