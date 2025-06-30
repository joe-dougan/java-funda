class Bagel{

//    Define a class called Bagel that has three instance fields
//
//            A String called seeds that describes what seeds are on the bread.
//    Another String called filling that describes what's inside the bagel
//    An Integer called price that describes the price in £
//    Once you're done, it should be possible to set these fields when creating a new instance of Bagel. For example...
//
//            new Bagel("sesame", "tofu paté and kimchi", 5)
//
//    Now define three instance methods...
//
//    getSeeds -> returns seeds
//    getFilling -> returns filling
//    getPrice -> returns price

    String seeds;
    String filling;
    int price;

    public Bagel(String seeds, String filling, int price){
        this.seeds = seeds;
        this.filling = filling;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public String getFilling() {
        return this.filling;
    }

    public String getSeeds() {
        return this.seeds;
    }

    public static void main(String[] args) {
        Bagel bagel = new Bagel("sesame","tofu pate and kimchi", 5);
        System.out.println(bagel.getSeeds());
        System.out.println(bagel.getFilling());
        System.out.println(bagel.getPrice());
    }
}