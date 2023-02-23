public class Child2 extends Parent implements Printable {
    private String school;

    public Child2(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", School: " + getSchool());
    }
}
