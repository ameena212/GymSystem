package Logic;

import java.io.Serializable;

public class Staff extends Member implements Serializable {

    private String position;
    private String department;

    /**
     * Name: Staff
     *
     * @author Group 4
     */
    public Staff() {
        position = "";
        department = "";
    }

    /**
     * Name: Staff
     *
     * @author Group 4
     * @param firstName
     * @param surname
     * @param address
     * @param dateOfBirth
     * @param phone
     * @param gender
     * @param department
     * @param position
     * @param hasPT
     * @param personalTrainer
     */
    public Staff(String position, String department, String firstName, String surname, String dateOfBirth, int phone, String gender, boolean hasPT, String address, Employee personalTrainer) {
        super(firstName, surname, dateOfBirth, phone, gender, hasPT, address, personalTrainer);
        this.position = position;
        this.department = department;
    }

    /**
     * Name: getPosition
     *
     * @author Group 4
     * @return position
     */
    public String getPosition() {
        return position;
    }

    /**
     * Name: setPosition
     *
     * @author Group 4
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Name: getDepartment
     *
     * @author Group 4
     * @return department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Name: setDepartment
     *
     * @author Group 4
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Name: toString
     *
     * @author Group 4
     */
    @Override
    public String toString() {
        return "Staff{"
                + "position='" + position + '\''
                + ", department='" + department + '\''
                + ", firstName='" + getFirstName() + '\''
                + ", surname='" + getSurname() + '\''
                + ", dateOfBirth='" + getDateOfBirth() + '\''
                + ", phone=" + getPhone()
                + ", gender='" + getGender() + '\''
                + ", address='" + getAddress() + '\''
                + ", id=" + getMembershipId()
                + ", personalTrainer=" + getPersonalTrainer()
                + '}';
    }

}
