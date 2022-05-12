package com.javatree;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreemapsetExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*HashSet<Integer> rollNumbers = new HashSet<>();
		rollNumbers.add(2);
		rollNumbers.add(3);
		rollNumbers.add(1);
		rollNumbers.add(4);
		rollNumbers.add(5);
		rollNumbers.add(4);

		for (Integer item : rollNumbers) {
			System.out.println(item);
		}
		
		System.out.println("\n");
		
		HashSet<Integer> rollNumbers2 = new HashSet<>();
		rollNumbers2.add(2);
		rollNumbers2.add(3);
		rollNumbers2.add(1);
		rollNumbers2.add(4);
		rollNumbers2.add(5);
		rollNumbers2.add(4);

		for (Integer item2 : rollNumbers2) {
			System.out.println(item2);
		}
		
		System.out.println("\n");
		
		HashSet<String> CityName2 = new HashSet<>();
		CityName2.add("Jakarta");
		CityName2.add("Surabaya");
		CityName2.add("Semarang");
		CityName2.add("Yogyakarta");
		CityName2.add("Ambon");
		CityName2.add("Palembang");
		
		for (String city2 : CityName2) {
			System.out.println(city2);
		}
		
		System.out.println("\n");*/
		
		System.out.println("===============TreeSet===============\n");
		TreeSet<String> CityName = new TreeSet<>();
		CityName.add("Jakarta");
		CityName.add("Surabaya");
		CityName.add("Semarang");
		CityName.add("Yogyakarta");
		CityName.add("Ambon");
		CityName.add("Palembang");
		
		for (String city : CityName) {
			System.out.println(city);
		}
		
		System.out.println("\n");
		
		System.out.println("===============TreeMap===============\n");
		TreeMap<Integer, String> MonthlyNumber = new TreeMap<>();
		MonthlyNumber.put(1, "January");
		MonthlyNumber.put(4, "April");
		MonthlyNumber.put(1, "January");
		MonthlyNumber.put(5, "May");
		MonthlyNumber.put(6, "June");
		MonthlyNumber.put(7, "July");
		MonthlyNumber.put(9, "September");
		MonthlyNumber.put(8, "September");
		MonthlyNumber.put(8, "August");
		MonthlyNumber.put(10, "October");
		MonthlyNumber.put(3, "March");
		MonthlyNumber.put(11, "November");
		MonthlyNumber.put(12, "December");
		MonthlyNumber.put(2, "Febuary");
		
		System.out.println("First Entry : " + MonthlyNumber.firstEntry());
		Entry<Integer,String> EL = MonthlyNumber.lastEntry();
	    System.out.println("Last Entry: " + EL.getKey() + " " + EL.getValue());
	    System.out.println("Higher Key: " + MonthlyNumber.higherKey(10));
	}

}
