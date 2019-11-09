package main;

public class Circle {
    private float radius ;
    private float diameter;


    public void set_radius(float w){
        radius=w;
    }

    public void set_diameter(float w){
        diameter=w;
    }

    public float get_radius(){
        return radius;
    }

    public float get_diameter(){
        return diameter;
    }

    public Circle(float a, float b) {
        radius = a;
        diameter = b;
    }
}
