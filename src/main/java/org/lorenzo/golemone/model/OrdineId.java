package org.lorenzo.golemone.model;

import java.io.Serializable;
import java.util.Objects;
import jakarta.persistence.Embeddable;

@Embeddable
public class OrdineId implements Serializable {

    private Long ordineNumero;
    private Long prodottoid;

    public OrdineId() {
    }

    public OrdineId(Long ordineNumero, Long prodottoid) {
        this.ordineNumero = ordineNumero;
        this.prodottoid = prodottoid;
    }

    public Long getOrdineNumero() {
        return ordineNumero;
    }

    public void setOrdineNumero(Long ordineNumero) {
        this.ordineNumero = ordineNumero;
    }

    public Long getProdottoid() {
        return prodottoid;
    }

    public void setProdottoid(Long prodottoid) {
        this.prodottoid = prodottoid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdineId ordineId = (OrdineId) o;
        return Objects.equals(ordineNumero, ordineId.ordineNumero) &&
                Objects.equals(prodottoid, ordineId.prodottoid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordineNumero, prodottoid);
    }
}
