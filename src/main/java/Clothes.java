public class Clothes {
    private String name;
    private String size;
    private double price;
    public Clothes(String name, String size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public String toString() {
        return "Clothes [name=" + name + ", size=" + size + ", price=" + price + "]";
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Clothes clothes = (Clothes) obj;
        if (Double.compare(clothes.price, price) != 0) return false;
        if (name != null ? !name.equals(clothes.name) : clothes.name != null) return false;
        return size != null ? size.equals(clothes.size) : clothes.size == null;
    }
}