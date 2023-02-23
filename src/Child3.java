public class Child3 extends Parent implements Printable {
    private String sport;

    public Child3(String name, int age, String sport) {
        super(name, age);
        this.sport = sport;
    }

    public String getSport() {
        return sport;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Sport: " + getSport());
    }
}
