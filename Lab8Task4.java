class Lab8Task4{
	public static void main(String[] args){
		Rectangle r = new Rectangle("Green",10,20);
		System.out.println(r.toString());
		System.out.println("Size = ("+r.getWidth()+" x "+r.getHeight()+")");
		System.out.println("Area = "+r.getArea());
		System.out.println("Set New Values..");
		r.setColor("Yellow");
		r.setWidth(50);
		r.setHeight(100);
		System.out.println(r.toString());
		System.out.println("Size = ("+r.getWidth()+" x "+r.getHeight()+")");
		System.out.println("Area = "+r.getArea());
	}
}