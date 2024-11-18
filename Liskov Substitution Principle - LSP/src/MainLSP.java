public class MainLSP {
    public static void main(String[] args) {
        Person perHarsh = new Person("Harsh");

        // Create a teacher and a student
        Person teacher = new Teacher("Mr. Baldaniya");
        Person student = new Student("Harsh");

        // Both teacher and student can attend the school function (substitution works)
        teacher.attendSchoolFunction("event 1"); 
        student.attendSchoolFunction("event 2"); 

        // Teacher can give a lecture, but student cannot
        if (teacher instanceof Teacher) {
            ((Teacher) teacher).giveLecture(); 
        }

        // We can't cast student to Teacher because it would violate LSP
        if (student instanceof Teacher) {
            ((Teacher) student).giveLecture(); // This won't run because student is not a teacher.
        }

        EventManager eventMgr = new EventManager(perHarsh);
        eventMgr.SendToAnEvent("sports day");

        EventManager eventMgr2 = new EventManager(student);
        eventMgr2.SendToAnEvent("annual day");
    }
}