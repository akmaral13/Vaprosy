public class Mashina {
    private int yer;
    private  String model;
    private  int price;
    private  String color;

    public Mashina(int yer, String model, int price, String color) {
        this.yer = yer;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getYer() {
        return yer;
    }

    public void setYer(int yer) {
        this.yer = yer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mashina{" +
                "yer=" + yer +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
