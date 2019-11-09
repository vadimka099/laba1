
package classes;


public abstract class Sobaka {
    String endl = System.getProperty("line.separator");
    private int weight;
    private int height;
    private String breed;
    public int get_weight() {return weight;}
    public int get_height() {return height;}
    public String get_breed(){return breed;}
    public Sobaka(int weight, int height, String breed){
        this.weight=weight;
        this.height=height;
        this.breed=breed;
    }
    public abstract void display_info();


}
