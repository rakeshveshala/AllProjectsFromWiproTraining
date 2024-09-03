package mypackage.SpringCoreAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class College {
	private int collegecode;
	private String collegename;
	private String city;
	@Autowired
	@Qualifier("student1")
	private Student studentobj;
	public int getCollegecode() {
		return collegecode;
	}
	public void setCollegecode(int collegecode) {
		this.collegecode = collegecode;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student getStudentobj() {
		return studentobj;
	}
	public void setStudentobj(Student studentobj) {
		this.studentobj = studentobj;
	}
}
