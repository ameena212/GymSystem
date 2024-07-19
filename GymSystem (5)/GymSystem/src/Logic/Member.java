package Logic;

import java.io.Serializable;

public class Member implements Serializable {

    private int phone;
    private boolean hasPT;
    private String gender;
    private String address;
    private String surname;
    private int membershipId;
    private String firstName;
    private String dateOfBirth;
    private Employee personalTrainer;
    private static int nextId = 1000;

    /**
     * Name: getPersonalTrainer
     *
     * @author Group 4
     * @return personalTrainer
     */
    public Employee getPersonalTrainer() {
        return personalTrainer;
    }

    /**
     * Name: setPersonalTrainer
     *
     * @author Group 4
     * @param personalTrainer
     */
    public void setPersonalTrainer(Employee personalTrainer) {
        this.personalTrainer = personalTrainer;
    }

    /**
     * Name: Member
     *
     * @author Group 4
     */
    public Member() {
        firstName = "";
        surname = "";
        dateOfBirth = "";
        phone = 0;
        gender = "";
        nextId = 1000;
        hasPT = false;
        address = "";
    }

    /**
     * Name: Member
     *
     * @author Group 4
     * @param firstName
     * @param surname
     * @param address
     * @param dateOfBirth
     * @param phone
     * @param gender
     * @param hasPT
     * @param personalTrainer
     */
    public Member(String firstName, String surname, String dateOfBirth, int phone, String gender, boolean hasPT, String address, Employee personalTrainer) {
        this.firstName = firstName;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.gender = gender;
        this.hasPT = hasPT;
        this.address = address;
        this.membershipId = nextId;
        nextId++;
        this.personalTrainer = personalTrainer;
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
     * Name: setFirstName
     *
     * @author Group 4
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
     * Name: setSurname
     *
     * @author Group 4
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
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
     * Name: setDateOfBirth
     *
     * @author Group 4
     * @param dateOfBirth
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
     * Name: setAddress
     *
     * @author Group 4
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
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
     * Name: setPhone
     *
     * @author Group 4
     * @param phone
     */
    public void setPhone(int phone) {
        this.phone = phone;
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
     * Name: setGender
     *
     * @author Group 4
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Name: getMembershipId
     *
     * @author Group 4
     * @return membershipId
     */
    public int getMembershipId() {
        return membershipId;
    }

    /**
     * Name: getNextId
     *
     * @author Group 4
     * @return nextId
     */
    public static int getNextId() {
        return nextId;
    }

    /**
     * Name: setNextId
     *
     * @author Group 4
     * @param nextId
     */
    public static void setNextId(int nextId) {
        Member.nextId = nextId;
    }

    /**
     * Name: isHasPT
     *
     * @author Group 4
     * @return hasPT
     */
    public boolean isHasPT() {
        return hasPT;
    }

    /**
     * Name: setHasPT
     *
     * @author Group 4
     * @param hasPT
     */
    public void setHasPT(boolean hasPT) {
        this.hasPT = hasPT;
    }

    /**
     * Name: setMembershipId
     *
     * @author Group 4
     * @param membershipId
     */
    public void setMembershipId(int membershipId) {
        this.membershipId = membershipId;
    }
    
}
