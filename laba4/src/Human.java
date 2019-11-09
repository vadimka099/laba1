        public class Human implements Nameable{
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void GetName() {
        System.out.printf("Человека зовут '%s' ", name);
    }
}
