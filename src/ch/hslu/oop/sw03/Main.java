package ch.hslu.oop.sw03;

public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo(5, 10);
        System.out.println(demo.getMax2(3333, 7));    // erwartet: 7
        System.out.println(demo.getMax3(3, 7, 11)); // erwartet: 7
    }
}
