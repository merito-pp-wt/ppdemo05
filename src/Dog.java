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
        System.out.println("Hau! Hau!");
    }

    public String toString() {
        return "Jestem " + name + "!";
    }
}