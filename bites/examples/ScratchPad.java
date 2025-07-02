package bites.examples;

import java.util.HashMap;

class ScratchPad{

    public static void main(String[] args) {
        HashMap<String, Integer[]> score = new HashMap<String, Integer[]>();
        score.put("The Quizzers",new Integer[] {5,3,2});
        score.put("Eggheads", new Integer[] {3,3,6});
        System.out.println(score.get("Eggheads")[0]);
    }
}