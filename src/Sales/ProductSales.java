package Sales;

public class ProductSales {
    public static void main(String[] args) throws Exception {
        Sale s1 = new Sale("power generator", 10.00);
        DiscountSale ds1 = new DiscountSale("power generator", 10.00, 5);

        if (s1.lessThan(ds1)) {
            System.out.println("It is a bad deal");
        } else if (s1.equalDeals(ds1)) {
            System.out.println("There is no deal");
        } else {
            System.out.println("It is a good deal");
        }
    }
}
