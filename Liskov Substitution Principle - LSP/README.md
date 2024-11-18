## Liskov Substitution Principle (LSP)

Explanation:
The Liskov Substitution Principle (LSP) states that objects of a superclass should be replaceable with objects of a subclass without altering the correctness of the program. In other words, derived classes must be substitutable for their base class. This allows for polymorphism where objects of different types can be used interchangeably, provided they follow the same behavior contract as their parent class.

Academic Example:
Let's consider an academic scenario where we have different types of people in a school: Teachers and Students. Both of these can be represented by a Person class.

All People (i.e., Person) can attend a school function.
However, Teachers can also give lectures, while Students cannot.
Using LSP, we can ensure that both Teacher and Student can be substituted for Person where appropriate, without breaking the functionality of the system.

### Person.java

Explanation: The Person class is the base class. It represents a general person in the school, such as a teacher or student. All persons can attend school functions.

### Teacher.java

Explanation: The Teacher class extends Person. In addition to attending functions (inherited from Person), a teacher can also give a lecture. This class adheres to LSP because it doesn’t break the behavior of Person.

### Student.java

Explanation: The Student class extends Person. Students can attend functions just like any other Person, but they do not have the ability to give lectures. This class also follows LSP because it can replace Person in any context where attending a school function is required.

### MainLSP.java

Explanation: In the MainLSP.java file, we show that both Teacher and Student objects can be treated as Person objects, and both can attend school functions. This adheres to the Liskov Substitution Principle because we can substitute Teacher or Student for Person without breaking the program.

Additionally, since only teachers can give lectures, we check if the Person is an instance of Teacher before invoking the giveLecture method. This ensures that we respect the specific behavior of the Teacher class while still adhering to LSP.

Why this is important for LSP (Liskov Substitution Principle): The LSP states that objects of a superclass (like Person) should be replaceable by objects of their subclass (like Teacher or Student) without breaking the program. If you tried to cast a Student to a Teacher and call giveLecture(), it would break the program, because students can’t give lectures. That’s why the check instanceof Teacher is necessary here.


Real-Life Academic Scenario for LSP
In a real-life academic system, the Liskov Substitution Principle can be applied when handling school personnel and students. For example, consider a system that processes school events:

All People (students, teachers, administrative staff) can attend events such as school assemblies.
However, only Teachers may have the ability to schedule and conduct lectures.
By using LSP, you can treat both students and teachers as Person objects when dealing with general tasks (like attending school functions), but you maintain specific functionality (such as giving lectures) in their respective classes.

Without LSP:
If the system tries to assign the responsibility of giving lectures to students, it would break the program, since not all Person objects should be allowed to lecture.

With LSP:
The system properly substitutes Teacher and Student for Person only when their behavior matches the required functionality, ensuring that students aren't mistakenly asked to give lectures.

This makes the system flexible and easy to extend without breaking existing functionality. For example, if you later introduce a new role, like a Guest Speaker, you can easily add it as a subclass of Person, following the same behavior patterns.





