package DependencyInjectionPattern;

public class Product {
    private String name;//商品名称
    private Integer price;//商品价格
    private Integer num;//商品数量

    public Product(String name,Integer price,Integer num)
    {
        this.name=name;
        this.num=num;
        this.price=price;
    }

    public String getName(){
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
