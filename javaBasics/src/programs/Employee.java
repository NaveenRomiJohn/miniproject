package programs;

public class Employee {
	
	private final long id;
	private String name;
	public Employee(long vl)
	{
		this.id=vl;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
