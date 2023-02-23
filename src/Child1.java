public class Child1 extends Parent implements Printable {
    private String hobby;

    public Child1(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Hobby: " + getHobby());
    }
}
