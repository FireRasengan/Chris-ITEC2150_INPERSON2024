package DoctorsAbstract;

public class Oncologist extends Doctor {
    public Oncologist(String name) {
        super(name);
    }

    public void getSchedule() {
        System.out.println("Everyday - 10 AM to 2 PM");
    }
}