package com.blueyonder.exercise;

import java.time.LocalDate;
import java.util.List;


public class Order {

        private Integer id;
        private String status;
        private LocalDate orderDate;
        private LocalDate deliveryDate;
        private List<Product> products;
        private Integer customerId;

        public Order(Integer id, LocalDate orderDate, LocalDate deliveryDate,String status, Integer customerId) {
                this.id = id;
                this.status = status;
                this.orderDate = orderDate;
                this.deliveryDate = deliveryDate;
                this.customerId = customerId;
        }

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getStatus() {
                return status;
        }

        public void setStatus(String status) {
                this.status = status;
        }

        public LocalDate getOrderDate() {
                return orderDate;
        }

        public void setOrderDate(LocalDate orderDate) {
                this.orderDate = orderDate;
        }

        public LocalDate getDeliveryDate() {
                return deliveryDate;
        }

        public void setDeliveryDate(LocalDate deliveryDate) {
                this.deliveryDate = deliveryDate;
        }

        public List<Product> getProducts() {
                return products;
        }

        public void setProducts(List<Product> products) {
                this.products = products;
        }

        public Integer getCustomerId() {
                return customerId;
        }

        public void setCustomerId(Integer customerId) {
                this.customerId = customerId;
        }

        @Override
        public String toString() {
                return "Order{" +
                        "id=" + id +
                        ", status='" + status + '\'' +
                        ", orderDate=" + orderDate +
                        ", deliveryDate=" + deliveryDate +
                        ", products=" + products +
                        ", customerId=" + customerId +
                        '}';
        }
}

