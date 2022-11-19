package products;

import discount.PercentDiscountable;
import logic.ShopUtil;

public class PercentDiscountProduct extends BaseProduct implements PercentDiscountable{
	
	private double percent;
	
	
	public PercentDiscountProduct(String name, int price, double percent) {
		super(name, price);
		this.setPercent(percent);;
	}

	//getter and setter
	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		if(percent < 0) {
			percent = 0;
		}
		if(percent > 100) {
			percent = 100;
		}
		this.percent = percent;
	}
	
	public int calculateDiscount(int quantity) {
		return quantity*this.calcDiscountPerPiece();
	}
	@Override
	public int calcDiscountPerPiece() {
		// TODO Auto-generated method stub
		return ShopUtil.calculateDiscountUsingPercent(this.getPrice(), this.getPercent());
		
	}
	public String toString() {
		return this.getProductName() + " (Price: " + this.getPrice() +", "+ this.getPercent() + "% Off)";
	}
	
	
	

}
