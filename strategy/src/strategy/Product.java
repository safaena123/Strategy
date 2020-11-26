package strategy;
import java.io.*;
import java.util.*;

public class Product implements Comparable<Product>
{ 
    private String name; 
    private int price;
    private int value;
    
    //To compare products by price
    public int compareTo(Product p) 
    { 
        return this.price - p.price; 
    }
    //To compare products by value
    public int compareTo(Product p) 
    { 
        return this.value - p.value; 
    }
    
    //Constructor
    public Product(String name, int price, int value) 
    { 
        this.name = name; 
        this.price = price; 
        this.value = value;
       
    }
    
    
    public String getName()   {  return name; } 
    public int getPrice()      {  return price;  } 
    public int getValue()      {  return value;  } 

}
