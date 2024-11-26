import java.util.List;

public class Shop {
	
	public Product viewProductById(List<Product> productList,int productId) {
		for(Product p : productList){
			if(p.getProductId() == productId){
				return p;
			}
		}
		return null;
	}

}
