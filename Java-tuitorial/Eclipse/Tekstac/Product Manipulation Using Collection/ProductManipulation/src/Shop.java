import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Shop {

	public List<Product> viewProductByPrice(List<Product> productList,int price) {
		List<Product> result = new ArrayList<Product>();
		for(Product p : productList){
			if(p.getPrice()>=price){
				result.add(p);
				
			}
		}
		return result;
	}
	
	public Map<String,Integer> viewProductNamePrice(List<Product> productList){
		Map<String,Integer> result = new LinkedHashMap<String, Integer>();
		for(Product p : productList){
			result.put(p.getProductName(),p.getPrice());
		}
		return result;	
	}

}