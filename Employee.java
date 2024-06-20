class Employee {
    private String name="N/A";
    private double salary = 0;
    Employee(){

    }
    Employee(String name,double salary){
        this.name =name;
        this.salary= salary;
    }
    public void setName(String name){
        this.name =name;
    }
    public String getName(){
        return this.name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return this.salary;
    }
    public double getIncome(){
        return this.getSalary();
    }
}
