package hui.study.model;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 采用在xml中配置注入一个学生类
 * @author chunhb
 *
 */
public class School {
	private String schname;
	@Autowired
	private Student s_student;


	public String getSchname() {
		return schname;
	}
	public void setSchname(String schname) {
		this.schname = schname;
	}
	public Student getS_student() {
		return s_student;
	}
	public void setS_student(Student s_student) {
		this.s_student = s_student;
	}
	
	
	

}
