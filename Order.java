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