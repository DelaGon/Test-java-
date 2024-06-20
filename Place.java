class Place{
    private String name;
    private String address;
    private String province;
    
    Place(String name,String address,String province){
        this.name=name;
        this.address=address;
        this.province=province;
        
    }
    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
    public String  getProvince() {
        return this.province;
    }
    
    public boolean equals(Place n){
        return(this.name.equals(n.getName()))&&(this.address==n.getAddress())&&(this.province.equals(n.getProvince()));
    }
    public String  toString(){
        return name+","+address+","+province;
    }
}