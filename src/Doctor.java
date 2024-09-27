public class Doctor extends Person{
    private String specialty;
    
    public Doctor(String name, String specialty){
        super(name);
        this.specialty = specialty;
    }

    @Override
    public String getName() {
        return "Dr. " + super.getName();
    }
}
