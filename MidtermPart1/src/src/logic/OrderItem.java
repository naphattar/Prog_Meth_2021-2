package Part1.CPShop_toStudent.src.logic;

public class OrderItem {
	private Item item;
	private int itemAmount;
	public OrderItem(Item item, int itemAmount) {
		this.setItem(item);
		this.setItemAmount(itemAmount);
	}
	// getter and setter
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getItemAmount() {
		return itemAmount;
	}
	public void setItemAmount(int itemAmount) {
		if (itemAmount < 0) {
			itemAmount = 0;
		}
		this.itemAmount = itemAmount;
	}
	
	public void increaseItemAmount(int amount) {
		if (amount > 0) {
			this.setItemAmount(this.getItemAmount()+amount);
		}
		
	}
	public int calulateTotalPrice() {
		return this.getItemAmount()	*this.getItem().getPricePerPiece();
			
	}
	

}
