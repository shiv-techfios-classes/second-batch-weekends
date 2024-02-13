package manage.statics;

public class Item {
	
	int id;
	String name;
	long modelNo;
	
	
	public Item() {
		this.id=0;
		this.name= "";
		this.modelNo=0;
	}
	
	public Item(int id) {
		
		this.id = id;
	}
	
	
	public Item(int ID, String name) {
		
		this.id = ID;
		
		this.name = name;
	}
	
	public Item(int ID, String itemname, long model) {
		
		this.id = ID;
		this.name = itemname;
		this.modelNo = model;
	}

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

	public long getModelNo() {
		return modelNo;
	}

	public void setModelNo(long modelNo) {
		this.modelNo = modelNo;
	}

	
}
