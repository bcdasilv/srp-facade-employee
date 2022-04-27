package after;

public class HourReporter {
    
    public HourReporter() {

    }

    public void reportHours(Employee emp, int hours) {
        // any business logic to report hours
        int regularHours = emp.getRegularHours();
        if (regularHours < Employee.MAX_HOURS) {
            regularHours += hours;
            emp.setRegularHours(regularHours);
        } else {
            //throw new EmployeeReportHoursException();
        }
        // etc.
    }

    public void adjustHours(Employee emp, int hours) {
        int regularHours = emp.getRegularHours();
        if (hours <= regularHours) {
            regularHours -= hours;
            emp.setRegularHours(regularHours);
        }
        else {
            //throw new EmployeeReportHoursException();
        }
    }
}
