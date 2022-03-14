package labemailapp;
import java.util.Random;

public class Credentials {

	public String generatePassword(){
		
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789"+"abcdefghijklmnopqrstuvwxyz"+"!@#$%&";
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<8;i++) {
			int index=(int)(s.length()*Math.random());
			sb.append(s.charAt(index));
		}
		return sb.toString();

	}
	public String generateEmailAddress(String firstName ,String lastName,String Department, String Company){
		return firstName.toLowerCase()+lastName.toLowerCase()+"@"+Department+"."+Company.toLowerCase()+"."+"com";

    }
	public void showCredentials(Employee emp , String email){
		System.out.println("Dear "+emp.getfirstName() +" your generated credentials are as follows:");
		System.out.println("Email ---> "+email);
		System.out.println("Password ---> "+generatePassword());
		
		
	}
	
}
	
