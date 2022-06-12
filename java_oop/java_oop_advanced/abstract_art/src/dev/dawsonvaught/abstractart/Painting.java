package dev.dawsonvaught.abstractart;

public class Painting extends Art {
	private String paintType;

	public Painting(String title, String author, String description, String paintType) {
		super(title, author, description);
		this.setPaintType(paintType);
	}

	@Override
	public void viewArt() {
		System.out.printf("%s - %s\n\"%s\"\nMade with %s\n\n", this.getTitle(), this.getAuthor(), this.getDescription(),
				this.paintType);
	}

	public String getPaintType() {
		return paintType;
	}

	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}

}
