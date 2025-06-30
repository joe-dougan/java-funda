class Annoucement{

    public static void alert(String message) {
        System.out.println(message);
    }

    public static void changeOfPlan() {
        System.out.println("Whoops you cant od this anymore time to change the plan");
    }

    public static void apology(){
        System.out.println("Sorry for any inconvenience caused");
    }

    public static void politeNotice(){
        System.out.println("Please remember to take your belongings with you");
    }

    public static void helpNeeded(){
        System.out.println("If help is needed please ask a memeber of staff");
    }

    public static void celebration(){
        System.out.println("Congrats you're onto week 7 of the bootcamp");
    }

    public static void main(String[] args) {
        Annoucement.alert("This is a message from the alert function");
        Annoucement.apology();
        Annoucement.politeNotice();
        Annoucement.helpNeeded();
        Annoucement.celebration();
    }
}