package com.borymskyi.solid.good2;

import com.borymskyi.solid.bad2.BadAccount;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Bank {
    private Map<String, Account> cards;

    public Bank() {
        this.cards = Map.of(
                "4444-1111", new Account(),
                "2222-3333", new Account(),
                "1111-5555", new Account());
    }

    public void createSomeAccountBalance() {
        for (Map.Entry<String, Account> entry : cards.entrySet()) {
            switch (entry.getKey()) {
                case "4444-1111" -> entry.getValue().setBalance(new BigDecimal("2500.00"));
                case "2222-3333" -> entry.getValue().setBalance(new BigDecimal("500.00"));
                case "1111-5555" -> entry.getValue().setBalance(new BigDecimal("30000.00"));
            }
        }
    }

    public Map<String, Account> getCards() {
        return cards;
    }

    public void setCards(Map<String, Account> cards) {
        this.cards = cards;
    }
}
