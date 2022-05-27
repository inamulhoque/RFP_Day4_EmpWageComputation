public class EmpWageComputation {
    public static void main(String args[]) {
        System.out.println("welcome to Employee wage computation program\n");
        int isFullTime = 1;
        int isPartTime = 2;
        int EmpRatePerHour = 20;
        int emphrs = 0;
        int empwage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == isFullTime) {
            System.out.println("Employee is present full time");
            emphrs = 8;
        } else if (empCheck == isPartTime) {
            System.out.println("Employee is present part time");
            emphrs = 4;
        }else {
            System.out.println("Employee is absent");
        }
        empwage = emphrs * EmpRatePerHour;
        System.out.println(empwage);
    }
}
