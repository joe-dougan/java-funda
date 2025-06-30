class Announcement{

    public static void main(String[] args) {
        Announcement myAnnouncement = new Announcement();
        myAnnouncement.alert("attention please!");
        myAnnouncement.apology();
        myAnnouncement.changeOfPlan();
        myAnnouncement.politeNotice();
        myAnnouncement.helpNeeded();
        myAnnouncement.celebration();
    }

    public void alert(String message) {
        System.out.println(message);
    }

    public void changeOfPlan() {
        System.out.println("Whoops you cant od this anymore time to change the plan");
    }

    public void apology(){
        System.out.println("Sorry for any inconvenience caused");
    }

    public void politeNotice(){
        System.out.println("Please remember to take your belongings with you");
    }

    public void helpNeeded(){
        System.out.println("If help is needed please ask a memeber of staff");
    }

    public void celebration(){
        System.out.println("Congrats you're onto week 7 of the bootcamp");
    }


}