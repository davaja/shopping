package shopping.checkout;

import java.math.BigDecimal;

/**
 * Information about a product sold in the shop.
 */
public class Product {
	private final String name;
	private final String barcode;
	private final BigDecimal unitPrice;
    private final String discount;
	
	public Product(String name, String barcode, BigDecimal unitPrice, String discount) {
		this.name = name;
		this.barcode = barcode;
		this.unitPrice = unitPrice;
        this.discount = discount;
	}

	/**
	 * Returns the name of the product.
	 */
	public String toString() {
		return name;
	}

    /**
	 * Returns the name of the product.
	 */
	public String getDiscount() {
		return discount;
	}

    public boolean isProductDiscounted()
    {
        if (discount != null && !discount.isEmpty())
        {
            if (discount.contentEquals("3 for 2"))
                return true;
            else
                return false;
        }
        else
            return false;
    }
	
	/**
	 * Returns the name of the product.
	 */
	public String name() {
		return name;
	}

	/**
	 * Returns the product's barcode.
	 */
	public String barcode() {
		return barcode;
	}

	/**
	 * Returns the price of <var>count</var> units of this product.
	 */
	public BigDecimal priceOf(int count) {
		return unitPrice.multiply(new BigDecimal(count));
	}
	
	/**
	 * Returns the price of a single unit of this product.
	 */
	public BigDecimal unitPrice() {
		return unitPrice;
	}
}
