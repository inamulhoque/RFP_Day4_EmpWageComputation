public class EmpWageComputation {
    public static void main(String[] args) {
        System.out.println("welcome to Employee wage computation program\n");
        int isFulltime = 1;
        int EmpRatePerHour = 20;
        int emphrs = 0;
        int empwage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == isFulltime) {
            System.out.println("Employee is present");
            emphrs = 8;
        } else {
            System.out.println("Employee is absent");
            emphrs = 0;
        }
        System.out.print("Today's wage is: ");
        empwage = emphrs * EmpRatePerHour;
        System.out.print("Rs."+empwage);
    }
}
