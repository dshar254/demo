package beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")

public class Employee implements Serializable {
	@Id //primary key of the table
	private int id;
	private String name;
	private static final long serialVersionUID = 1L;

	public Employee() {
		super();
	}   
	public int getid() {
		return this.id;
	}
	public void setid(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
