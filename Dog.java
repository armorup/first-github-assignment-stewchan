public class Dog {
    
    private static int dogCount;
    
    private String name;
    private int age;
    
    public Dog(String n; int a) {
        name = n;
        age = a;
    }
  
    public String getName() {
        return name;
    }
    
    public void bark() {
        System.out.println("Woof");
    }
}
