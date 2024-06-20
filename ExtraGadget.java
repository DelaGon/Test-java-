class ExtraGadget extends Gadget {
    private double charge;
    ExtraGadget(String name,double price,double charge){
        super(name, price,charge);
        this.charge= charge;
    }
    public double getCharge(){
        return this.charge;
    }
    
}
