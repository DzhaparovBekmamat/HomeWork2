public class Main {
    public static Printable createObject(String className) {
        switch (className) {
            case "Child1":
                return new Child1("Bekmamat", 19, "Coding");
            case "Child2":
                return new Child2("Bektur", 15, "Elementary");
            case "Child3":
                return new Child3("Abai", 19, "Soccer");
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Printable obj1 = createObject("Child1");
        Printable obj2 = createObject("Child2");
        Printable obj3 = createObject("Child3");
        obj1.print();
        obj2.print();
        obj3.print();
    }
}
