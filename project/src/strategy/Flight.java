package strategy;

public class Flight {
    private String destination;
    private double rating;
    private int price;
    private String  aerianCompany;

    public Flight(String destination, double rating, int price, String aerianCompany) {
        this.destination = destination;
        this.rating = rating;
        this.price = price;
        this.aerianCompany = aerianCompany;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAerianCompany() {
        return aerianCompany;
    }

    public void setAerianCompany(String aerianCompany) {
        this.aerianCompany = aerianCompany;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "destination='" + destination + '\'' +
                ", rating=" + rating +
                ", price=" + price +
                ", aerianCompany='" + aerianCompany + '\'' +
                '}';
    }
}
