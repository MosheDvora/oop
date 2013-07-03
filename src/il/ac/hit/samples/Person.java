package il.ac.hit.samples;

public class Person {
	private String name;
	private double height;
	private int id;
	//test commite 5 push
		
	public Person(String nameVal, double heightVal, int idVal) {
		this.name = nameVal;
		this.height = heightVal;
		this.id = idVal;
	}
	public Person(){
		this("no name",100,10);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String str) {
		this.name = str;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double number) {
		this.height = number;
	}
	public int getId() {
		return id;
	}
	public void setId(int num) {
		if (num>0) {
		this.id = num;
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (Double.doubleToLongBits(height) != Double
				.doubleToLongBits(other.height))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
