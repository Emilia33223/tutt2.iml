package src;


public class ComputerStore {
    public Product[] products;
    public Customer[] customers;
    public Order[] orders;
    public int productCount;
    public int customerCount;
    public int orderCount;

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public int getCustomerCount() {
        return customerCount;
    }

    public void setCustomerCount(int customerCount) {
        this.customerCount = customerCount;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public void addProduct(Product product){
        this.productsInStore.add(products);
        productCount = productsInStore.size();
        

    }

    public void addCustomer(Customer customer){
        this.customers.add(customer);
        
    }
    public Order createOrder(Customer customer, Product[] products, int[] quantities){
        

        return null;
    }

    public void updateStockAfterOrder(Order order){
        boolean result = true;
        int counter = 0;
        for (Product Product :order.getProducts()) {
            int id = product.getId();
            for (Product productInStore : productsInStore) {
                if (productInStore.getId() == Id) {
                    productInStore.setQuantityInStock(productInStore.getQuantityInStock();
                    counter++;
                
            }
        }
    }
        return result;
        
    }
    public void changeOrderStatus(int orderCount, String newStatus){
        for (Order order : orders) {
            if (order.orderCount() == orderCount) {
                order.setStatus("complete");
            }
        }

    }

    public void displayProductsInCategory(String category){
        

    }

    public void displayCustomerOrders(int customerCount){
        System.out.println("Customers Order  " + customerCount
        

    }


}
