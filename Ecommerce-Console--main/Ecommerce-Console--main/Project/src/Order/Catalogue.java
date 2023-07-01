package Order;
import ProductDetails.Category;
import ProductDetails.Product;

public class Catalogue {
	private Product[] listofAllProducts;
	
	Category cat1=new Category();
	Category cat2=new Category();
	Category cat3=new Category();

	public Product[] getListofAllProducts() {
		cat1.setCategoryName("Clothes");
		cat2.setCategoryName("Electronic");
		cat3.setCategoryName("Furniture");
		
		Product product1 = new Product();
		product1.setProductId("1");
		product1.setProductName("Shirts");
		product1.setCost("200");
		product1.setCategory(cat1);
		Product product2 = new Product();
		product2.setProductId("2");
		product2.setProductName("Jeans");
		product2.setCost("200");
		product2.setCategory(cat1);
		Product product3 = new Product();
		product3.setProductId("3");
		product3.setProductName("T-Shirt");
		product3.setCost("100");
		product3.setCategory(cat1);
		
		
		Product product4 = new Product();
		product4.setProductId("4");
		product4.setProductName("Mobile");
		product4.setCost("20000");
		product4.setCategory(cat2);
		Product product5 = new Product();
		product5.setProductId("5");
		product5.setProductName("Earphone");
		product5.setCost("1500");
		product5.setCategory(cat2);
		Product product6 = new Product();
		product6.setProductId("6");
		product6.setProductName("Computer");
		product6.setCost("40000");
		product6.setCategory(cat2);
		
		Product product7 = new Product();
		product7.setProductId("7");
		product7.setProductName("Bed");
		product7.setCost("20000");
		product7.setCategory(cat3);
		Product product8 = new Product();
		product8.setProductId("8");
		product8.setProductName("Sofa");
		product8.setCost("15000");
		product8.setCategory(cat3);
		Product product9 = new Product();
		product9.setProductId("9");
		product9.setProductName("Chair");
		product9.setCost("4000");
		product9.setCategory(cat3);
		
		
		
		listofAllProducts = new Product[9];
		listofAllProducts[0] = product1;
		listofAllProducts[1] = product2;
		listofAllProducts[2] = product3;
		listofAllProducts[3] = product4;
		listofAllProducts[4] = product5;
		listofAllProducts[5] = product6;
		listofAllProducts[6] = product7;
		listofAllProducts[7] = product8;
		listofAllProducts[8] = product9;
		
		return listofAllProducts;
	}

	public void setListofAllProducts(Product[] listofAllProducts) {
		this.listofAllProducts = listofAllProducts;
	}

	public Product[] getSellerProducts() {
		
		cat1.setCategoryName("Clothes");
		cat2.setCategoryName("Electronic");
		cat3.setCategoryName("Furniture");
		
		Product product1 = new Product();
		product1.setProductId("1");
		product1.setProductName("Shirts");
		product1.setCost("200");
		product1.setCategory(cat1);
		Product product2 = new Product();
		product2.setProductId("2");
		product2.setProductName("Jeans");
		product2.setCost("200");
		product2.setCategory(cat1);
		Product product3 = new Product();
		product3.setProductId("3");
		product3.setProductName("T-Shirt");
		product3.setCost("100");
		product3.setCategory(cat1);
		
		
		Product product4 = new Product();
		product4.setProductId("4");
		product4.setProductName("Mobile");
		product4.setCost("20000");
		product4.setCategory(cat2);
		Product product5 = new Product();
		product5.setProductId("5");
		product5.setProductName("Earphone");
		product5.setCost("1500");
		product5.setCategory(cat2);
		Product product6 = new Product();
		product6.setProductId("6");
		product6.setProductName("Computer");
		product6.setCost("40000");
		product6.setCategory(cat2);
		
		Product product7 = new Product();
		product7.setProductId("7");
		product7.setProductName("Bed");
		product7.setCost("20000");
		product7.setCategory(cat3);
		Product product8 = new Product();
		product8.setProductId("8");
		product8.setProductName("Sofa");
		product8.setCost("15000");
		product8.setCategory(cat3);
		Product product9 = new Product();
		product9.setProductId("9");
		product9.setProductName("Chair");
		product9.setCost("4000");
		product9.setCategory(cat3);
		
		
		
		Product[] SellerProducts = new Product[9];
		SellerProducts[0] = product1;
		SellerProducts[1] = product2;
		SellerProducts[2] = product3;
		SellerProducts[3] = product4;
		SellerProducts[4] = product5;
		SellerProducts[5] = product6;
		SellerProducts[6] = product7;
		SellerProducts[7] = product8;
		SellerProducts[8] = product9;
		
		return SellerProducts;
	}

	
		
	}
