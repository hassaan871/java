class  OuterClass {
    class InnerClass {
        void display() {
            System.out.println("This is the non static inner class");
        }
    }
}


public class Main {
public static void main(String[] args) {
    OuterClass outer = new OuterClass();
    OuterClass.InnerClass inner = outer.new InnerClass();

    inner.display();
}    
}
