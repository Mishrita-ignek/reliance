package attendence.rinfra.scheduler.report;

public class RinfraAttendenceReport {
	
	private String name;
	private String code;
	private String mobile;
	private String mode;
	private String dateAndTime;
	private String grade;
	private String business;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getDateAndTime() {
		return dateAndTime;
	}
	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getBusiness() {
		return business;
	}
	public void setBusiness(String business) {
		this.business = business;
	}
	@Override
	public String toString() {
		return "RinfraAttendenceReport [name=" + name + ", code=" + code + ", mobile=" + mobile + ", mode=" + mode
				+ ", dateAndTime=" + dateAndTime + ", grade=" + grade + ", business=" + business + "]";
	}
	

}
