package model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="student")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="SID")
	private String sid;
	@Column(name="SNAME")
	private String sname;
	@Column(name="AGE")
	private String age;
	public Student() {}
	public Student(String sid, String sname, String age) {
		this.sid = sid;
		this.sname = sname;
		this.age = age;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", age=" + age + "]";
	}
	
}
