package com.blueyonder.exercise;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
public class MainApp {
    public static void main(String[] args) {
        Customer cust1 = new Customer(1, "Stefan Walker", 1);
        Customer cust2 = new Customer(2, "Daija Von", 1);
        Customer cust3 = new Customer(3, "Ariane Rodriguez", 1);
        Customer cust4 = new Customer(4, "Marques Nikolaus", 2);
        Customer cust5 = new Customer(5, "Rachelle Greenfelder", 0);
        Customer cust6 = new Customer(6, "Larissa White", 2);
        Customer cust7 = new Customer(7, "Fae Heidenreich", 1);
        Customer cust8 = new Customer(8, "Dino Will", 2);
        Customer cust9 = new Customer(9, "Eloy Stroman", 1);
        Customer cust10 = new Customer(10, "Brisa O Connell", 1);

        List<Customer> customers = new ArrayList<Customer>();
        customers.add(cust1);
        customers.add(cust2);
        customers.add(cust3);
        customers.add(cust4);
        customers.add(cust5);
        customers.add(cust6);
        customers.add(cust7);
        customers.add(cust8);
        customers.add(cust9);
        customers.add(cust10);

        Product prod1 = new Product(1, "omnis quod consequatur", "Games", 184.83);
        Product prod2 = new Product(2, "vel libero suscipit", "Toys", 12.66);
        Product prod3 = new Product(3, "non nemo iure", "Grocery", 498.02);
        Product prod4 = new Product(4, "voluptatem voluptas aspernatur", "Toys", 536.80);
        Product prod5 = new Product(5, "animi cum rem", "Games", 458.20);
        Product prod6 = new Product(6, "dolorem porro debitis", "Toys", 146.52);
        Product prod7 = new Product(7, "aspernatur rerum qui", "Books", 656.42);
        Product prod8 = new Product(8, "deleniti earum et", "Baby", 41.46);
        Product prod9 = new Product(9, "voluptas ut quidem", "Books", 697.57);
        Product prod10 = new Product(10, "eos sed debitis", "Baby", 366.90);
        Product prod11 = new Product(11, "laudantium sit nihil", "Toys", 95.50);
        Product prod12 = new Product(12, "ut perferendis corporis", "Grocery", 302.19);
        Product prod13 = new Product(13, "sint voluptatem ut", "Toys", 295.37);
        Product prod14 = new Product(14, "quos sunt ipsam", "Grocery", 534.64);
        Product prod15 = new Product(15, "qui illo error", "Baby", 623.58);
        Product prod16 = new Product(16, "aut ex ducimus", "Books", 551.39);
        Product prod17 = new Product(17, "accusamus repellendus minus", "Books", 240.58);
        Product prod18 = new Product(18, "aut accusamus quia", "Baby", 881.38);
        Product prod19 = new Product(19, "doloremque incidunt sed", "Games", 988.49);
        Product prod20 = new Product(20, "libero omnis velit", "Baby", 177.61);
        Product prod21 = new Product(21, "consectetur cupiditate sunt", "Toys", 95.46);
        Product prod22 = new Product(22, "itaque ea qui", "Baby", 677.78);
        Product prod23 = new Product(23, "non et nulla", "Grocery", 70.49);
        Product prod24 = new Product(24, "veniam consequatur et", "Books", 893.44);
        Product prod25 = new Product(25, "magnam adipisci voluptate", "Grocery", 366.13);
        Product prod26 = new Product(26, "reiciendis consequuntur placeat", "Toys", 359.27);
        Product prod27 = new Product(27, "dolores ipsum sit", "Toys", 786.99);
        Product prod28 = new Product(28, "ut hic tempore", "Toys", 316.09);
        Product prod29 = new Product(29, "quas quis deserunt", "Toys", 772.78);
        Product prod30 = new Product(30, "excepturi nesciunt accusantium", "Toys", 911.46);

        List<Product> products = new ArrayList<Product>();
        products.add(prod1);
        products.add(prod2);
        products.add(prod3);
        products.add(prod4);
        products.add(prod5);
        products.add(prod6);
        products.add(prod7);
        products.add(prod8);
        products.add(prod9);
        products.add(prod10);
        products.add(prod11);
        products.add(prod12);
        products.add(prod13);
        products.add(prod14);
        products.add(prod15);
        products.add(prod16);
        products.add(prod17);
        products.add(prod18);
        products.add(prod19);
        products.add(prod20);
        products.add(prod21);
        products.add(prod22);
        products.add(prod23);
        products.add(prod24);
        products.add(prod25);
        products.add(prod26);
        products.add(prod27);
        products.add(prod28);
        products.add(prod29);
        products.add(prod30);

        Order order1 = new Order(1, LocalDate.parse("2021-02-28"), LocalDate.parse("2021-03-08"), "new", 5);
        Order order3 = new Order(3, LocalDate.parse("2021-04-10"), LocalDate.parse("2021-04-18"), "DELIVERED", 5);
        Order order2 = new Order(2, LocalDate.parse("2021-02-28"), LocalDate.parse("2021-03-05"), "new", 3);
        Order order4 = new Order(4, LocalDate.parse("2021-03-22"), LocalDate.parse("2021-03-27"), "PENDING", 3);
        Order order5 = new Order(5, LocalDate.parse("2021-03-04"), LocalDate.parse("2021-03-12"), "new", 1);
        Order order6 = new Order(6, LocalDate.parse("2021-03-30"), LocalDate.parse("2021-04-07"), "DELIVERED", 9);
        Order order7 = new Order(7, LocalDate.parse("2021-03-05"), LocalDate.parse("2021-03-09"), "PENDING", 8);
        Order order8 = new Order(8, LocalDate.parse("2021-03-27"), LocalDate.parse("2021-04-05"), "new", 4);
        Order order9 = new Order(9, LocalDate.parse("2021-04-14"), LocalDate.parse("2021-04-18"), "new", 10);
        Order order10 = new Order(10,LocalDate.parse("2021-03-10"),LocalDate.parse( "2021-03-19"), "new", 8);
        Order order11 = new Order(11, LocalDate.parse("2021-04-01"), LocalDate.parse("2021-04-04"), "DELIVERED", 1);
        Order order12 = new Order(12, LocalDate.parse("2021-02-24"), LocalDate.parse("2021-02-28"), "PENDING", 5);
        Order order13 = new Order(13, LocalDate.parse("2021-03-15"), LocalDate.parse("2021-03-21"), "new", 5);
        Order order14 = new Order(14, LocalDate.parse("2021-03-30"), LocalDate.parse("2021-04-07"), "PENDING", 4);
        Order order15 = new Order(15, LocalDate.parse("2021-03-13"), LocalDate.parse("2021-03-14"), "DELIVERED", 5);
        Order order16 = new Order(16, LocalDate.parse("2021-03-13"), LocalDate.parse("2021-03-21"), "new", 1);
        Order order17 = new Order(17, LocalDate.parse("2021-03-31"), LocalDate.parse("2021-03-31"), "DELIVERED", 6);
        Order order18 = new Order(18, LocalDate.parse("2021-03-25"), LocalDate.parse("2021-03-31"), "PENDING", 9);
        Order order19 = new Order(19, LocalDate.parse("2021-02-28"), LocalDate.parse("2021-03-09"), "DELIVERED", 9);
        Order order20 = new Order(20, LocalDate.parse("2021-03-23"), LocalDate.parse("2021-03-30"), "new", 5);
        Order order21 = new Order(21, LocalDate.parse("2021-03-19"), LocalDate.parse("2021-03-24"), "DELIVERED", 9);
        Order order22 = new Order(22, LocalDate.parse("2021-02-27"), LocalDate.parse("2021-03-01"), "new", 5);
        Order order23 = new Order(23, LocalDate.parse("2021-04-19"), LocalDate.parse("2021-04-24"), "PENDING", 4);
        Order order24 = new Order(24, LocalDate.parse("2021-03-24"), LocalDate.parse("2021-03-24"), "DELIVERED", 1);
        Order order25 = new Order(25, LocalDate.parse("2021-03-03"), LocalDate.parse("2021-03-10"), "new", 1);
        Order order26 = new Order(26, LocalDate.parse("2021-03-17"), LocalDate.parse("2021-03-26"), "new", 10);
        Order order27= new Order(27, LocalDate.parse("2021-03-20"), LocalDate.parse("2021-03-25"), "new", 1);
        Order order28 = new Order(28,LocalDate.parse("2021-04-09"), LocalDate.parse("2021-04-16"), "DELIVERED", 2);
        Order order29 = new Order(29, LocalDate.parse("2021-04-06"), LocalDate.parse("2021-04-08"), "PENDING", 1);
        Order order30 = new Order(30, LocalDate.parse("2021-04-19"), LocalDate.parse("2021-04-20"), "DELIVERED", 1);
        Order order31 = new Order(31, LocalDate.parse("2021-03-03"), LocalDate.parse("2021-03-04"), "new", 3);
        Order order32 = new Order(32, LocalDate.parse("2021-03-15"), LocalDate.parse("2021-03-24"), "DELIVERED", 2);
        Order order33 = new Order(33, LocalDate.parse("2021-04-18"), LocalDate.parse("2021-04-24"), "PENDING", 1);
        Order order34 = new Order(34, LocalDate.parse("2021-03-28"), LocalDate.parse("2021-03-28"), "new", 6);
        Order order35 = new Order(35, LocalDate.parse("2021-03-15"), LocalDate.parse("2021-03-17"), "new", 1);
        Order order36 = new Order(36, LocalDate.parse("2021-03-04"), LocalDate.parse("2021-03-08"), "DELIVERED", 2);
        Order order37 = new Order(37, LocalDate.parse("2021-03-18"), LocalDate.parse("2021-03-25"), "new", 8);
        Order order38 = new Order(38, LocalDate.parse("2021-04-11"), LocalDate.parse("2021-04-20"), "new", 8);
        Order order39 = new Order(39, LocalDate.parse("2021-04-12"), LocalDate.parse("2021-04-17"), "new", 9);
        Order order40 = new Order(40, LocalDate.parse("2021-03-12"), LocalDate.parse("2021-03-12"), "PENDING", 3);
        Order order41 = new Order(41, LocalDate.parse("2021-02-24"), LocalDate.parse("2021-02-26"), "new", 5);
        Order order42 = new Order(42, LocalDate.parse("2021-04-08"), LocalDate.parse("2021-04-14"), "DELIVERED", 9);
        Order order43 = new Order(43, LocalDate.parse("2021-03-03"), LocalDate.parse("2021-03-11"), "new", 3);
        Order order44 = new Order(44, LocalDate.parse("2021-03-12"), LocalDate.parse("2021-03-14"), "DELIVERED", 4);
        Order order45 = new Order(45, LocalDate.parse("2021-04-01"), LocalDate.parse("2021-04-06"), "DELIVERED", 1);
        Order order46 = new Order(46, LocalDate.parse("2021-03-16"), LocalDate.parse("2021-03-22"), "new", 10);
        Order order47 = new Order(47, LocalDate.parse("2021-04-07"), LocalDate.parse("2021-04-12"), "PENDING", 2);
        Order order48 = new Order(48, LocalDate.parse("2021-04-05"), LocalDate.parse("2021-04-06"), "new", 2);
        Order order49 = new Order(49, LocalDate.parse("2021-04-10"), LocalDate.parse("2021-04-13"), "new", 7);
        Order order50 = new Order(50, LocalDate.parse("2021-03-18"), LocalDate.parse("2021-03-21"), "new", 9);

        List<Order> orders = new ArrayList<Order>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);
        orders.add(order6);
        orders.add(order7);
        orders.add(order8);
        orders.add(order9);
        orders.add(order10);
        orders.add(order11);
        orders.add(order12);
        orders.add(order13);
        orders.add(order14);
        orders.add(order15);
        orders.add(order16);
        orders.add(order17);
        orders.add(order18);
        orders.add(order19);
        orders.add(order20);
        orders.add(order21);
        orders.add(order22);
        orders.add(order23);
        orders.add(order24);
        orders.add(order25);
        orders.add(order26);
        orders.add(order27);
        orders.add(order28);
        orders.add(order29);
        orders.add(order30);
        orders.add(order31);
        orders.add(order32);
        orders.add(order33);
        orders.add(order34);
        orders.add(order35);
        orders.add(order36);
        orders.add(order37);
        orders.add(order38);
        orders.add(order39);
        orders.add(order40);
        orders.add(order41);
        orders.add(order42);
        orders.add(order43);
        orders.add(order44);
        orders.add(order45);
        orders.add(order46);
        orders.add(order47);
        orders.add(order48);
        orders.add(order49);
        orders.add(order50);
    }
}