public class Car {
	public int serial;
	public String brand;
	public boolean equals(Car o) {
		return(this.serial == o.serial && this.brand.equals(o.brand));
	}

}
