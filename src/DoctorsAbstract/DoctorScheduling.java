package DoctorsAbstract;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoctorScheduling {
    static List<Doctor> doctors = new ArrayList<Doctor>();

    public static void main(String[] args) {

    }

    public static void addDoctor(Scanner input) {
        System.out.print("Enter the doctor's name: ");
        String name = input.nextLine();

        System.out.println("Enter doctor's specialization");
        System.out.println("1: Oncologist\n2: Cardiologist\n3:Dermatologist\n");
        int specialization = input.nextInt();

        switch(specialization) {
            case 1: doctors.add(new Oncologist(name)); break;
            case 2: doctors.add(new Cardiologist(name)); break;
            case 3: doctors.add(new Dermatologist(name)); break;
            default:
                System.out.println("Invalid input - error");
        }
    }

    public static void viewSchedule() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors has been added yet");
        }

        for(Doctor doc: doctors) {
            System.out.print(doc.getName() + " - " + doc.getSchedule());
        }
    }
}
