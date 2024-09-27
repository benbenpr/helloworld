public class Application {
    public static void main(String args[]){
        Person person = new Person("John Doe");
        person.printPersonName();
        Doctor doctor = new Doctor("Jane Doe","Surgery");
        doctor.printPersonName();
        String name = person.getName();
        Appointment app = new Appointment("Max Lime","Jane Doe","Surgery");
        Appointment.get_Maximum_appointments_day();
    }
}
