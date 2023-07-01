package Ecommerce;
import java.util.Scanner;

import Order.Cart;
import Order.Catalogue;
import ProductDetails.Product;
import Users.Customer;
import Users.Seller;


public class Store {
	
	private static Seller currentSeller;

	
	public static void main(String[] args) {
		System.out.println("Welcome to the 'Bhushan Borde's ecommerce store!'");
		System.out.println("Which user are you? 1. Customer 2. Seller 3. Admin");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		String typeOfUser;
		if (choice == 1) {
			typeOfUser = "Customer";
			Customer current = new Customer();
			System.out.println("What is your userId?");
			sc.nextLine();
			current.setUserId(sc.nextLine());
			System.out.println("What is your passWord?");
			sc.nextLine();
			current.setPassword(sc.nextLine());
			if (current.verifyUser() == true) {
				System.out.println("User verified!");
				while (true) {

					System.out.println("Do you want to- 1. View products 2. View Cart 3. Contact Us 4. Exit");
					choice = sc.nextInt();
					if (choice == 1) {
						Catalogue catalogue = new Catalogue();
						Product[] allProducts = catalogue.getListofAllProducts();
						for (int i = 0; i < allProducts.length; i++) {
							System.out.println(allProducts[i].getProductId() + " " + allProducts[i].getProductName()
									+ " " + allProducts[i].getCost());
						}
						System.out.println("Do you want to add any product to the cart? Y/N");
						sc.nextLine();
						String addToCart = sc.nextLine();
						if (addToCart.equals("Y")) {
							System.out.println("Input the product id of the product which you want to add to cart.");
							String productId = sc.nextLine();
							Product[] cartProducts = new Product[1];
							for (int i = 0; i < allProducts.length; i++) {
								if (allProducts[i].getProductId().equals(productId))
									cartProducts[0] = allProducts[i];
							}

							Cart cart = new Cart();
							cart.setCartId("1");
							cart.setListOfProducts(cartProducts);
							current.setCart(cart);
							System.out.println("The product is successfully added to the cart");
						}
					} else if (choice == 2) {
						Product[] cartProducts = current.getCart().getListOfProducts();
						System.out.println(current.getCart().getCartId());
						for (int i = 0; i < cartProducts.length; i++) {
							System.out.println(cartProducts[i].getProductId() + " " + cartProducts[i].getProductName()
									+ " " + cartProducts[i].getCost());
						}
						System.out.println("Do you want to checkout? Y/N");
						sc.nextLine();
						String checkout = sc.nextLine();
						if (checkout.equals("Y"))
							if (current.getCart().checkOut())
								// Create an order object and assign this user to the order with an order id
								System.out.println("Your order is placed successfully");

					} else if (choice == 3) {
						System.out.println("To contact us, please email on store@ecommerce.com");
					} else if (choice == 4)
						break;
					else
						System.out.println("Invalid choice, please try again.");
				}
			}
		}

		if (choice == 2) {
			typeOfUser = "Seller";
			Seller current = new Seller();
			System.out.println("What is your sellerId?");
			sc.nextLine();
			current.setSellerId(sc.nextLine());
			System.out.println("What is your passWord?");
			sc.nextLine();
			current.setSellerPassword(sc.nextLine());
			if (current.verifyUser() == true) {
				System.out.println("Seller verified");
				while (true) {
					System.out.println("Do you want to- 1. View products 2. View Cart 3. Contact Us 4. Exit");
					choice = sc.nextInt();
					if (choice == 1) {
						Catalogue catalogue = new Catalogue();
						Product[] SellerProducts = catalogue.getListofAllProducts();
						for (int i = 0; i < SellerProducts.length; i++) {
							System.out.println(SellerProducts[i].getProductId() + " "
									+ SellerProducts[i].getProductName() + " " + SellerProducts[i].getCost());
						}
					} else if (choice == 2) {
						System.out.println("Sellect product id which you want to add");
						String getId = sc.nextLine();
						sc.nextLine();
						Catalogue catalogueS2 = new Catalogue();
						Product[] SellerProduct = catalogueS2.getSellerProducts();
						Product[] SellerAddedProduct = new Product[1];
						for (int i = 0; i < SellerAddedProduct.length; i++) {
							if (SellerProduct[i].getProductId().equals(getId)) {
								SellerAddedProduct[0] = SellerProduct[i];
							}

							currentSeller.setProductsListed(SellerAddedProduct);
							System.out.println("Product succesfully added");
						}

					} else if (choice == 3)
						typeOfUser = "Admin";
					else
						System.out.println("Invalid input. Try again");
				}

			}
		}
	}
}
