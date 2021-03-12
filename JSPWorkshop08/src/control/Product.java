package control;

public class Product {
    String name;
    String id;
    int amount;
    public Product(){
        super();
    }
    public Product(String name, String id, int amount){
        super();
        this.name = name;
        this.id = id;
        this.amount = amount;

    }

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public int getAmount() {
        return amount;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
