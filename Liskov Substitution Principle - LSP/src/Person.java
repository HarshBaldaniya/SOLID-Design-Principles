public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // All persons can attend functions
    public void attendSchoolFunction(String nameOfEvnet) {
        System.out.println(name + " is attending a school function.");
    }
}