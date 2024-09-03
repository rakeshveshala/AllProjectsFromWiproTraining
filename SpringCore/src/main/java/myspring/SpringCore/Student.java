package myspring.SpringCore;

public class Student {
	private int studentId;
	private String studentName;
	private String mobileNo;
	private double score;
	public Student() {
		
	}
	public Student(int studentId, String studentName,String mobileNo,double score) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.mobileNo=mobileNo;
		this.score=score;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
}
