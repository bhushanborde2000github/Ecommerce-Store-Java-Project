package Users;
import ProductDetails.Product;


public  class Seller extends user {

public static Seller current;
private Product [] productsListed;
	
	@Override
	public Boolean verifyUser() {
		return true;
	}
	public Product[] getProductsListed() {
		return productsListed;
	}
	public void setProductsListed(Product[] productsListed) {
		this.productsListed = productsListed;
	}
	public void getSellerId(String nextLine) {
		// TODO Auto-generated method stub
		
	}

}
