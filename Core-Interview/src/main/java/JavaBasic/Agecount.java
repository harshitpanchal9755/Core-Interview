package JavaBasic;

import java.time.LocalDate;
import java.time.Period;

public class Agecount {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
		LocalDate cdate = LocalDate.of(2003, 06, 25);
		
		Period p = Period.between(cdate, date);
		
		System.out.println("year"+p.getYears());
		System.out.println("month"+p.getMonths());
		System.out.println("Day" +p.getDays());
	}

}
