class Lab8Task1{
	public static void main(String[] args){
		Circle c = new Circle("Red",5);
		// first print
		System.out.println("Color = "+c.getColor());
		System.out.println("Radius = "+c.getRadius());
		// set new values
		c.setColor("Blue");
		c.setRadius(10);
		// print again
		System.out.println("Color = "+c.getColor());
		System.out.println("Radius = "+c.getRadius());
	}
}