package init;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // reference type
        int[] arr2 = arr;

        arr2[0] = 100;
        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(arr[0]);
        System.out.println(arr2[0]);

        Product product = new Product();
        Product product1 = new Product("Laptop", 5000, true, 10);

        System.out.println(product.getName());

        // reference type
        product = product1;

        System.out.println(product.getName());

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setPhone("1234567890");
        individualCustomer.setFirstName("Ahmet");
        individualCustomer.setLastName("Yiğit");

        CorparateCustomer corparateCustomer = new CorparateCustomer();
        corparateCustomer.setId(2);
        corparateCustomer.setCustomerNumber("54321");
        corparateCustomer.setPhone("0987654321");
        corparateCustomer.setCompanyName("Kodlama.io");
        corparateCustomer.setTaxNumber("1234567890");

        Customer[] customers = {individualCustomer, corparateCustomer};
        for (Customer customer : customers) {
            System.out.println(customer.getPhone());
            // casting but it gives error when customer is not an instance of init.IndividualCustomer
            // System.out.println( ((init.IndividualCustomer) customer).getFirstName() );
        }
    }
}