package strategy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we can provide any strategy to do the sorting 
        int[] array = {1, 2, 3, 4, 5 };
        Context ctx = new Context(new BubbleSort());
        ctx.arrange(array);
        
        // we can change the strategy without changing Context class
        ctx = new Context(new QuickSort());
        ctx.arrange(array);
	
	// try it yourself then …


	}

}
