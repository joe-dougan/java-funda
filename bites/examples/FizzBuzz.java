package bites.examples;

class FizzBuzz{
//    FizzBuzz is a great exercise for practising if statements in a new language. Implement a FizzBuzz class that can give you the right result for one number
//    it doesn't need to loop through a sequence of numbers.
//
//    Your FizzBuzz class should have one static method:
//
//    play -> takes one number as an argument and returns either Fizz, Buzz, FizzBuzz or the input number
    private static String play(Integer number){
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else{
            return number.toString();
        }
    }

    public static void main(String[] args) {
        FizzBuzz fizzbuzz = new FizzBuzz();
        Integer counter = 0;
        while (counter < 100){
            System.out.println(fizzbuzz.play(counter));
            counter++;
        }
    }
}