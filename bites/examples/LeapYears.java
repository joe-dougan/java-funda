class LeapYears{

    private Boolean years(int year){
        if (year % 400 == 0){
            return true;
        } else if (year % 100 == 0){
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        LeapYears leapYears = new LeapYears();
        System.out.println(leapYears.years(1000));
    }
}