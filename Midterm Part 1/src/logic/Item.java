package logic;

public class Item {
	private String name;
	int pricePerPiece;
	
	
	public Item(String name, int pricePerPiece) {
		this.setName(name);
		this.setPricePerPiece(pricePerPiece);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPricePerPiece() {
		return pricePerPiece;
	}
	public void setPricePerPiece(int pricePerPiece) {
		if (pricePerPiece < 1) {
			pricePerPiece = 1;
		}
		this.pricePerPiece = pricePerPiece;
	}
	

}
