package Users;
import Order.Cart;

public class Customer extends user {
	private Cart cart;
	public Object getCategory;

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public Boolean verifyUser() {
		return true;
	}

	

	
	}


