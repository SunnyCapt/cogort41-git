import my_package.C;

public class A {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();

        c.printHello();
        b.printWorld();
    }
}
