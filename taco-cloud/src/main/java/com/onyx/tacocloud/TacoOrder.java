package com.onyx.tacocloud;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class TacoOrder {

    private String deliveryName;       // Инфо по доставке
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;            // Инфо по оплате
    private String ccExpiration;
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();   // Состав заказа

    public void addtaco(Taco taco) {
        this.tacos.add(taco);
    }
}