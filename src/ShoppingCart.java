public class ShoppingCart   {
    protected Product listProduct[];
    protected int productCount ;

    protected ShoppingCart(){
        listProduct = new Product[20];
        productCount = 0;
    }
    public void addToCartProcess(Product product){
        this.listProduct[productCount] = product;
        this.productCount++;
    }
    public double calculateTotal(){
        double total = 0;
        for ( int i = 0 ; i < productCount; i++){
            total+= listProduct[i].getPrice();
        }
        System.out.println("Total Harga : ");
        return 0;
    }
    public int displayAllProduct(){
        return productCount;
    }
    public void resetShopingCart(){
        listProduct = new Product[20];
        productCount = 0;
    }
    }

