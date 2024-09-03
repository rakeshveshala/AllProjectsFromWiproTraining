package mypackage.SpringCoreAnnotations;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private int studentId;
	private String studentName;
	private int score;
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
