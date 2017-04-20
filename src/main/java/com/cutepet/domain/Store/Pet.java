package com.cutepet.domain.Store;

import com.cutepet.domain.Common.PaymentMethod;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Store_Pet")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long storeId;
    private String name;
    private String color;
    @ElementCollection
    private List<PaymentMethod> paymentMethods;

    public Pet() {
    }

    public Pet(long storeId, String name, String color, List<PaymentMethod> paymentMethods) {
        this.storeId = storeId;
        this.name = name;
        this.color = color;
        this.paymentMethods = paymentMethods;
    }

    public long getId() {
        return id;
    }

    public long getStoreId() {
        return storeId;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }
}
