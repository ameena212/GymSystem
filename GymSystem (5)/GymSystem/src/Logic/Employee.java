package Logic;

import java.io.Serializable;

public class Employee implements Serializable {

    private int id;
    private int phone;
    private double salary;
    private String firstName;
    private String surname;
    private String dateOfBirth;
    private String gender;
    private String address;
    private static int staffId = 1000;
    private boolean isPersonalTrainer;

    /**
     * Name: Employee
     *
     * @author Group 4 Purpose/description: default constructor
     */
    public Employee() {
        firstName = null;
        surname = null;
        dateOfBirth = null;
        phone = 0;
        gender = null;
        staffId = 1000;
        salary = 0;
        isPersonalTrainer = false;
        address = "";
    }

    /**
     * Name: Employee
     *
     * @author Group 4 Purpose/description:Custom Constructor
     * @param firstName
     * @param surname
     * @param address
     * @param dateOfBirth
     * @param phone
     * @param gender
     * @param salary
     * @param isPersonalTrainer
     */
    public Employee(String firstName, String surname, String address, String dateOfBirth, int phone, String gender, double salary, boolean isPersonalTrainer) {
        this.firstName = firstName;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.gender = gender;
        this.id = staffId;
        staffId++;
        this.salary = salary;
        this.isPersonalTrainer = isPersonalTrainer;
        this.address = address;
    }

    /**
     * Name: getFirstName
     *
     * @author Group 4
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Name: getSurname
     *
     * @author Group 4
     * @return surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Name: getDateOfBirth
     *
     * @author Group 4
     * @return dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Name: getPhone
     *
     * @author Group 4
     * @return phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * Name: getGender
     *
     * @author Group 4
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Name: getStaffId
     *
     * @author Group 4
     * @return staffId
     */
    public static int getStaffId() {
        return staffId;
    }

    /**
     * Name: getSalary
     *
     * @author Group 4
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Name: isIsPersonalTrainer
     *
     * @author Group 4
     * @return isPersonalTrainer
     */
    public boolean isIsPersonalTrainer() {
        return isPersonalTrainer;
    }

    /**
     * Name: getAddress
     *
     * @author Group 4
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Name: setAddress
     *
     * @author Group 4
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Name: setFirstName
     *
     * @author Group 4
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Name: setSurname
     *
     * @author Group 4
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Name: setDateOfBirth
     *
     * @author Group 4
     * @param dateOfBirth
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Name: setPhone
     *
     * @author Group 4
     * @param phone
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * Name: setGender
     *
     * @author Group 4
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Name: setSalary
     *
     * @author Group 4
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Name: setIsPersonalTrainer
     *
     * @author Group 4
     * @param isPersonalTrainer
     */
    public void setIsPersonalTrainer(boolean isPersonalTrainer) {
        this.isPersonalTrainer = isPersonalTrainer;
    }

    /**
     * Name: toString
     *
     * @author Group 4
     */
    public String toString() {

        return "ID: " + id + "\n"
                + "Name: " + firstName;

    }

    /**
     * Name: getId
     *
     * @author Group 4
     * @return id
     */
    public int getId() {
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setStaffId(int staffId) {
        Employee.staffId = staffId;
    }

}
