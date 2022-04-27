package after;

import java.math.BigDecimal;

public class PayCalculator {

    public PayCalculator() {
        
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

    public BigDecimal increaseBase(Employee emp, BigDecimal absInc) {
        //increase base salary logic;
        return emp.getBaseSalary();
    }

    public BigDecimal increaseBase(Employee emp, int percentage) {
        //increase base salary logic;
        return emp.getBaseSalary();
    }    
}

