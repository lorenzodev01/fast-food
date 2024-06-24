package org.lorenzo.golemone.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Entity;


@Setter
@Getter
@Entity
public class Ordine {


    @EmbeddedId
    private OrdineId id;
    private int quantity;

    public Ordine() {
    }

    public OrdineId getId() {
        return id;
    }

    public void setId(OrdineId id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
