package Logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GymSystem implements Serializable {

    Employee emp = null;
    public static ArrayList<Employee> employeeList;
    public static ArrayList<Member> memberList;

    Student newStudent = null;

    public GymSystem() {
        employeeList = new ArrayList<>();
        memberList = new ArrayList<>();

    }

    private static int totalNumberMember;
    private static int totalNumberStudent;
    private static int totalNumberEmployee;
    private static int totalNumberTrainer;
    private static int totalNumberPolyStaff;
    Scanner in = new Scanner(System.in);

    Member m = null;

    /**
     * Name: addMember
     *
     * @author Group 4 Purpose/description: To Add Member in the gym system the
     * member is whether student member or staff member and the student member
     * has to special attributes ( course name and sport team ) and the member
     * staff has also two special attributes which is position and department.
     */
    public void addMember() {
        Staff newStaff = null;
        boolean acceptable = false;
        boolean done = false;
        String type = "";
        String firstName, lastName, address, date, gender, sportteam, course, position, department = "";
        int phone;

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter member type (if you are a student member or staff member)");
            type = input.next();
            if (type.equalsIgnoreCase("staff")) {
                acceptable = true;
            } else {
                acceptable = type.equalsIgnoreCase("student");
            }
        } while (!acceptable);

        if (type.equalsIgnoreCase("staff")) {
            do {
                try {
                    // Ask the user to enter the employee details
                    System.out.println("Enter staff details");

                    System.out.println("First name");
                    firstName = input.next();
                    if (firstName.length() < 2) {
                        throw new IllegalArgumentException("Please enter a first name with at least two letters.");
                    }

                    System.out.println("Last name");
                    lastName = input.next();
                    if (lastName.length() < 2) {
                        throw new IllegalArgumentException("Please enter a last name with at least two letters.");
                    }

                    System.out.println("Address");
                    address = input.next();
                    if (address.length() < 2) {
                        throw new IllegalArgumentException("Please enter an address with at least two letters.");
                    }

                    System.out.println("Date of birth");
                    date = input.next();

                    String Day;
                    String month;
                    String year;
                    try {
                        String[] dateParts = date.split("/");
                        if (dateParts.length != 3) {
                            throw new IllegalArgumentException("Please enter a date in the format of DD/MM/YYYY.");
                        }
                        Day = dateParts[0];
                        month = dateParts[1];
                        year = dateParts[2];
                        if (Day.length() != 2 || month.length() != 2 || year.length() != 4) {
                            throw new IllegalArgumentException("Please enter a date in the format of DD/MM/YYYY.");
                        }
                        int day = Integer.parseInt(Day);
                        int monthInt = Integer.parseInt(month);
                        int yearInt = Integer.parseInt(year);
                        if (day < 1 || day > 31) {
                            throw new IllegalArgumentException("Please enter a valid day between 1 and 31.");
                        }
                        if (monthInt < 1 || monthInt > 12) {
                            throw new IllegalArgumentException("Please enter a valid month between 1 and 12.");
                        }
                        if (yearInt < 1900 || yearInt > 2023) {
                            throw new IllegalArgumentException("Please enter a valid year between 1900 and 2023.");
                        }
                    } catch (NumberFormatException e) {
                        // Handle the exception when `Day`, `month`, or `year` cannot be parsed as an integer
                        throw new IllegalArgumentException("Please enter a valid date in the format of DD/MM/YYYY.");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        continue; // Continue the loop if an exception occurs
                    }

                    System.out.println("Gender (F or M)");
                    gender = input.next();
                    if (!gender.equalsIgnoreCase("F") && !gender.equalsIgnoreCase("M")) {
                        throw new IllegalArgumentException("Please enter 'F' or 'M' for gender.");
                    }

                    System.out.println("Phone");
                    phone = input.nextInt();
                    if (phone <= 0) {
                        throw new IllegalArgumentException("Please enter a valid phone number.");
                    }

                    System.out.println("Department");
                    department = input.next();

                    System.out.println("Position");
                    position = input.next();

                    System.out.println("Assign personal trainer? (Y or N)");
                    String wantPT = input.next();
                    boolean hasPT = false;
                    if (wantPT.equalsIgnoreCase("Y")) {
                        hasPT = true;
                        assignMemberToTrainer();
                    } else {
                        hasPT = false;
                    }

                    done = true;

                    Employee personalTrainer = null;

                    newStaff = new Staff(position, department, firstName, lastName, date, phone, gender, hasPT, address, personalTrainer);
                    memberList.add(newStaff);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } while (!done);
        } else if (type.equalsIgnoreCase("student")) {
            do {
                try {
                    // Ask the user to enter the student details
                    System.out.println("Enter student details");

                    System.out.println("First name");
                    firstName = input.next();
                    if (firstName.length() < 2) {
                        throw (new IllegalArgumentException("Please enter a first name with at least two letters."));
                    }

                    System.out.println("Last name");
                    lastName = input.next();
                    if (lastName.length() < 2) {
                        throw new IllegalArgumentException("Please enter a last name with at least two letters.");
                    }

                    System.out.println("Address");
                    address = input.next();
                    if (address.length() < 2) {
                        throw new IllegalArgumentException("Please enter an address with at least two letters.");
                    }

                    System.out.println("Date of birth");
                    date = input.next();

                    String Day;
                    String month;
                    String year;
                    try {
                        String[] dateParts = date.split("/");
                        if (dateParts.length != 3) {
                            throw new IllegalArgumentException("Please enter a date in the format of DD/MM/YYYY.");
                        }
                        Day = dateParts[0];
                        month = dateParts[1];
                        year = dateParts[2];
                        if (Day.length() != 2 || month.length() != 2 || year.length() != 4) {
                            throw new IllegalArgumentException("Please enter a date in the format of DD/MM/YYYY.");
                        }
                        int day = Integer.parseInt(Day);
                        int monthInt = Integer.parseInt(month);
                        int yearInt = Integer.parseInt(year);
                        if (day < 1 || day > 31) {
                            throw new IllegalArgumentException("Please enter a valid day between 1 and 31.");
                        }
                        if (monthInt < 1 || monthInt > 12) {
                            throw new IllegalArgumentException("Please enter avalid month between 1 and 12.");
                        }
                        if (yearInt < 1900 || yearInt > 2023) {
                            throw new IllegalArgumentException("Please enter a valid year between 1900 and 2023.");
                        }
                    } catch (NumberFormatException e) {
                        // Handle the exception when `Day`, `month`, or `year` cannot be parsed as an integer
                        throw new IllegalArgumentException("Please enter a valid date in the format of DD/MM/YYYY.");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        continue; // Continue the loop if an exception occurs
                    }

                    System.out.println("Gender (F or M)");
                    gender = input.next();
                    if (!gender.equalsIgnoreCase("F") && !gender.equalsIgnoreCase("M")) {
                        throw new IllegalArgumentException("Please enter 'F' or 'M' for gender.");
                    }

                    System.out.println("Phone");
                    phone = input.nextInt();
                    if (phone <= 0) {
                        throw new IllegalArgumentException("Please enter a valid phone number.");
                    }

                    System.out.println("Sport team");
                    sportteam = input.next();

                    System.out.println("Course");
                    course = input.next();
                    if (course.length() < 2) {
                        throw new IllegalArgumentException("Please enter a course name with at least two letters.");
                    }

                    done = true;
                    System.out.println("Assign personal trainer? (Y or N)");
                    String wantPT = input.next();
                    boolean hasPT = false;
                    if (wantPT.equalsIgnoreCase("Y")) {
                        hasPT = true;
                        assignMemberToTrainer();
                    } else {
                        hasPT = false;
                    }
                    //int memberID = Id++;

                    Employee personalTrainer = null;
                    newStudent = new Student(course, sportteam, firstName, lastName, date, phone, gender, hasPT, address, personalTrainer);
                    memberList.add(newStudent);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } while (!done);
        }
    }

    /**
     * Name: addEmployee
     *
     * @author Group 4 Purpose/description: To Add Employee in the gym system
     * the employee is whether a normal employee or a trainer
     */
    public void addEmployee() {
        boolean acceptable = false;
        boolean done = false;
        String firstName = "", lastName = "", date = "", gender = "", address = "";
        double salary = 0;
        int phone = 0;

//ask the user to enter the employee details 
        System.out.println("Enter employee details");

        do {
            try {
                System.out.println("First name:");
                firstName = in.next();
                if (firstName.length() < 3) {
                    throw new IllegalArgumentException("First name should be at least 3 characters long.");
                }
                acceptable = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                acceptable = false;
            }
        } while (!acceptable);

        do {
            try {
                System.out.println("Last name:");
                lastName = in.next();
                if (lastName.length() < 3) {
                    throw new IllegalArgumentException("Last name should be at least 3 characters long.");
                }
                acceptable = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                acceptable = false;
            }
        } while (!acceptable);

        System.out.println("Address");
        address = in.next();
        if (address.length() < 2) {
            throw new IllegalArgumentException("Please enter an address with at least two letters.");
        }

        do {
            try {
                System.out.println("Date of birth (dd/mm/yyyy):");
                date = in.next();
                if (date == null || date.isEmpty()) {
                    throw new IllegalArgumentException("Date of birth should not be empty.");
                }
                acceptable = true;

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                acceptable = false;
            }
        } while (!acceptable);

        do {
            try {
                System.out.println("Gender (F or M):");
                gender = in.next();
                if (!gender.equalsIgnoreCase("F") && !gender.equalsIgnoreCase("M")) {
                    throw new IllegalArgumentException("Gender should be either F or M.");
                }
                acceptable = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                acceptable = false;
            }
        } while (!acceptable);

        do {
            try {
                System.out.println("Phone number:");
                phone = in.nextInt();
                if (phone <= 0) {
                    throw new IllegalArgumentException("Phone number should be greater than 0.");
                }
                acceptable = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid phone number.");
                in.nextLine(); // clear the input buffer
                acceptable = false;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                acceptable = false;
            }
        } while (!acceptable);

        do {
            try {
                System.out.println("Salary:");
                salary = in.nextDouble();
                if (salary < 0) {
                    throw new IllegalArgumentException("Salary should be greater than or equal to 0.");
                }
                acceptable = true;
            } catch (InputMismatchException e) {

                System.out.println("Invalid input. Please enter a valid salary.");
                in.nextLine(); // clear the input buffer
                acceptable = false;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                acceptable = false;
            }
        } while (!acceptable);

//ask the user "is the employee a personal trainer"
        String isPT = "";
        do {
            try {
                System.out.println("Is this employee a personal trainer? (Y/N):");
                isPT = in.next();
                if (!isPT.equalsIgnoreCase("Y") && !isPT.equalsIgnoreCase("N")) {
                    throw new IllegalArgumentException("Response should be either Y or N.");
                }
                acceptable = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                acceptable = false;
            }
        } while (!acceptable);
        boolean isPersonalTrainer = isPT.equalsIgnoreCase("Y");

//chech the user input 
        if (isPersonalTrainer) {
            emp = new Trainer(firstName, lastName, address, date, phone, gender, salary, isPersonalTrainer);
            employeeList.add((Trainer) emp);
            employeeList.add(emp);
        } else {
            emp = new Employee(firstName, lastName, address, date, phone, gender, salary, isPersonalTrainer);
            employeeList.add(emp);
        }

        System.out.println("Employee added successfully.");

    }

    /**
     * Name: assignMemberToTrainer
     *
     * @author Group 4 Purpose/description: In this method the administrator can
     * assign a trainer to member of his choice from the list of trainers he
     * have
     */
    public void assignMemberToTrainer() {
        Scanner scan = new Scanner(System.in);

        try {
            // Get the selected trainer from the menu
            System.out.println("Select a trainer:");
            for (int i = 0; i < GymSystem.employeeList.size(); i++) {
                Trainer trainer = (Trainer) GymSystem.employeeList.get(i);
                System.out.println((i + 1) + ". " + trainer.getFirstName());
            }
            System.out.print("Enter trainer number: ");
            int trainerNumber = scan.nextInt();

            if (trainerNumber < 1 || trainerNumber > GymSystem.employeeList.size()) {
                throw new IllegalArgumentException("Invalid trainer number.");
            }

            Trainer selectedTrainer = (Trainer) GymSystem.employeeList.get(trainerNumber - 1);

            // Get the selected member from the menu
            System.out.println("Select a member:");
            for (int i = 0; i < GymSystem.memberList.size(); i++) {
                Member member = GymSystem.memberList.get(i);
                System.out.println((i + 1) + ". " + member.getFirstName() + " (ID: " + member.getMembershipId() + ")");
            }
            System.out.print("Enter member number: ");
            int memberNumber = scan.nextInt();

            if (memberNumber < 1 || memberNumber > GymSystem.memberList.size()) {
                throw new IllegalArgumentException("Invalid member number.");
            }

            Member selectedMember = GymSystem.memberList.get(memberNumber - 1);

            // Check if the selected member is already assigned to a trainer
            if (selectedMember.getPersonalTrainer() != null) {
                Trainer oldTrainer = (Trainer) selectedMember.getPersonalTrainer();

                // Remove the selected member from the old trainer's member list
                oldTrainer.getMemberTList().remove(selectedMember);
            }

            // Assign the selected trainer to the selected member
            selectedMember.setPersonalTrainer(selectedTrainer);
            selectedTrainer.getMemberTList().add(selectedMember);

            // Print some information about the assignment
            System.out.println("The member " + selectedMember.getFirstName() + " who holds the number " + selectedMember.getMembershipId() + " will be trained by " + selectedTrainer.getFirstName() + ".");
            System.out.println("List of members for " + selectedTrainer.getFirstName() + ":");

            // Print the list of members assigned to the selected trainer
            for (Member member : selectedTrainer.getMemberTList()) {
                System.out.println(member.getFirstName() + " (ID: " + member.getMembershipId() + ")");
            }
        } catch (IllegalArgumentException ex) {
            System.out.println("Invalid input: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("An error occurred: " + ex.getMessage());
        }

    }

    /**
     * Name: alterMember
     *
     * @author Group 4 Purpose/description: the administrator has the ability to
     * modify the member information
     */
    public void alterMember() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the membership ID of the member to modify: ");
        int id = 0;
        try {
            id = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Membership ID must be an integer.");
            return;
        }

        boolean found = false;

        for (Member member : GymSystem.memberList) {
            if (member.getMembershipId() == id) {
                if (member instanceof Student) {
                    Student student = (Student) member; // Cast Member to Student

                    // Get the updated details of the student and validate them
                    System.out.print("Enter the updated first name of the student: ");
                    String firstName = scanner.next();

                    System.out.print("Enter the updated surname of the student: ");
                    String surname = scanner.next();

                    System.out.print("Enter the updated gender of the student (M/F): ");
                    String gender = scanner.next();

                    System.out.print("Enter the updated address of the student: ");
                    String address = scanner.next();

                    System.out.print("Enter the updated team of the student: ");
                    String team = scanner.next();

                    System.out.print("Enter the updated course of the student: ");
                    String course = scanner.next();

                    System.out.print("Enter the updated date of birth of the student (DD/MM/YYYY): ");
                    String dateOfBirth = scanner.next();

                    int phone = 0;
                    try {
                        System.out.print("Enter the updated phone number of the student: ");
                        phone = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Phone number must be an integer.");
                        return;
                    }

                    if (firstName.length() < 2) {
                        System.out.println("Invalid input. First name must be at least 2 characters.");
                        return;
                    }

                    if (surname.length() < 2) {
                        System.out.println("Invalid input. Surname must be at least 2 characters.");
                        return;
                    }

                    if (!gender.matches("[MF]")) {
                        System.out.println("Invalid input. Gender must be either M or F.");
                        return;
                    }

                    if (address.length() < 4) {
                        System.out.println("Invalid input. Address must be at least 4 characters.");
                        return;
                    }

                    if (team.length() < 2) {
                        System.out.println("Invalid input. Team name must be at least 2 characters.");
                        return;
                    }

                    if (course.isEmpty()) {
                        System.out.println("Invalid input. Course cannot be empty.");
                        return;
                    }

                    if (dateOfBirth.isEmpty() || !dateOfBirth.matches("\\d{2}/\\d{2}/\\d{4}")) {
                        System.out.println("Invalid input. Date of birth must be in the format DD/MM/YYYY.");
                        return;
                    }

                    if (phone < 1000000000) {
                        System.out.println("Invalid input. Phone number must be at least 10 digits.");
                        return;
                    }

                    // Update the student's details
                    student.setFirstName(firstName);
                    student.setSurname(surname);
                    student.setGender(gender);
                    student.setAddress(address);
                    student.setTeam(team);
                    student.setCourse(course);
                    student.setDateOfBirth(dateOfBirth);
                    student.setPhone(phone);

                } else if (member instanceof Staff) {
                    Staff staff = (Staff) member; // Cast Member to Staff

                    // Get the updated details of the staff member and validate them
                    System.out.print("Enter the updated first name of the staff member: ");
                    String firstName = scanner.next();

                    System.out.print("Enter the updated surname of the staff member: ");
                    String surname = scanner.next();

                    System.out.print("Enter the updated gender of the staff member (M/F): ");
                    String gender = scanner.next();

                    System.out.print("Enter the updated position of the staff member: ");
                    String position = scanner.next();

                    System.out.print("Enter the updated department of the staff member: ");
                    String department = scanner.next();

                    System.out.print("Enter the updated address of the staff member: ");
                    String address = scanner.next();

                    System.out.print("Enter the updated date of birth of the staff member (DD/MM/YYYY): ");
                    String dateOfBirth = scanner.next();

                    int phone = 0;
                    try {
                        System.out.print("Enter the updated phone number of the staff member: ");
                        phone = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Phone number must be an integer.");
                        return;
                    }

                    if (firstName.length() < 2) {
                        System.out.println("Invalid input. First name must be at least 2 characters.");
                        return;
                    }

                    if (surname.length() < 2) {
                        System.out.println("Invalid input. Surname must be at least 2 characters.");
                        return;
                    }

                    if (!gender.matches("[MF]")) {
                        System.out.println("Invalid input. Gender must be either M or F.");
                        return;
                    }

                    if (position.length() < 3) {
                        System.out.println("Invalid input. Position must be at least 3 characters.");
                        return;
                    }

                    if (department.length() < 3) {
                        System.out.println("Invalid input. Department name must be at least 3 characters.");
                        return;
                    }

                    if (address.length() < 4) {
                        System.out.println("Invalid input. Address must be at least 4 characters.");
                        return;
                    }

                    if (dateOfBirth.isEmpty() || !dateOfBirth.matches("\\d{2}/\\d{2}/\\d{4}")) {
                        System.out.println("Invalid input. Date of birth must be in the format DD/MM/YYYY.");
                        return;
                    }

                    if (phone < 1000000000) {
                        System.out.println("Invalid input. Phone number must be at least 10 digits.");
                        return;
                    }

                    // Update the staff member's details
                    staff.setFirstName(firstName);
                    staff.setSurname(surname);
                    staff.setGender(gender);
                    staff.setPosition(position);
                    staff.setDepartment(department);
                    staff.setAddress(address);
                    staff.setDateOfBirth(dateOfBirth);
                    staff.setPhone(phone);

                }
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Member not found.");
        } else {
            System.out.println("Member details have been updated.");
        }

    }

    /**
     * Name: alterEmployee
     *
     * @author Group 4 Purpose/description: The administrator has the ability to
     * modify the Employee information
     */
    public void alterEmployee() {
        int staffid;
        int j = 0;
        String firstName, lastName, date, gender = "", address = "";
        double salary = 0;
        int phone;
        boolean found = false;
        boolean acceptable = false;
        boolean done = false;
        Scanner input = new Scanner(System.in);

        try {
            staffid = input.nextInt();
            if (employeeList.get(j).getStaffId() == staffid) {
                found = true;
                System.out.println("\n Employee Details: \n");
                System.out.println("Staff First name: " + employeeList.get(j).getFirstName());
                System.out.println("Staff Surname: " + employeeList.get(j).getSurname());
                System.out.println("Staff date of birth: " + employeeList.get(j).getDateOfBirth());
                System.out.println("Staff phone : " + employeeList.get(j).getPhone());
                System.out.println("Staff gender: " + employeeList.get(j).getGender());
                System.out.println("Staff salary: " + employeeList.get(j).getSalary());

                System.out.println("Enter employee details");
                do {
                    System.out.println("First name");
                    firstName = input.next();
                    if (firstName.length() > 2) {
                        acceptable = true;
                    } else {
                        acceptable = false;
                        System.out.println("Please enter a correct name");
                    }
                } while (!acceptable);

                do {
                    System.out.println("Last name: ");
                    lastName = input.next();
                    if (lastName.length() > 2) {
                        acceptable = true;
                    } else {
                        acceptable = false;
                        System.out.println("Please enter a correct name");
                    }
                } while (!acceptable);

                do {
                    System.out.println("address");
                    address = input.next();
                    if (address.length() > 2) {
                        acceptable = true;
                    } else {
                        acceptable = false;
                        System.out.println("Please enter a correct address");
                    }
                } while (!acceptable);

                do {
                    System.out.println("Date of birth: ");
                    date = input.next();

                    if (date != null) {
                        acceptable = true;
                    } else {
                        acceptable = false;
                    }

                } while (!acceptable);

                do {
                    System.out.println("gender: (F or M)");
                    gender = input.next();
                    if (gender.equalsIgnoreCase("f") || gender.equalsIgnoreCase("m")) {
                        acceptable = true;
                    } else {
                        acceptable = false;
                    }
                } while (!acceptable);

                do {
                    System.out.print("Phone: ");
                    phone = input.nextInt();
                    if (phone > 0) {
                        acceptable = true;
                    } else {
                        acceptable = false;
                    }
                } while (!acceptable);

                do {
                    System.out.print("Salary: ");
                    salary = input.nextDouble();

                    if (salary < 0) {
                        acceptable = false;
                        System.out.println("Invalid input");
                    } else {
                        acceptable = true;
                    }
                } while (!acceptable);

                System.out.println("Is this employee a personal trainer? (Y/N): ");
                String isPT = input.next();

                boolean isPersonalTrainer = isPT.equalsIgnoreCase("Y");

                if (isPersonalTrainer) {
                    emp = new Trainer(firstName, lastName, address, date, phone, gender, salary, isPersonalTrainer);
                    employeeList.add(emp);
                }

                employeeList.get(j).setFirstName(firstName);
                employeeList.get(j).setSurname(lastName);
                employeeList.get(j).setDateOfBirth(date);
                employeeList.get(j).setGender(gender);
                employeeList.get(j).setPhone(phone);
                employeeList.get(j).setSalary(salary);
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Name: deleteMember
     *
     * @author Group 4 Purpose/description: In this method the administrator
     * will have the ability to delete a member from the gym administrator and
     * also will check if the member is in any of the trainers list and it will
     * be deleted from their.
     * @param member
     */
    public void deleteMember(Member member) {
        int id;
        boolean found = false;

        try {
            System.out.println("Please enter ID:");
            id = in.nextInt();

            do {
                if (member.getMembershipId() == id) {
                    Trainer trainer = (Trainer) member.getPersonalTrainer();
                    if (trainer != null) {
                        trainer.removeMember(member);
                    }

                    memberList.remove(member);
                    System.out.println("Member deleted.");
                    found = true;
                } else {
                    System.out.println("Member not found");
                    found = false;
                }
            } while (!found);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }

    }

    /**
     * Name: deleteEmployee
     *
     * @author Group 4 Purpose/description: This method will Delete an employee
     * from the gym system and will check if the trainers has any list and if
     * yes it will ask the administrator to delete first the list then delete
     * the trainer.
     *
     */
    public void deleteEmployee() {
        int employeeid = 0;
        Employee employeedeletee = null;
        try {
            for (Employee employee : employeeList) {
                if (employee.getStaffId() == employeeid) {
                    employeedeletee = employee;
                    break;
                }
            }

            if (employeedeletee == null) {
                System.out.println("Employee not found !");
                return;
            }

            if (employeedeletee.isIsPersonalTrainer()) {
                boolean isassignmember = false;
                for (Member member : memberList) {
                    if (member.getPersonalTrainer() == employeedeletee) {
                        isassignmember = true;
                        break;
                    }
                }

                if (isassignmember) {
                    System.out.println("Cannot delete personal trainer. Reassign or remove member first !");
                } else {
                    employeeList.remove(employeedeletee);
                    System.out.println("Personal trainer deleted successfully !");
                }
            } else {
                employeeList.remove(employeedeletee);
                System.out.println("Employee has been deleted successfully !");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }

    }

    /**
     * Name: serializeData
     *
     * @author Group 4 Purpose/description: To serialize data and store them in
     * a data.dat file.
     * @param filename
     */
    public void serializeData(String filename) {
        try {
            FileOutputStream fileOut = new FileOutputStream("data.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            // Serialize employeeList and memberList
            out.writeObject(employeeList);
            out.writeObject(memberList);

            // Serialize memberTList for each Trainer
            for (Employee employee : employeeList) {
                if (employee instanceof Trainer) {
                    Trainer trainer = (Trainer) employee;
                    out.writeObject(trainer.getMemberTList());
                }
            }

            out.close();
            fileOut.close();
            System.out.println("Data serialized to " + filename);
        } catch (IOException e) {
            System.out.println("Error while serializing data: " + e.getMessage());
        }
    }

    /**
     * Name: deserializeData
     *
     * @author Group 4 Purpose/description: To deserialize data and bring them
     * back from the data.dat
     * @param filename
     */
    public void deserializeData(String filename) {
        try {
            FileInputStream fileIn = new FileInputStream("data.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // Deserialize employeeList and memberList
            employeeList = (ArrayList<Employee>) in.readObject();
            memberList = (ArrayList<Member>) in.readObject();

            in.close();
            fileIn.close();
            System.out.println("Data deserialized from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error while deserializing data: " + e.getMessage());
        }
    }

    /**
     * Name: generateMarkReport
     *
     * @author Group 4 Purpose/description: this method will generate a
     * marketing report for the students members and staff members that will
     * count each member and students and will print the information of them.
     */
    public void generateMarkReport() {
        try {
            FileWriter writer = new FileWriter("marketingReport.txt");
            int staffCount = 0;
            int studentCount = 0;

            Scanner scan = new Scanner(System.in);

            System.out.println("Select options for the marketing report:");
            System.out.println("1. Staff");
            System.out.println("2. Student");
            System.out.println("3. All");

            System.out.print("Enter option number: ");
            int option = scan.nextInt();

            boolean staffOptionSelected = (option == 1 || option == 3);  // Check if staff option is selected
            boolean studentOptionSelected = (option == 2 || option == 3);  // Check if student option is selected
            boolean allOptionSelected = (option == 3);  // Check if all option is selected

            if (staffOptionSelected) {
                writer.write("Polytechnic Staff:\n");
                for (Member member : memberList) {
                    if (member instanceof Staff) {
                        Staff staff = (Staff) member;
                        writer.write("Id: " + staff.getMembershipId() + "\n");  // Write staff ID
                        writer.write("Name: " + staff.getFirstName() + " " + staff.getSurname() + "\n");  // Write staff name
                        writer.write("Address: " + staff.getAddress() + "\n");  // Write staff address
                        writer.write("Phone: " + staff.getPhone() + "\n");  // Write staff phone number
                        writer.write("Position: " + staff.getPosition() + "\n");  // Write staff position
                        writer.write("Department: " + staff.getDepartment() + "\n\n");  // Write staff department
                        staffCount++;
                    }
                }
                writer.write("Total staff: " + staffCount + "\n\n");  // Write total staff count
            }

            if (studentOptionSelected) {
                writer.write("Polytechnic Students:\n");
                for (Member member : memberList) {
                    if (member instanceof Student) {
                        Student student = (Student) member;
                        writer.write("Id: " + student.getMembershipId() + "\n");  // Write student ID
                        writer.write("Name: " + student.getFirstName() + " " + student.getSurname() + "\n");  // Write student name
                        writer.write("Address: " + student.getAddress() + "\n");  // Write student address
                        writer.write("Phone: " + student.getPhone() + "\n");  // Write student phone number
                        writer.write("Course: " + student.getCourse() + "\n");  // Write student course
                        writer.write("Team: " + student.getTeam() + "\n\n");  // Write student team
                        studentCount++;
                    }
                }
                writer.write("Total students: " + studentCount + "\n\n");  // Write total student count
            }

            writer.close();
            System.out.println("Marketing report generated successfully. File saved as 'marketingReport.txt'");
        } catch (IOException ex) {
            System.out.println("An error occurred while generating the marketing report.");
            ex.printStackTrace();
        }

    }

    /**
     * Name: createUsers
     *
     * @author Group 4 Purpose/description: Reading the startup file and To
     * Create Users.
     * @throws FileNotFoundException
     */
    public void createUsers() throws FileNotFoundException {
        // Check if serialized data exists
        File serializeData = new File("data.serialized");
        if (!serializeData.exists()) {
            // Read user data from startup file
            File startUpFile = new File("tz.txt");
            FileReader file = new FileReader(startUpFile);
            Scanner scan = new Scanner(file);

            // Read the number of employees from the file
            String emNum = scan.nextLine();
            int emNumInt = Integer.parseInt(emNum);

            // Iterate over each employee in the file
            for (int i = 0; i < emNumInt; i++) {
                // Read the employee type from the file
                String employeeType = scan.nextLine().trim();

                // Create Personal Trainer if the type is "PT"
                if (employeeType.equalsIgnoreCase("PT")) {
                    creatept(scan);

                    // Create Regular Employee if the type is "E"
                } else if (employeeType.equalsIgnoreCase("E")) {
                    createREmp(scan);
                }
            }
        }
    }

    /**
     * Name: creatept
     *
     * @author Group 4
     * @param scan purpose/description: To Create Personal Trainer to the
     * startup file and this method will be called in the createUsers
     */
    public void creatept(Scanner scan) {
        // Read personal trainer details from the scanner
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        String address = scan.nextLine();
        Integer phone = null;
        double salary = 0.0;
        String gender = "";
        String dob = "";

        boolean isPt = true;

        try {
            phone = Integer.parseInt(scan.nextLine());
            salary = Double.parseDouble(scan.nextLine());

            // Create a new Personal Trainer object
            Employee pt = new Trainer(firstName, lastName, address, dob, phone, gender, salary, isPt);
            employeeList.add(pt);
            Member m = null;

            // Read the number of members assigned to the trainer
            int numMem = Integer.parseInt(scan.nextLine());
            for (int i = 0; i < numMem; i++) {
                // Read the member type
                String memType = scan.nextLine();

                // Create a staff member if the type is "Staff"
                if (memType.equalsIgnoreCase("Staff")) {
                    creatStaff(scan, (Trainer) pt);

                    // Create a student member if the type is "Student"
                } else if (memType.equalsIgnoreCase("Student")) {
                    creatStudent(scan, (Trainer) pt);
                }
            }
            System.out.println("Members assigned to trainer " + pt.getFirstName() + " " + pt.getSurname() + ":");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }

    }

    /**
     * Name: createStudent
     *
     * @author Group 4 Purpose/description: To Create member students to the
     * startup file and this method will be called in the createUsers
     * @param scan
     * @param pt
     */
    public void creatStudent(Scanner scan, Trainer pt) {
        // Read student details from the scanner
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        String address = scan.nextLine();
        String dob = scan.nextLine();
        Integer phone = null;
        String gender = scan.nextLine();
        String course = scan.nextLine();
        String team = scan.nextLine();

        boolean hasPt = true;

        try {
            phone = Integer.parseInt(scan.nextLine());

            // Create a new Student object
            Member m = new Student(course, team, firstName, lastName, dob, phone, gender, hasPt, address, pt);
            memberList.add(m);
            m.setPersonalTrainer(pt);
            System.out.println("Assigned personal trainer " + pt.getFirstName() + " " + pt.getSurname() + " to member " + m.getFirstName() + " " + m.getSurname());

            if (pt.getMemberTList() == null) {
                pt.setMemberTList(new ArrayList<Member>());
            }
            pt.getMemberTList().add(m);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }

    }

    /**
     * Name: creatStaff
     *
     * @author Group 4
     *
     * Purpose/description: To Create member Staff to the startup file and this
     * method will be called in the createUsers
     * @param scan
     * @param pt
     */
    public void creatStaff(Scanner scan, Trainer pt) {
        // Read staff details from the scanner
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        String address = scan.nextLine();
        String dob = scan.nextLine();
        Integer phone = null;
        String gender = scan.nextLine();
        String course = scan.nextLine();
        String team = scan.nextLine();

        boolean hasPt = true;

        try {
            phone = Integer.parseInt(scan.nextLine());

            // Create a new Student object
            Member m = new Student(course, team, firstName, lastName, dob, phone, gender, hasPt, address, pt);
            memberList.add(m);
            m.setPersonalTrainer(pt);
            System.out.println("Assigned personal trainer " + pt.getFirstName() + " " + pt.getSurname() + " to member " + m.getFirstName() + " " + m.getSurname());

            if (pt.getMemberTList() == null) {
                pt.setMemberTList(new ArrayList<Member>());
            }
            pt.getMemberTList().add(m);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }

    }

    /**
     * Name: createREmp
     *
     *
     * Purpose/description: To Create regular employee to the startup file and
     * this method will be called in the createUsers
     *
     * @author Group 4
     * @param scan
     */
    public static void createREmp(Scanner scan) {
        try {
            // Read employee details from the scanner
            String firstName = scan.nextLine();
            String lastName = scan.nextLine();
            String address = scan.nextLine();
            Integer phone = Integer.parseInt(scan.nextLine());
            double salary = Double.parseDouble(scan.nextLine());
            boolean isPt = false;
            String gender = null; // Update with the appropriate value
            String dob = null; // Update with the appropriate value

            // Create a new Employee object
            Employee emp = new Employee(firstName, lastName, address, dob, phone, gender, salary, isPt);
            employeeList.add(emp);
            System.out.println("Employee created");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter a valid phone number or salary.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Name: listtariner
     *
     * Purpose/description: to list the personal trainer list that each member
     * have.
     *
     * @author Group 4 To List Personal Trainers
     * @param scan
     */
    public void listtariner() {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get the selected trainer from the employee list
            Trainer selectedTrainer = null;

            // Display the list of trainers
            System.out.println("List of trainers:");
            for (int i = 0; i < GymSystem.employeeList.size(); i++) {
                Trainer trainer = (Trainer) GymSystem.employeeList.get(i);
                System.out.println((i + 1) + ". " + trainer.getFirstName());
            }

            // Get the trainer number from the user
            System.out.print("Enter the trainer number: ");
            int trainerNumber = scanner.nextInt();

            // Check if the entered trainer number is valid
            if (trainerNumber > 0 && trainerNumber <= GymSystem.employeeList.size()) {
                selectedTrainer = (Trainer) GymSystem.employeeList.get(trainerNumber - 1);

                // Iterate over the members of the selected trainer and display their details
                System.out.println("List of members for " + selectedTrainer.getFirstName() + ":");
                for (Member member : selectedTrainer.getMemberTList()) {
                    System.out.println("Membership ID: " + member.getMembershipId());
                    System.out.println("First Name: " + member.getFirstName());
                    System.out.println("Surname: " + member.getSurname());
                    System.out.println();
                }

                // Display a message if the selected trainer has no members
                if (selectedTrainer.getMemberTList().isEmpty()) {
                    System.out.println("This trainer has no members.");
                }
            } else {
                System.out.println("Invalid trainer number. Please try again.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number for the trainer number.");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid trainer number. Please try again.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Name: deletememberfromlist
     *
     * Purpose/description: this method you will be able to delete a member from
     * the trainer list.
     *
     * @author Group 4 To Delete member from personal trainer list
     * @param scan
     */
    public void deletememberfromlist() {

        Scanner scanner = new Scanner(System.in);

        try {
            // Get the selected trainer from the employee list
            Trainer selectedTrainer = null;

            // Display the list of trainers
            System.out.println("List of trainers:");
            for (int i = 0; i < GymSystem.employeeList.size(); i++) {
                Trainer trainer = (Trainer) GymSystem.employeeList.get(i);
                System.out.println((i + 1) + ". " + trainer.getFirstName());
            }

            // Get the trainer number from the user
            System.out.print("Enter the trainer number: ");
            int trainerNumber = scanner.nextInt();

            // Check if the entered trainer number is valid
            if (trainerNumber > 0 && trainerNumber <= GymSystem.employeeList.size()) {
                selectedTrainer = (Trainer) GymSystem.employeeList.get(trainerNumber - 1);

                // Iterate over the members of the selected trainer and display their details
                System.out.println("List of members for " + selectedTrainer.getFirstName() + ":");
                for (Member member : selectedTrainer.getMemberTList()) {
                    System.out.println("Membership ID: " + member.getMembershipId());
                    System.out.println("First Name: " + member.getFirstName());
                    System.out.println("Surname: " + member.getSurname());
                    System.out.println();
                }

                // Display a message if the selected trainer has no members
                if (selectedTrainer.getMemberTList().isEmpty()) {
                    System.out.println("This trainer has no members.");
                }
            } else {
                System.out.println("Invalid trainer number. Please try again.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number for the trainer number.");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid trainer number. Please try again.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Name: getEmployee Purpose/description: will get the employee list
     *
     * @author Group 4
     *
     * @return employeeList
     */
    public ArrayList<Employee> getEmployee() {
        return employeeList;
    }

    /**
     * Name: getMember
     *
     * Purpose/description: will get the members list
     *
     * @author Group 4
     * @return memberList
     */
    public ArrayList<Member> getMember() {
        return memberList;
    }

    /**
     * Name: getTotalNumberMember
     *
     * Purpose/description: will get the total numbers of members list
     *
     * @author Group 4
     * @return totalNumberMember
     */
    public static int getTotalNumberMember() {
        return totalNumberMember;
    }

    /**
     * Name: getTotalNumberStudent
     *
     * Purpose/description: will get the total numbers of Student members list
     *
     * @author Group 4
     * @return totalNumberStudent
     */
    public static int getTotalNumberStudent() {
        return totalNumberStudent;
    }

    /**
     * Name: getTotalNumberEmployee
     *
     * Purpose/description: will get the total numbers of employees list
     *
     * @author Group 4
     * @return totalNumberEmployee
     */
    public static int getTotalNumberEmployee() {
        return totalNumberEmployee;
    }

    /**
     * Name: getTotalNumberTrainer
     *
     * Purpose/description: will get the total numbers of employees trainers
     * list
     *
     * @author Group 4
     * @return totalNumberTrainer
     */
    public static int getTotalNumberTrainer() {
        return totalNumberTrainer;
    }

    /**
     * Name: getTotalNumberPolyStaff
     *
     * Purpose/description: will get the total numbers of polytechnic staff
     * members list
     *
     * @author Group 4
     * @return totalNumberPolyStaff
     */
    public static int getTotalNumberPolyStaff() {
        return totalNumberPolyStaff;
    }

    /**
     * Name: setEmployee
     *
     * Purpose/description: will get mutates employee members list
     *
     * @author Group 4
     * @param employee
     */
    public void setEmployee(ArrayList<Employee> employee) {
        GymSystem.employeeList = employee;
    }

    /**
     * Name: setMember
     *
     * Purpose/description: will get mutates members list
     *
     * @author Group 4
     * @param member
     */
    public void setMember(ArrayList<Member> member) {
        GymSystem.memberList = member;
    }

    /**
     * Name: getEmployeeList
     *
     * Purpose/description: will get employee list
     *
     * @author Group 4
     * @return employeeList
     */
    public static ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    /**
     * Name: getMemberList
     *
     * Purpose/description: will get member list
     *
     * @author Group 4
     * @return memberList
     */
    public static ArrayList<Member> getMemberList() {
        return memberList;
    }

    /**
     * Name: setEmployeeList
     *
     * Purpose/description: will mutates the employee list
     *
     * @author Group 4
     * @return memberList
     */
    public static void setEmployeeList(ArrayList<Employee> employeeList) {
        GymSystem.employeeList = employeeList;
    }

    /**
     * Name: setMemberList
     *
     * Purpose/description: will mutates the member list
     *
     * @author Group 4
     * @return memberList
     */
    public static void setMemberList(ArrayList<Member> memberList) {
        GymSystem.memberList = memberList;

    }

}
