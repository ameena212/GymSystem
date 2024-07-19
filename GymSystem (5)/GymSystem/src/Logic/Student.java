package Logic;

import java.io.Serializable;

public class Student extends Member implements Serializable {

    private String course;
    private String team;

    /**
     * Name: Student
     *
     * @author Group 4
     * @param team
     * @param course
     *
     */
    public Student(String course, String team) {
        this.course = course;
        this.team = team;
    }

    /**
     * Name: Student
     *
     * @author Group 4
     * @param firstName
     * @param surname
     * @param address
     * @param dateOfBirth
     * @param phone
     * @param gender
     * @param team
     * @param course
     * @param hasPT
     * @param personalTrainer
     */
    public Student(String course, String team, String firstName, String surname, String dateOfBirth, int phone, String gender, boolean hasPT, String address, Employee personalTrainer) {
        super(firstName, surname, dateOfBirth, phone, gender, hasPT, address, personalTrainer);
        this.course = course;
        this.team = team;
    }

    /**
     * Name: Student
     *
     * @author Group 4
     */
    public Student() {
        course = "";
        team = "";
    }

    /**
     * Name: getCourse
     *
     * @author Group 4
     * @return course
     */
    public String getCourse() {
        return course;
    }

    /**
     * Name: setCourse
     *
     * @author Group 4
     * @param course
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * Name: getTeam
     *
     * @author Group 4
     * @return team
     */
    public String getTeam() {
        return team;
    }

    /**
     * Name: setTeam
     *
     * @author Group 4
     * @param team
     */
    public void setTeam(String team) {
        this.team = team;
    }

    /**
     * Name: toString
     *
     * @author Group 4
     */
    @Override
    public String toString() {
        return "Student{"
                + "course= " + course
                + ", team= " + team
                + ", name= " + getFirstName()
                + ", lastName= " + getSurname()
                + ", Address= " + getAddress()
                + ", dob= " + getDateOfBirth()
                + ", phone=" + getPhone()
                + ", gender= " + getGender()
                + ", id= " + getMembershipId();
    }

}
