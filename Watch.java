public class Watch {
    
    private String name;
    private String colour;
    private int price;

    Watch(String name,String colour,int price){
        this.name =name;
        this.colour =colour;
        this.price=price;
    }
    String getName(){
        return name;
    }
    String getColour(){
        return colour;
    }
    int getPrice(){
        return price;
    }
    public String toString(){
        return name+" "+colour;
    }
    public String getPriceRange(){
        if(price<10000){
            return "Budget";
        }else if(price>50000){
            return "Executive";
        }else{
            return "Regular";
        }

        }
    }

