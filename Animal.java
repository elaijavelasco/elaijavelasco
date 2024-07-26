public class Animal {
    private final String name;
    private final int age;
    
    public Animal (String name, int age){
        this.name=name;
        this.age=age;
    }

    public void display(){
        System.out.println("Animal: " + name);
        System.out.println("Age: " + age);
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}