package com.borymskyi.solid.bad2;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class BadBank {
    private Map<String, BadAccount> cards;

    public BadBank() {
        this.cards = Map.of(
                "4444-1111", new BadAccount(),
                "2222-3333", new BadAccount(),
                "1111-5555", new BadAccount());
    }

    public void createSomeAccountBalance() {
        for (Map.Entry<String, BadAccount> entry : cards.entrySet()) {
            switch (entry.getKey()) {
                case "4444-1111" -> entry.getValue().setBalance(new BigDecimal("2500.00"));
                case "2222-3333" -> entry.getValue().setBalance(new BigDecimal("500.00"));
                case "1111-5555" -> entry.getValue().setBalance(new BigDecimal("30000.00"));
            }
        }
    }

    public Map<String, BadAccount> getCards() {
        return cards;
    }

    public void setCards(Map<String, BadAccount> cards) {
        this.cards = cards;
    }
}
