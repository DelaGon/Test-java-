public class Lab7Task2
{
    public static void main(String[] args)
    {
        Product tea1 = new Product("Thai Iced Tea", 35.0);
        Product tea2 = new Product("English Breakfast Tea", 45.0);

        int tableA = 1;
        int tableB = 2;
        int tableC = 3;

        Order order1 = new Order(tableB,tea1);
        Order order2 = new Order(tableC,tea2);
        Order order3 = new Order(tableC,tea1);

        System.out.println("Order 1 is for table "+order1.getTable());
        System.out.println("Order 1 is a "+order1.getProduct().getName());

        order1.setComplete(true);
        System.out.println("Order status: ");
        System.out.println(order1.toString());
        System.out.println(order2.toString());
        System.out.println(order3.toString());

    }
}
class Product{
    private String name;
    private double price;
    Product(String name,double price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public String toString(){
        return this.name+"("+this.price+" Bath)";
    } 
    public boolean equals(Product p){
         return (this.name == p.getName()) && (this.price==p.getPrice());
    }
}

class Order{
    int table;
    boolean complete = false;
    Product product;
    
    Order(int table,Product product){
        this.table=table;
        this.product=product;
    }

    int getTable(){
        return this.table;
    }
    Product getProduct(){
        return this.product;
    }
    void setComplete(boolean value){
        this.complete = value;
    }
    boolean getComplete(){
        return this.complete;
    }
    public String toString(){
        if (this.complete){
        return "Table "+this.table+": "+this.product.getName()+" [/]";
    }else{
        return "Table "+this.table+": "+this.product.getName()+" [ ]";
    }
        
    }
    
}