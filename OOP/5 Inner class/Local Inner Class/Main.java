class OuterClass {
    void outerMethod() {
        class LocalInnerClass {
            void display() {
                System.out.println("This is a local inner class");
            }
        }
        LocalInnerClass local = new LocalInnerClass();
        local.display();
    }
}

public class Main {
   public static void main(String[] args) {
    OuterClass outer = new OuterClass();
    outer.outerMethod();
   } 
}
