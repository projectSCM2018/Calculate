
public class Calculate {
	int number;
	String[] month = new String[]{"January", "February", "March", "April", "May" , "June", "July" , "August", "September", "October", "November", "December"};
	String[] num = new String[]{"zero","one","two","tree","four","five","six","seven","eight","nine"};
	public Calculate(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String[] getMonth() {
		return month;
	}
	public void setMonth(String[] month) {
		this.month = month;
	}
	public String[] getNum() {
		return num;
	}
	public void setNum(String[] num) {
		this.num = num;
	}
	
	public String getMonthbynumber() {
		return this.month[this.number];
	}
	 public String getNumberbyNum() {
		 return this.num[this.number];
	 }
}
