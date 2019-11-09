package main;

public class main {
    public static void main(String[] args) {
        Circle r=new Circle(2.2f,4.4f);
        r.set_radius(4.2f);
        r.set_diameter(8.4f);
        System.out.println("Радиус="+r.get_radius()+" Диаметр="+r.get_diameter());
    }
}
