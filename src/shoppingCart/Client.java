package shoppingCart;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Client {
    
    public static void main(String[] args) {
		Cart cart = new Cart(new Product("Notebook", 1000d), 
        new Product("Desk", 59.99d), 
        new Product("IPhone", 0.5d));
		
		for(Product prod: cart) {
			System.out.println(String.format("%s = %.2f", prod.getDesc(), prod.getValue()));
		}
		
		Stream<Product> stream = StreamSupport.stream(cart.spliterator(), false);
		Double sum = stream.reduce(0d, (acc, prod) -> acc + prod.getValue(), Double::sum);
		System.out.println(sum);
	}
}
