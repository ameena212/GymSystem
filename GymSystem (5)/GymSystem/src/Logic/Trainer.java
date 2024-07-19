package Logic;

import java.io.Serializable;
import java.util.ArrayList;

public class Trainer extends Employee implements Serializable {

    private ArrayList<Member> memberTList;

    /**
     * Name: Trainer
     *
     * @author Group 4
     */
    public Trainer() {
    }

    /**
     * Name: Trainer
     *
     * @author Group 4
     * @param firstName
     * @param surname
     * @param address
     * @param dateOfBirth
     * @param phone
     * @param gender
     * @param salary
     * @param isPersonalTrainer
     */
    public Trainer(String firstName, String surname, String address, String dateOfBirth, int phone, String gender, double salary, boolean isPersonalTrainer) {
        super(firstName, surname, address, dateOfBirth, phone, gender, salary, isPersonalTrainer);
        memberTList = new ArrayList<>();
    }

    /**
     * Name: getMemberTList
     *
     * @author Group 4
     * @return memberTList
     */
    public ArrayList<Member> getMemberTList() {
        return memberTList;
    }

    /**
     * Name: setMemberTList
     *
     * @author Group 4
     * @param memberTList
     */
    public void setMemberTList(ArrayList<Member> memberTList) {
        this.memberTList = memberTList;
    }

    /**
     * Name: assignMember
     *
     * @author Group 4
     * @param member
     */
    public void assignMember(Member member) {
        memberTList.add(member);
    }

    /**
     * Name: removeMember
     *
     * @author Group 4
     * @param member
     */
    public void removeMember(Member member) {
        memberTList.remove(member);
    }

    /**
     * Name: hasTrainee
     *
     * @author Group 4
     * @param trainee
     * @return trainee
     */
    public boolean hasTrainee(Member trainee) {
        return memberTList.contains(trainee);
    }

    /**
     * Name: toString
     *
     * @author Group 4
     */
    @Override
    public String toString() {
        return "Trainer - " + getFirstName() + getId();
    }

}
