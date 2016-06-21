package product;

import java.util.Currency;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class ProductPrice {

	@Id
	@NotNull
	private long productNumber;

	private double price;
	private Currency currency;

	protected ProductPrice() {
	}

	public ProductPrice(long productNumber, double price, Currency currency) {
		this.productNumber = productNumber;
		this.price = price;
		this.currency = currency;
	}

	@Override
	public String toString() {
		return String.format("Customer [productNumber=%d, price='%d', currency='%s']", productNumber, price,
				currency);
	}

	public long getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(long productNumber) {
		this.productNumber = productNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
}
