package exercise3;

public class Item {
	int id;
	String name;
	int numberOfCopies;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	public Item(int id, String name, int numberOfCopies) {
		super();
		this.id = id;
		this.name = name;
		this.numberOfCopies = numberOfCopies;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfCopies != other.numberOfCopies)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MediaItem [id=" + id + ", name=" + name + ", numberOfCopies=" + numberOfCopies + "]";
	}


}
