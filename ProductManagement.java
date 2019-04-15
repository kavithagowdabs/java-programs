class Product
{
	int id;
	String name;
	double  price;
	int count;
	
	Product product[];
	public Product() {
		product = new Product[3];
		count = -1;
	}
	
	Product(int id,String name,double price){
		
		this.id = id;
		this.name = name;
		this.price = price;
		
	}
	
	public void addProduct(Product p){
		System.out.println("Adding the product");
		product[++count] = p;	
		
	}
	public void listAllProducts(){
		
		for(Product products:product){
			System.out.println(products.id+ " "+products.name+ " "+products.price);
			
		}
		
	}
	public void searchProduct(int productId){
		boolean found = false;
		
		for(Product p:product){
			if(p.id == productId){
				
				found = true;
				break;
			}
			
			
		}
		if(found){
			System.out.println("Product found..");
		}
		else{
			System.out.println("Not found...");
		}
		
		
		
	}
	
	
}

public class ProductManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product(123, "Samsung Mobile", 10000.00);
		Product p2 = new Product(123, "Laptop", 30000.00);
		Product p3 = new Product(125, "Ipad", 60000.00);
		
		System.out.println(p1+ " "+p2+ " "+p3);
		
		Product p = new Product();
		p.addProduct(p1);
		p.addProduct(p2);
		p.addProduct(p3);
		
		p.listAllProducts();
		
		p.searchProduct(123);

	}

}
