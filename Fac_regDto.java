package spe.dto;

public class Fac_regDto {
	private String name;
	private String email;
	private String empId;
	private long contact;
	private String subject;
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Fac_regDto [name=" + name + ", email=" + email + ", empId=" + empId + ", contact=" + contact
				+ ", subject=" + subject + ", password=" + password + "]";
	}
	
	
	

}
