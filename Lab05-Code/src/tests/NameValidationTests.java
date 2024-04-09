package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import customer.Customer;

public class NameValidationTests {

	// Adapter class for testing Customer's hasValidName method
    private static class NameValidationTestAdapter extends Customer {
        public NameValidationTestAdapter(String name) {
            super(name, "", "", "",0, 0, false, false, false);
        }
    }

	// @Test
	// public void TODO_WriteTests ()
	// {
	// 	assertEquals(true, false, "TODO: write tests for the function Customer.hasValidName().");
	// }

    @Test
    public void testValidName() {
        // Case 1: Valid name with two words, not containing "Zoidberg"
        Customer c1 = new NameValidationTestAdapter("John Doe");
        assertEquals(true, c1.hasValidName(), "Valid name should return true");
    }

    @Test
    public void testInvalidNameContainsZoidberg() {
        // Case 2: Valid name with two words, containing "Zoidberg" (ignoring case)
        Customer c2 = new NameValidationTestAdapter("Philip Zoidberg");
        assertEquals(false, c2.hasValidName(), "Name containing Zoidberg should return false");
    }

    @Test
    public void testInvalidNameOneWord() {
        // Case 3: Invalid name with one word
        Customer c3 = new NameValidationTestAdapter("Alice");
        assertEquals(false, c3.hasValidName(), "Name with one word should return false");
    }

    @Test
    public void testInvalidNameThreeWords() {
        // Case 4: Invalid name with three words
        Customer c4 = new NameValidationTestAdapter("Bob David Smith");
        assertEquals(false, c4.hasValidName(), "Name with three words should return false");
    }
}
