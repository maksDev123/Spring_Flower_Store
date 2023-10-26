package ua.edu.apps.lab71.order;

import java.util.LinkedList;

import ua.edu.apps.lab71.delivery.Delivery;
import ua.edu.apps.lab71.payment.Payment;
import ua.edu.apps.lab71.store.Item;

public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public Order(LinkedList<Item> items) {
        this.items = items;
    }

    public Order(LinkedList<Item> items, Payment payment, Delivery delivery) {
        this.items = items;
        this.payment = payment;
        this.delivery = delivery;
    }

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculatePrice() {
        double totalPrice = 0;

        for (Item item : this.items) {
            totalPrice += item.getPrice();
        }

        return totalPrice;
    }

    public String proccessOrder() {
        return this.payment.payment_redirect(this.calculatePrice());
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void addItem(Item item) {
        this.items.add(item);
    }
}
