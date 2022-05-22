public class Programme {
    public static void main(String[] args) {

        // Type|Class nomObjet = new Constructor()
        Customer customer = new Customer();
        Customer customer1 = new Customer
                (1L,"sanaa","snaa@hotmail.com","082782",22);
        Customer customer2 = new Customer(2L,"ali","09202",30);
        customer2.setEmail("ali@hotmail.cm");
        Customer customer3 = new Customer();

        System.out.println(Customer.getCount());
        int res = Customer.compareCustomer(customer1, customer2);
        if(res == 1){
            customer1.display();
        }else if(res == 2){
            customer2.display();
        }else {
            System.out.println("Draw");
        }
    }
}
