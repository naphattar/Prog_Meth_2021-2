
public class Employee {
	String name;
	String phonenumber;
	String address;
	int id;
	int salary;
	int number_of_years;
	// Class Constructor
	public Employee(String name, String phonenumber, String address, int id, int salary, int number_of_years) {
		super();
		this.setName(name);
		this.setPhonenumber(phonenumber);
		this.setAddress(address);
		this.setId(id);
		this.setSalary(salary);
		this.setNumber_of_years(number_of_years);
	}
	// Class Getter and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		if (salary < 0) {
			salary = 0;
		}
		this.salary = salary;
	}
	public int getNumber_of_years() {
		return number_of_years;
	}
	public void setNumber_of_years(int number_of_years) {
		if (number_of_years < 0) {
			number_of_years = 0;
		}
		this.number_of_years = number_of_years;
	}
}
