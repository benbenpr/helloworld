import java.util.List;

public class Person {
    private String name;

    public Person (String name){
        this.name = name;
    };

    public String getName() {
        return this.name;
    };

    public void printPersonName(){
        System.out.println(this.getName());
    };

    public void printPeopleName(List<Person> people){
        for(Person p: people){
            System.out.println(p.getName());
        }
    }
}

