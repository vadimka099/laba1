import javax.print.attribute.standard.MediaSize;

public class main {
    public static void main(String[] args) {
        Nameable[] name = new Nameable[3];
        name[0] = new Planet("Земля");
        name[1] = new Human("Вадим");
        name[2] = new Book("Преступление и наказание", " Фёдор Достоевский", 1989);
        for(int i = 0; i < 3; i++){
            ShowName(name[i]);
            System.out.println();
        }
    }
        public static void ShowName( Nameable name){
            name.GetName();

        }

}
