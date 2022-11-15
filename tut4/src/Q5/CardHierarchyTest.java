package Q5;

public class CardHierarchyTest {
    public static <CreditCard, Passport, DriverLicense> void main(String[] args) {
        DriverLicense d1 = new DriverLicense("John Smith", 2008);
        System.out.println("License of John expired: " + d1.isExpired());
        DriverLicense d2 = new DriverLicense("Bill Jones", 2004);

        

        System.out.println("License of Bill expired: " + d2.isExpired());
        Passport p1 = new Passport("John Smith", "London", 2012);
        System.out.println("Passport of John expired: " + p1.isExpired());
        Passport p2 = new Passport("Bill Jones", "Glasgow", 2020);
        System.out.println("Passport of Bill expired: " + p2.isExpired());
        CreditCard c1 = new CreditCard("John Smith", 5555, 444444444);
// credit card without a name on it!
        CreditCard c2 = new CreditCard(7575, 1515151761);
    }
}
