package eu.singledev.cashcard;

import org.springframework.data.annotation.Id;

/**
 * @author Mike Kostenko on 08/07/2024
 */
record CashCard(@Id Long id, Double amount, String owner) {
}
