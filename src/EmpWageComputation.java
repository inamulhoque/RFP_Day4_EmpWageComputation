public class EmpWageComputation {
    public static void main(String[] args) {
//        int isFullTime = 1;
//        int isPartTime = 2;
        int EmpRatePerHr = 20;
        int emphrs = 0;
        int empwage = 0;
        int empCheck = (int) (Math.floor(Math.random()*10)%3);
        switch (empCheck){
            case 1:
                System.out.println("Employee is present full time");
                emphrs = 8;
                break;
            case 2:
                System.out.println("Employee is present part time");
                emphrs = 4;
                break;
            default:
                System.out.println("Employee is absent");
        }
        empwage = emphrs * EmpRatePerHr;
        System.out.print("Today's wage is: "+empwage);
    }
}
