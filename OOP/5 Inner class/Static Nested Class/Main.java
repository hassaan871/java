class OuterClass {
    static class StaticNestedClass {
        void display(){
            System.out.println("This is a static nested class");
        }
    }
}

public class Main {
    public static void main(String[] args) {
     OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
     nested.display();   
    }
}