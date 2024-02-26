package Sales;

public class DiscountSale extends Sale{

    private double discountRate; //discount rate and it cannot be a negative value

    public DiscountSale() {
        super();
        this.discountRate = 0;
    }

    public DiscountSale(String name, double price, double dc) throws Exception{
        super(name, price);
        this.discountRate = dc;
    }

    public DiscountSale(DiscountSale dsObject){
        super(dsObject);
        this.discountRate = dsObject.discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) throws Exception{

        if(discountRate < 0 ){
            throw new Exception("discount rate cannot be a negative value");
        }
        else {
            this.discountRate = discountRate;
        }
    }

    /**
     * how to compute the total price after discount rate apply to the original price
     * price - price * (discountRate/100)
     */
    public double totalPrice(){
        double newPrice = getPrice() - getPrice() * (discountRate /100);
        return newPrice;
    }


    public String toString(){
        return String.format("The %s's discount rate you will get is %.1f, " +
                "its original price is %.2f and your sales price is %.2f"
                ,getName(),getDiscountRate(), getPrice(),totalPrice());
    }



}

