class Test {
    public static void main(String[] args) {
        Gadget thing = new ExtraGadget("Phon",5000,1000);
        thing.discount(50);
        System.out.println(thing.getNetPrice());
    }
}
