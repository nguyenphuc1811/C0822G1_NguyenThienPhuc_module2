package case_study.model.person;

import java.util.Date;

public class Employee extends Person {
    private String level;
    private String standard;
    private Double salary;
    public static final String INTERMEDIATE = "Trung cấp";
    public static final String COLLEGE = "Cao đẳng";
    public static final String UNIVERSITY = "Đại học";
    public static final String AFTER_UNIVERSITY = "Sau Đại học";
    public static final String RECEPTIONIST = "Lễ tân";
    public static final String WAITER = "Phục vụ";
    public static final String EXPERT = "Chuyên viên";
    public static final String SUPERVISOR = "Giám sát";
    public static final String MANAGER = "Quản lí";
    public static final String PRESIDENT = "Giám đốc";

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public Employee(String name, String date, String gender, String idCard, String phoneNumber, String email,String level, String standard, Double salary) {
        super(name,date,gender,idCard,phoneNumber,email);
        this.level = level;
        this.standard = standard;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", standard='" + standard + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
