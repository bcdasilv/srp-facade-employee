package after;

import java.math.BigDecimal;

public class EmployeeFacade {
    
    EmployeeDAO empDAO;
    EmployeeLogger empLogger;
    HourReporter hourReporter;
    PayCalculator payCalculator;

    public EmployeeFacade(EmployeeDAO empDAO, EmployeeLogger empLogger,
    HourReporter hourReporter, PayCalculator payCalculator) {
        this.empDAO = empDAO;
        this.empLogger = empLogger;
        this.hourReporter = hourReporter;
        this.payCalculator = payCalculator;
    }

    // all the methods from the Business layer classes

    public Employee save(Employee emp) { 
        return empDAO.save(emp);
    }

    public void logEmployee(Employee emp) { 
        empLogger.logEmployee(emp);
    }

    public void reportHours(Employee emp, int hours) { 
        hourReporter.reportHours(emp, hours);
    }

    public BigDecimal calculatePay() { 
        return payCalculator.calculatePay();
    }

    // and more...

}
