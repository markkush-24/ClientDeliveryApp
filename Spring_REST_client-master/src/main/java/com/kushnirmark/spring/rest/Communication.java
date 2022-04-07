package com.kushnirmark.spring.rest;

import com.kushnirmark.spring.rest.entity.ClientOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@Component
public class Communication {

    @Autowired
    private RestTemplate restTemplate;

    private final String URL = "http://localhost:8080/OrderService/api/clientOrder";

    public List<ClientOrder> getAllOrders() {
        ResponseEntity<List<ClientOrder>> responseEntity = restTemplate.exchange(URL, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<ClientOrder>>() {});
        List<ClientOrder> clientOrders = responseEntity.getBody();
        return clientOrders;
    }

    public ClientOrder getOrder(int id) {
        ClientOrder clientOrder  = restTemplate.getForObject(URL + "/" + id,ClientOrder.class);
        return clientOrder;
    }

    public void createOrder(ClientOrder clientOrder) {
        int id = clientOrder.getId();
        if(id == 0){
            ResponseEntity<String>responseEntity = restTemplate.postForEntity(URL,clientOrder,String.class);
            System.out.println("New order was added to DB");
            System.out.println(responseEntity.getBody());
        } else {
            restTemplate.put(URL,clientOrder);
            System.out.println("ClientOrder with ID " + id + " was updated");
        }

    }

    public void deleteOrder(int id) {
        restTemplate.delete(URL + "/" + id);
        System.out.println("ClientOrder with ID " + id + " was deleted from DB");

    }
}
