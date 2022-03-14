package com.gl.main;
import java.util.Scanner;

import labemailapp.Credentials;
import labemailapp.Employee;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ch1 = new Scanner(System.in);
		System.out.println("First Name is: ");
		String First = ch1.next();
		//Scanner ch2 = new Scanner(System.in);
		System.out.println("Last Name is: ");
		String Last = ch1.next();
		System.out.println("Company Name is: ");
		String Company = ch1.next();
		Employee e = new Employee(First,Last);
		Credentials c = new Credentials();
		String Department="";
		System.out.println("Please enter the department from the following:\n1.\tTechnical\n2.\tAdmin\n3.\tHuman Resource\n"
				+ "4.\tLegal");
		
		Scanner sca = new Scanner(System.in);
		int Number = sca.nextInt();
		
		
		switch(Number){
			case 1: {
			Department="tech";
			String generatedEmail = c.generateEmailAddress(e.getfirstName(),e.getlastName(),Department,Company);
			c.generatePassword();
			c.showCredentials(e,generatedEmail);
			break;
			}
			case 2: {Department="adm";
			String generatedEmail = c.generateEmailAddress(e.getfirstName(),e.getlastName(),Department,Company);
			c.generatePassword();
			c.showCredentials(e,generatedEmail);
			break;}
			case 3: {Department="hr";
			String generatedEmail = c.generateEmailAddress(e.getfirstName(),e.getlastName(),Department,Company);
			c.generatePassword();
			c.showCredentials(e,generatedEmail);
			break;}
			case 4: {Department="lgl";
			String generatedEmail = c.generateEmailAddress(e.getfirstName(),e.getlastName(),Department,Company);
			c.generatePassword();
			c.showCredentials(e,generatedEmail);
			break;}
			default: System.out.println("Not a valid option");
		};
		sca.close();
		ch1.close();
		
	}

}
