package web.model;

public class Car {

    private String model;
    private int yearOfIssue;
    private int price;

    public Car (){
    }

    public Car(String model, int yearOfIssue, int price) {
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.price = price;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car " + "model: '" + model + '\'' + ", yearOfIssue: " + yearOfIssue + ", price: " + price;
    }
}
