package task3.menu;


public class MenuItem implements Comparable<MenuItem>{
    private long id;
    private String type;
    private String name;
    private double price;
    private double preperationTime;



    public MenuItem(String type, String name, double price, double preperationTime) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.preperationTime = preperationTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPreperationTime() {
        return preperationTime;
    }

    public void setPreperationTime(double preperationTime) {
        this.preperationTime = preperationTime;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", preperationTime=" + preperationTime +
                '}';
    }

    @Override
    public int compareTo(MenuItem o) {
        return (int)(this.price - o.getPrice());
    }
}
