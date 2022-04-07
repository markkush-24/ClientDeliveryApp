package com.kushnirmark.spring.rest.entity;


public class ClientOrder {

    private int id;

    private String nameClient;

    private String numberPhone;

    private String status;



    public ClientOrder(int id, String nameClient, String numberPhone, String status) {
        this.id = id;
        this.nameClient = nameClient;
        this.numberPhone = numberPhone;
        this.status = status;
    }

    public ClientOrder(String nameClient, String numberPhone, String status) {
        this.nameClient = nameClient;
        this.numberPhone = numberPhone;
        this.status = status;
    }

    public ClientOrder(String nameClient, String numberPhone) {
        this.nameClient = nameClient;
        this.numberPhone = numberPhone;
    }

    public ClientOrder() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ClientOrder{" +
                "id=" + id +
                ", nameClient='" + nameClient + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
