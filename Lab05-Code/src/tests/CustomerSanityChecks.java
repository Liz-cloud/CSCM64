package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import customer.Customer;

public class CustomerSanityChecks {

    // Adapter class for testing Customer's sanity checks
    private static class SanityCheckTestAdapter extends Customer {
        public SanityCheckTestAdapter(String name, int age, boolean premiumMember, boolean pensioner) {
            super(name, "", "", "", age, 0, false, false, false);
        }
    }

    @Test
    public void testNegativeAge() {
        assertThrows(IllegalArgumentException.class, () ->
                new SanityCheckTestAdapter("John Doe", -5, false, false));
    }

    @Test
    public void testAgeGreaterThan150() {
        assertThrows(IllegalArgumentException.class, () ->
                new SanityCheckTestAdapter("Jane Doe", 160, false, false));
    }
 

    @Test
    public void testUnderagePremiumMember() {
        assertThrows(IllegalArgumentException.class, () ->
                new SanityCheckTestAdapter("Bob Smith", 16, true, false));
    }

    @Test
    public void testUnderagePensioner() {
        assertThrows(IllegalArgumentException.class, () ->
                new SanityCheckTestAdapter("Alice Johnson", 60, false, true));
    }

    @Test
    public void testInvalidName() {
        assertThrows(IllegalArgumentException.class, () ->
                new SanityCheckTestAdapter("Philip Zoidberg", 25, false, false));
    }
}
