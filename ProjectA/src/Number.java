package projecta;

public class Number {
	int number;
	String[] num = new String[]{"zero","one","two","tree","four","five","six","seven","eight","nine"};
	public Number(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String[] getNum() {
		return num;
	}
	public void setNum(String[] num) {
		this.num = num;
	}
	public String getNumberbyNum() {
		return this.num[number];
	}
}
