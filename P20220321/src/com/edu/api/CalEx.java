package com.edu.api;

import java.util.Calendar;
import java.util.Scanner;

public class CalEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Please insert year : ");
		int year = Integer.parseInt(sc.nextLine());
		System.out.println("Plear insert month : ");
		int month = Integer.parseInt(sc.nextLine());
		
		CalEx cal = new CalEx();
		cal.createCalendar(year, month);
	
		sc.close();

	}
	
	public void createCalendar (int year, int month) {
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;

		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();

		start.set(year, month - 1, 1);
		end.set(year, month, 1);
		end.add(Calendar.DATE, -1);

		START_DAY_OF_WEEK = start.get(Calendar.DAY_OF_WEEK);
		END_DAY = end.get(Calendar.DATE);

		System.out.println("Year " + year + "/ Month " + month + " Cal\n" + "Sun\tMon\tTue\tWed\tThr\tFri\tSat");

		for (int q = 1; q < START_DAY_OF_WEEK; q++) {
			System.out.print("\t");
		}

		int cnt = START_DAY_OF_WEEK - 1;
		for (int q = 1; q <= END_DAY; q++) {
			System.out.print(q + "\t");
			cnt++;
			if (cnt == 7) {
				cnt = 0;
				System.out.println("\n");
			}
		}
	}
}