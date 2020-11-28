package strategy;

public class Test {

	public static void main(String[] args) {
		
		// we can provide any strategy to do the sorting 
		
		 Product[] product = { new Product("book", 150, 200),
		 new Product("pen", 10, 20),
		 new Product("laptop", 15000, 20000),
		 new Product("arduino", 1500, 2000) };
        
        Context ctx = new Context(new BubbleSort());
        ctx.arrange(product);
        
        // we can change the strategy without changing Context class
        ctx = new Context(new QuickSort());
        ctx.arrange(product);

        System.out.println("Products after sorting : "); 
        for (Product product: product) 
        { 
            System.out.println(product.getName() + " " + 
                               product.getPrice() + " " + 
                               product.getValue());
        }
	
	// try it yourself then …


	}

	private static void extracted(Product[] product) {
		product[0] = new Product("book", 150, 200);
	}

}
