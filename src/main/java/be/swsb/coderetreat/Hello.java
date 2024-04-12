package be.swsb.coderetreat;

public class Hello {

    public static void main(String[] args) {
        System.out.printf(new Hello().greet());
    }

    public String greet() {
        return "World!";
    }
}
