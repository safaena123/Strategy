package strategy;

public class Test {

	public static void main(String[] args) {
		
		// we can provide any strategy to do the sorting 
		
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Product("book", 150, 200)); 
        list.add(new Product("pencil", 5, 10)); 
        list.add(new Product("laptop", 10000, 10000)); 
        list.add(new Product("arduino", 1000, 2000));
        
        Context ctx = new Context(new BubbleSort());
        ctx.arrange(list);
        
        // we can change the strategy without changing Context class
        ctx = new Context(new QuickSort());
        ctx.arrange(list);

        System.out.println("Products after sorting : "); 
        for (Product product: list) 
        { 
            System.out.println(product.getName() + " " + 
                               product.getPrice() + " " + 
                               product.getValue());
        }
	
	// try it yourself then …


	}

}
