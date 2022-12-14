package DependencyInjectionPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VendingMachine {
    List<Product> ProductList=new ArrayList<>();
    Iterator<Product> iterator=ProductList.iterator();

    public void outPut()//输出商品
    {
        this.iterator = ProductList.iterator();
        while(iterator.hasNext())
        {
            Product product=iterator.next();
            System.out.println("商品名称："+product.getName()+"  价格："+
                    product.getPrice()+"    剩余数量："+product.getNum());
        }
    }

    public void addProduct(Product product)//添加商品
    {
        ProductList.add(product);
    }

    public Product selectProduct(String name) //选择商品
    {
        boolean found = false;
        this.iterator = ProductList.iterator();
        Product product = null;
        while (iterator.hasNext()) {
            product = iterator.next();
            if (product.getName().equals(name))
                break;
        }
        return product;
    }

    public void removeProduct()//下架商品
    {
        iterator.remove();
    }
}
