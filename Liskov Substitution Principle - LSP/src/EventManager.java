public class EventManager {
    private Person _person = null;
    public EventManager(Person person) {
        this._person = person;
    }

    public void SendToAnEvent(String nameOfEvnet) {
        this._person.attendSchoolFunction(nameOfEvnet);
    }
}
