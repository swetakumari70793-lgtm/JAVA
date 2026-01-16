class Employee 
{
    private String name;
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name=name;
    }
}
class demo
{
    public static void main(String[]args)
    {
        Employee e = new Employee();
        e.setname("Sweta");
        System.out.println(e.getname());
    }
}