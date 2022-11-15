package shoppingCart;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Cart implements Iterable<Product> {

    List<Product> products = new ArrayList<Product>();
	
	@Override
	public Iterator<Product> iterator() {
		return products.iterator();
	}

	public Cart(Product... products) {
		this.products = Arrays.asList(products);
	}
    
}
