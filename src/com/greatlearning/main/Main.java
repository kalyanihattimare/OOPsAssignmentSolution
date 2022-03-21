package com.greatlearning.main;

import com.greatlearning.admin.AdminDepartment;
import com.greatlearning.hr.HrDepartment;
import com.greatlearning.tech.TechDepartment;

public class Main {
	
	public static void main(String args[])
	{
		AdminDepartment admin= new AdminDepartment();
		
		String a=admin.departmentName();
		   	System.out.println("Welcome to "+a);
		String b=admin.getTodaysWork();
		    System.out.println(b);
	    String c=admin.getWorkDeadline();
		   	System.out.println(c);
		String x=admin.isTodayAHoliday();
		   	System.out.println(x);
			System.out.println(); 	
				
		HrDepartment hr=new HrDepartment();
		
		String d=hr.departmentName();
			System.out.println("Welcome to "+d);
    	String e=hr.doActivity();
    		System.out.println(e);
    	String f=hr.getTodaysWork();
    		System.out.println(f);
    	String g=hr.getWorkDeadline();
    		System.out.println(g);
    	String y=hr.isTodayAHoliday();
    	 	System.out.println(y);
    		System.out.println(); 	
		
		TechDepartment tech=new TechDepartment();
		
		String h=tech.departmentName();
		System.out.println("Welcome to "+h);
		String i=tech.getTodaysWork();
		System.out.println(i);
		String j=tech.getWorkDeadline();
		System.out.println(j);
		String k=tech.getTechStackInformation();
		System.out.println(k);
		String z=tech.isTodayAHoliday();
		System.out.println(z);
		
	}

}
