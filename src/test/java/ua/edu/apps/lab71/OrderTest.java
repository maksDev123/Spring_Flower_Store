package ua.edu.apps.lab71;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ua.edu.apps.lab71.delivery.DHLDeliveryStrategy;
import ua.edu.apps.lab71.item.Flower;
import ua.edu.apps.lab71.item.FlowerBucket;
import ua.edu.apps.lab71.item.FlowerColor;
import ua.edu.apps.lab71.item.FlowerPack;
import ua.edu.apps.lab71.item.Rose;
import ua.edu.apps.lab71.item.Tulip;
import ua.edu.apps.lab71.order.Order;
import ua.edu.apps.lab71.payment.CreditCardPaymentStrategy;
import ua.edu.apps.lab71.payment.PayPalPaymentStrategy;
import ua.edu.apps.lab71.store.Item;

public class OrderTest {
    @Test
    public void testTulip() {
        Item rose = new Rose(FlowerColor.BLUE, 10.0, 10.0);
        Item tulip = new Tulip(FlowerColor.RED, 11.0, 5.0);

        Item pack = new FlowerPack((Flower) rose, 3);
        Item pack1 = new FlowerPack((Flower) tulip, 5);

        List<FlowerPack> packs = new ArrayList<FlowerPack>();
        packs.add((FlowerPack) pack);
        packs.add((FlowerPack) pack1);

        Item buckethItems = new FlowerBucket(packs);

        LinkedList<Item> items = new LinkedList<Item>();
        items.add(rose);
        items.add(tulip);
        items.add(pack1);
        items.add(pack);
        items.add(buckethItems);

        Order order = new Order(items);
        Assertions.assertEquals(order.calculatePrice(), 125.0);

        order.setDeliveryStrategy(new DHLDeliveryStrategy());
        order.setPaymentStrategy(new PayPalPaymentStrategy());

        Assertions.assertTrue(order.proccessOrder().contains("paypal"));

        order.setPaymentStrategy(new CreditCardPaymentStrategy());
        Assertions.assertTrue(order.proccessOrder().contains("cpay"));
    }
}
