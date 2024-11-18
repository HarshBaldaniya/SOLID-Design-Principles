public class Teacher extends Person {
    public Teacher(String name) {
        super(name);
    }

    // Teachers can give lectures
    public void giveLecture() {
        System.out.println(getName() + " is giving a lecture.");
    }
}