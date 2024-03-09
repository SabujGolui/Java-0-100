package Dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Mydto {

	@Id
	@SequenceGenerator(initialValue = 12121244, allocationSize = 1, sequenceName = "id", name = "id")
	@GeneratedValue(generator = "id")
	long id;
	@Column(nullable = false)
	String name;
	@Column(nullable = false)
	String password;
	@Column(nullable = false)
	long mobile;
	@Column(nullable = false)
	String email;
	@Column(nullable = false)
	String dob;
	@Column(nullable = false)
	String gender;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
