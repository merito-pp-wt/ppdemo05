public class Dog {
    private String name;

    public Dog(String n) {
        name = n;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void bark() {
        System.out.println(name + " szczeka: hau, hau!");
    }

    public String toString() {
        return "Jestem pies " + name + "!";
    }
}
