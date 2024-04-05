package francescoandrisani.u5w1d4.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Tavolo {
    private int number;
    private int maxCovers;
    private StatoTavolo isOccupied;
    private double price;

    public void print() {
        System.out.println("numero tavolo--> " + number);
        System.out.println("numero massimo coperti--> " + maxCovers);
        System.out.println("occupato/libero--> " + isOccupied);
    }
}

