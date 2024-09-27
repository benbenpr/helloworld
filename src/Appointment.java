public class Appointment {
    private Person patient;
    private Doctor doctor;
    private static int maximum_appointments = 12;

    public Appointment(String person, String doctor, String specialty){
        this.doctor = new Doctor(doctor, specialty);
        this.patient = new Person(person);
    }

    public void addPerson(Person person){
        this.patient = person;
    }

    public void addPerson(Doctor doctor){
        this.doctor = doctor;
    }

    public static void get_Maximum_appointments_day(){
        System.out.println(Appointment.maximum_appointments);
    }
}

