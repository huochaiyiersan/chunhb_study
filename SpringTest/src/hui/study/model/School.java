package hui.study.model;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 采用在xml中配置注入一个学生类
 * @author chunhb
 *
 */

@Component(value="school")
public class School {
	private String schname="SCHOOL";

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
