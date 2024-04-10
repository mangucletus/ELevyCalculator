public class ElevyTest {
    public static void main(String[] args) {
        Elevy customer1 = new Elevy("Dr. Bright Yeboah", 0.0, 1234);
        customer1.performTransaction(30);

        Elevy customer2 = new Elevy("Prof. William", 5500, 5678);
        customer2.performTransaction(100);

        Elevy customer3 = new Elevy("Mrs. Joyceline", 700, 9101);
        customer3.performTransaction(40);

        Elevy customer4 = new Elevy("Miss Brown", 3000, 4562);
        customer4.performTransaction(4562);
    }
}
