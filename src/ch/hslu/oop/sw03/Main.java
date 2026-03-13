package ch.hslu.oop.sw03;

public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo(5, 10);
        System.out.println(demo.getMax2(7, 7));
        System.out.println(demo.getMax3(3, 7, 11));
        System.out.println(demo.getMax4(27, -2, 1, 99));

        Temperatur Temperatur = new Temperatur(2000);
        System.out.println(Temperatur.getAggregatzustand("N"));

        Point Point = new Point(10, 22);
        System.out.println(Point.getQuadrant(33, -11));

    }
}
