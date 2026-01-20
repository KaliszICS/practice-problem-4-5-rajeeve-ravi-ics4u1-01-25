import java.util.*;

/**
 * The type Practice problem.
 */
public class PracticeProblem {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
    }
}

/**
 * The type Student.
 */
class Student {
    private String name;
    private int age;
    private String studentNumber;

    /**
     * Instantiates a new Student.
     *
     * @param name          the name
     * @param age           the age
     * @param studentNumber the student number
     */
    public Student(String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() { return name; }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() { return age; }

    /**
     * Gets student number.
     *
     * @return the student number
     */
    public String getStudentNumber() { return studentNumber; }

    @Override
    public String toString() {
        return name + ", " + age + " - " + studentNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        if (studentNumber == null) {
            return other.studentNumber == null;
        }
        return studentNumber.equals(other.studentNumber);
    }
}

/**
 * The type Cow.
 */
class Cow {
    private String name;
    private int age;
    private double weight;

    /**
     * Instantiates a new Cow.
     *
     * @param name   the name
     * @param age    the age
     * @param weight the weight
     */
    public Cow(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() { return name; }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() { return age; }

    /**
     * Gets weight.
     *
     * @return the weight
     */
    public double getWeight() { return weight; }

    @Override
    public String toString() {
        // Formats exactly as "name, age - weight"
        return name + ", " + age + " - " + weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cow other = (Cow) obj;
        return age == other.age &&
                Double.compare(other.weight, weight) == 0 &&
                Objects.equals(name, other.name);
    }
}
