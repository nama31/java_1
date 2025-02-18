import org.w3c.dom.ls.LSOutput;

public class Animals {
    String name;
    int age;
    public Animals(String name,int age){
        this.age = age;
        this.name =name;
    }
    public String makeSound(){
        return "this animal make saund";
    }
    public String eat(){
        return "this animal eat like";
    }

}
class Dog extends Animals{
    String braed;

    public Dog(String name,int age,String braed){
//        this.age = age;
//        this.name= name;
//        this.braed = braed;
        super(name,age);
        this.braed= braed;
    }
    public void sound(){
        System.out.println(makeSound()+" "+"wooo");
    }
}


class Macho{
    public static void main(String[] args) {
        Dog my = new Dog("alpha",2,"not");
        my.sound();

    }
}