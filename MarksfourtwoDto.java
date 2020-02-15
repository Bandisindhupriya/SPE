package spe.dto;



public class MarksfourtwoDto {
	private String roll_no;
	private int dm;
	private int ppl;
	private int cc;
	private int mad;
	private int spm;
	private int total;
	private String name;
	private String feedback;
	
	
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


	public int getDm() {
		return dm;
	}


	public void setDm(int dm) {
		this.dm = dm;
	}


	public int getPpl() {
		return ppl;
	}


	public void setPpl(int ppl) {
		this.ppl = ppl;
	}


	public int getCc() {
		return cc;
	}


	public void setCc(int cc) {
		this.cc = cc;
	}


	public int getMad() {
		return mad;
	}


	public void setMad(int mad) {
		this.mad = mad;
	}


	public int getSpm() {
		return spm;
	}


	public void setSpm(int spm) {
		this.spm = spm;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public String getFeedback() {
		return feedback;
	}


	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}


	@Override
	public String toString() {
		return "MarksfourtwoDto [roll_no=" + roll_no + ", dm=" + dm + ", ppl=" + ppl + ", cc=" + cc + ", mad=" + mad
				+ ", spm=" + spm + ", total=" + total + ", name=" + name + ", feedback=" + feedback + "]";
	}


	


	
	
	
	
	
}
