package bites.examples;

class ProgrammingLanguage{
    String Name;
    int yearOfCreation;
    String creator;

    public ProgrammingLanguage(String name, int yearOfCreation, String creator){
        this.Name = name;
        this.yearOfCreation = yearOfCreation;
        this.creator = creator;
    }

    public String getName() {
        return this.Name;
    }

    public String getCreator() {
        return this.creator;
    }

    public int getYearOfCreation() {
        return this.yearOfCreation;
    }

    public static void main(String[] args) {
        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage("Java", 1995, "James Gosling");
        System.out.println(programmingLanguage.getName());
        System.out.println(programmingLanguage.getYearOfCreation());
        System.out.println(programmingLanguage.getCreator());

    }
}