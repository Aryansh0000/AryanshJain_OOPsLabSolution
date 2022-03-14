package labemailapp;

public class Employee {
	private String firstName ;
	private String lastName;
	
	void setName(String firstName , String lastName) {
		this.firstName=firstName ;
		this.lastName=lastName ; }
		
	public String getfirstName() {
		return firstName;

		}
		
	public String getlastName() {
		return lastName;

		}
	public Employee(String firstName , String lastName){
		
		setName(firstName, lastName);
	}
		
	
	

}
