package Model;

public class Room {
    private  String type;
    private  String level;
    private double price;
    private  String id;

    public Room() {
    }

    public Room(String type, String level, double price, String id) {
        this.type = type;
        this.level = level;
        this.price = price;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Room{" +
                "type='" + type + '\'' +
                ", level='" + level + '\'' +
                ", price=" + price +
                '}';
    }
}
