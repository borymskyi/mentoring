package com.borymskyi.solid;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Order {
    private Long numberOrder;
    private Car car;
    private Client client;

    public Order(Long numberOrder, Car car, Client client) {
        this.numberOrder = numberOrder;
        this.car = car;
        this.client = client;
    }

    public Long getNumberOrder() {
        return numberOrder;
    }

    public void setNumberOrder(Long numberOrder) {
        this.numberOrder = numberOrder;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
