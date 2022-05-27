public class EmpWageComputation {
    public static void main(String args[]) {
        int isFullTime = 1;
        int isPartTime = 2;
        int EmpRatePerHour = 20;
        int MaxWorkingDay = 20;
        int MaxWorkingHr = 100;
        int empTotalWage = 0;
        int emphrs = 0;
        int day = 1;
        int totalWorkingHour = 0;

        while(day <= MaxWorkingDay && totalWorkingHour <= MaxWorkingHr) {
            day++;
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck){
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
            totalWorkingHour=totalWorkingHour+emphrs;
            totalWorkingHour++;
        }

        empTotalWage = totalWorkingHour * EmpRatePerHour;
        System.out.println("Total salary of a month: "+empTotalWage);
        System.out.println("Total Working Hour of a month: "+totalWorkingHour);
    }
}
