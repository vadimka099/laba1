package classes;

public class dog1 extends Sobaka {


    public dog1(int weight, int height, String breed) {
        super(weight, height, breed);
    }

    public void display_info() {
        System.out.println("Вес: " + super.get_weight() + " Рост: "
                + super.get_height() +" "+ "Порода: " + super.get_breed());
    }

    }

