package api;

public class Item {
	private Long id;
    private String name;

    public Item(Long id, String name) {
        this.setId(id);
        this.setName(name);
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    // Getters and setters

}
