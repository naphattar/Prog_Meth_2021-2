package products;

import discount.FreeDiscountable;
import discount.Sellable;
import logic.ShopUtil;

public class FreeDiscountProduct extends BaseProduct implements FreeDiscountable,Sellable{
	private int promoQuantity;
	private int freeQuantity;
	
	public FreeDiscountProduct(String name,int price,int promoQ,int freeQ) {
		super(name,price);
		this.setPromoQuantity(promoQ);
		this.setFreeQuantity(freeQ);
	}
	
	
	//getter and setter
	public int getPromoQuantity() {
		return promoQuantity;
	}
	public void setPromoQuantity(int promoQuantity) {
		if(promoQuantity < 1) {
			promoQuantity = 1;
		}
		this.promoQuantity = promoQuantity;
	}
	public int getFreeQuantity() {
		return freeQuantity;
	}
	public void setFreeQuantity(int freeQuantity) {
		if(freeQuantity < 1) {
			freeQuantity = 1;
		}
		this.freeQuantity = freeQuantity;
	}

	
	@Override
	public int calcFreeDiscountPieces(int totalQuantityBought) {
		// TODO Auto-generated method stub
		return ShopUtil.calculateFreeDiscountPieces(this.getFreeQuantity(), this.getPromoQuantity(), totalQuantityBought);
		
	}
	@Override
	public int calculateDiscount(int quantity) {
		return this.getPrice()*this.getFreeQuantity();
		
	}
	public String toString() {
		return this.getProductName() + " (Price: " + this.getPrice() + ", Buy " + this.getPromoQuantity() + " Get " + this.getFreeQuantity() + " Free)";
	}
	
	
	

}
