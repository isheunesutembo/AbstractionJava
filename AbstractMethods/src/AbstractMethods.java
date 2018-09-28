public class AbstractMethods {
    public static  void main(String[]args){
     Animal animal;//Allowed .You can create reference of abstract class.
     Animal animal1=new Dog()  ;//Parent class reference-->Child class
     animal1.eat();
     animal1.run();
    }
}
abstract class Animal{
    public void run (){
        System.out.println("Animal is running");
    }
    abstract public void eat();

}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("Animal is eating");
    }
}
