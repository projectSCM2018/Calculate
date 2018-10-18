
public class Month {
	
	String[] month = new String[]{"January", "February", "March", "April", "May" , "June", "July" , "August", "September", "October", "November", "December"};
	int number;
	
	public Month(int number) {
		this.number = number;
	}
	public String[] getMonth() {
		return month;
	}
	public void setMonth(String[] month) {
		this.month = month;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getMonthbynumber() {
		return this.month[number];
	}
	
}
