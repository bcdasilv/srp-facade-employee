package after;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {

    private String name;
    private String id;
    private String phoneNumber;
    private LocalDate dob;
    private String jobTitle;
    private BigDecimal baseSalary;
    private int regularHours;
    public static int MAX_HOURS = 200;

    public Employee(String name, String id, String phoneNumber, LocalDate dob, 
        String jobTitle, BigDecimal baseSalary, int regularHours) {
            
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public int getRegularHours() {
        return regularHours;
    }

    public void setRegularHours(int reg) {
        regularHours = reg;
    }

}