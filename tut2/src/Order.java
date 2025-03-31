package src;

public class Order {
    public int id;
    public Customer customer;
    public Product[] products;
    public int[] quantity;
    public String orderDate;
    public String status;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int[] getQuantity() {
        return quantity;
    }

    public void setQuantity(int[] quantity) {
        this.quantity = quantity;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void calculateTotal(){
        int total = 0;
        for (int i = 0; i< product.size(); i++) {
            total += products.get(i).getPrice() * quantity.get(i);
        }
        for (customer.getIsLoyalCustomer()) {
            int discount = total % 10;
            total -= discount;
        }
        return total;
    }
        

    public void applyDiscount(){
        if (customer.getIsLoyalCustomer(){
            int discount = clculateTotal() % 10;
            total -= discount;
            

    } 
        return total;
    }
    

    public void displayDetails(){
        System.out.println("Order date:  " + orderDate);
        System.out.println("Customer:  " + customer);
        System.out.println("Products:   " + products);
        for (int i = 0; i < product.size(); i++){
            System.out.println(products.get(i).getProductName());
            System.out.println("amount:  " + quantity.get(i));
            System.out.println();
    
    }

        System.out.println("Total cost (with discount if avaliable):   " + calculateTotal());
        
}
