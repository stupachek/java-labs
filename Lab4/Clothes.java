package Lab4;

//C11 = 5 Визначити клас одяг, який складається як мінімум з 5-и полів.
public class Clothes {
    private Sex sex;
    private Size size;
    private int price;
    private String color;
    private String type;

    public Clothes(Sex sex, Size size, int price, String color, String type){
        this.sex = sex;
        this.size = size;
        this.price = price;
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "sex=" + sex +
                ", size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public Size getSize() {
        return size;
    }
}

enum Sex {
    MALE,
    FEMALE
}
enum Size {
    XS,
    S,
    M,
    L,
    XL,
    XXL
}