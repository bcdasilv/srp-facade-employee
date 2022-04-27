package before;

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

    public BigDecimal calculatePay() {
        // any business logic to calculate salary to be paid
        return null;
    }

    public BigDecimal calculatePay(int extraHours, BigDecimal bonus) {
        // any business logic to calculate salary to be paid
        return null;
    }

    public BigDecimal calculatePay(int extraHours, BigDecimal bonus, 
        BigDecimal sharesVesting) {
        // any business logic to calculate salary to be paid
        return null;
    }

    public BigDecimal increaseBase(BigDecimal absInc) {
        //increase base salary logic;
        return baseSalary;
    }

    public BigDecimal increaseBase(int percentage) {
        //increase base salary logic;
        return baseSalary;
    }    

    public void reportHours(int hours) {
        // any business logic to report hours
        if (regularHours < MAX_HOURS) {
            regularHours += hours;
        } else {
            //throw new EmployeeReportHoursException();
        }
        // etc.
    }

    public void adjustHours(int hours) {
        if (hours <= regularHours) {
            regularHours -= hours;
        }
        else {
            //throw new EmployeeReportHoursException();
        }
    }

    public Employee save() {
        // database save
        Employee savedEmployee = null;
        return savedEmployee;
    }

    public Employee softDelete() {
        // database soft delete
        Employee deleteEmployee = null;
        return deleteEmployee;
    }

    public Employee update() {
        // database update
        Employee savedEmployee = null;
        return savedEmployee;
    }

    public Employee find() {
        // database find
        return this;
    }

    public void logEmployee() {
        // use a log library to log employee data with a timestamp 
            //on a log file or service
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