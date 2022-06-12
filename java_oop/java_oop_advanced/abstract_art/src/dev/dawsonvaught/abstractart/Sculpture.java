package dev.dawsonvaught.abstractart;

public class Sculpture extends Art {
	private String material;

	public Sculpture(String title, String author, String description, String material) {
		super(title, author, description);
		this.setMaterial(material);
	}

	@Override
	public void viewArt() {
		System.out.printf("%s - %s\n\"%s\"\nMade with %s\n\n", this.getTitle(), this.getAuthor(), this.getDescription(),
				this.material);
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}
