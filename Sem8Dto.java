package spe.dto;

public class Sem8Dto {
	private String roll_no;
	private int pe1;
	private int pe2;
	private int pe3;
	private int major;
	private int total;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}
	public int getPe1() {
		return pe1;
	}
	public void setPe1(int pe1) {
		this.pe1 = pe1;
	}
	public int getPe2() {
		return pe2;
	}
	public void setPe2(int pe2) {
		this.pe2 = pe2;
	}
	public int getPe3() {
		return pe3;
	}
	public void setPe3(int pe3) {
		this.pe3 = pe3;
	}
	
	public int getMajor() {
		return major;
	}
	public void setMajor(int major) {
		this.major = major;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Sem8Dto [roll_no=" + roll_no + ", pe1=" + pe1 + ", pe2=" + pe2 + ", pe3=" + pe3 + ", major=" + major
				+ ", total=" + total + "]";
	}
	
	
	
	
}
