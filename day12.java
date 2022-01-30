import java.util.*;
//parent Class
class Person{
    protected String firstName;
    protected String lastName;
    protected int idNumber;

//    Constructor

    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

//    printing the personal Data
    void printPerson(){
        System.out.println("Name: "+ lastName + " , " + firstName
                    +       "\nID:"+ idNumber);
    }
}

class Student extends Person{
    private int[] testScores;

// Constructor
    Student(String firstName, String lastName, int idNumber, int[] testScores)
    {
        super(firstName, lastName, idNumber);
        this.testScores = testScores;
    }

//    Calculate Method has Been Declared
    char calculate(){
        int total = 0;
        for (int testScore : testScores) total += testScore;
        int avg = total/testScores.length;

        if (avg<=100 && avg>=90) return'O';
        if (avg<90 && avg>=80) return'E';
        if (avg<80 && avg>=70) return 'A';
        if (avg<79 && avg>=55) return 'P';
        if (avg<55 && avg>=40) return 'D';
        return 'T';
    }
}

public class day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        int idNumber = sc.nextInt();
        int numScores = sc.nextInt();
        int[] testScores = new int[numScores];
        for (int i=0; i<numScores;i++)
        {
            testScores[i] = sc.nextInt();
        }
        sc.close();

        Student s = new Student(firstName, lastName, idNumber, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
