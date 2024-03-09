package Dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity class representing the 'ClassWorks' table in the database. It is
 * annotated with JPA annotations for mapping to a database table.
 */
@Entity
public class ClassWorks {

	// Primary key for the 'ClassWorks' table
	@Id
	int c_id;

	// Column representing the 'name' field with a non-null constraint
	@Column(nullable = false)
	String name;

	// Column representing the 'Email' field with a non-null and unique constraint
	@Column(nullable = false, unique = true)
	String Email;

	// Column representing the 'No' field with a non-null and unique constraint
	@Column(nullable = false, unique = true)
	long No;

	// Getter and setter methods for each field

	/**
	 * Gets the value of the 'c_id' field.
	 *
	 * @return The value of 'c_id'.
	 */
	public int getC_id() {
		return c_id;
	}

	/**
	 * Sets the value of the 'c_id' field.
	 *
	 * @param c_id The new value for 'c_id'.
	 */
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	/**
	 * Gets the value of the 'name' field.
	 *
	 * @return The value of 'name'.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the 'name' field.
	 *
	 * @param name The new value for 'name'.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the value of the 'Email' field.
	 *
	 * @return The value of 'Email'.
	 */
	public String getEmail() {
		return Email;
	}

	/**
	 * Sets the value of the 'Email' field.
	 *
	 * @param email The new value for 'Email'.
	 */
	public void setEmail(String email) {
		Email = email;
	}

	/**
	 * Gets the value of the 'No' field.
	 *
	 * @return The value of 'No'.
	 */
	public long getNo() {
		return No;
	}

	/**
	 * Sets the value of the 'No' field.
	 *
	 * @param no The new value for 'No'.
	 */
	public void setNo(long no) {
		No = no;
	}
}
