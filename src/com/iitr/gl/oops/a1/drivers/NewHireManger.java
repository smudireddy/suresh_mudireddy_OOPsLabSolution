package com.iitr.gl.oops.a1.drivers;

import com.iitr.gl.oops.a1.services.CredentialService;
import com.iitr.gl.oops.a1.model.*;
import java.util.Scanner;
import java.util.Arrays;

public class NewHireManger {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int exitChoice = 1;
		
		do {
			
			System.out.println("Please Enter First Name : ");
			String firstName = scanner.next();
		
			System.out.println("Please Enter Last Name : ");
			String lastName = scanner.next();
			
			String department = getDepartmentCode(scanner);
		
			Employee emp = new Employee(firstName, lastName, department);
		
			CredentialService service = new CredentialService();
		
			service.showCredentials(emp);
			
			System.out.println("\n\n Select 0 to exit");
			exitChoice = scanner.nextInt();
		
		}while(exitChoice != 0);
	}
	
	static String getDepartmentCode(Scanner scanner) {
		
		String department = null;
		
		System.out.println("Please enter the department from the following \n 1.Technical \n 2.Admin \n 3.Human Resource \n 4.Legal \n");
		int deptCode = scanner.nextInt();
			
		
		switch(deptCode) {
		case 1:
			department = "tech";
			break;
		case 2:
			department = "admin";
			break;
		case 3:
			department = "hr";
			break;
		case 4:
			department = "legal";
			break;
			
		default:
			System.out.println("Please enter valid option");
			break;
		}
		return department;
	}
}
