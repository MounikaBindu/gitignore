package practice;

public class Laptop1 implements Comparable<Laptop1>{
   String brand;
   int price;
   int storage;
   int ram;
   Laptop1(String brand,int price,int storage,int ram){
	   this.brand=brand;
	   this.price=price;
	   this.storage=storage;
	   this.ram=ram;
   }
   
   public String toString() {
	   return "brand : "+brand+" price : "+price+" Storage : "+storage+" ram : "+ram+"\n";
	   
   }
    public int compareTo(Laptop1 o) {
    	return o.price-this.price;
    }
   
   }
