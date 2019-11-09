public class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public void GetName() {
        System.out.printf("Планета называется: '%s' ", name);

    }
}
