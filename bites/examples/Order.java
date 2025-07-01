class Order{
//    Define a class called Order which has one instance Integer field called total and three instance methods:
//
//    addAmount -> takes one Integer and adds it to the total
//    addDiscount -> takes one Integer and subtracts it from the total
//    getTotal -> returns the total
//    Use all these methods in the main to build an order and print the total.
    int total = 0;

    public void addAmount(int amount) {
        this.total += amount;
    }

    public void addDiscount(int amount) {
        this.total -= amount;
    }

    public int total() {
        return this.total;
    }

    public static void main(String[] args) {
        Order order = new Order();
        order.addAmount(9);
        order.addDiscount(2);
        int total = order.total();
        System.out.println(total);
    }
}