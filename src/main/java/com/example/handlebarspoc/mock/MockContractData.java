package com.example.handlebarspoc.mock;

import com.example.handlebarspoc.models.Owner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MockContractData {

    public static final Map<String, Object> PARAMS = new HashMap<>();

    static {
        PARAMS.put("contractId", "123456");
        PARAMS.put("salesPartner", "John Doe");
        PARAMS.put("address1", "456 Oak St");
        PARAMS.put("address2", "Apt 7A");
        PARAMS.put("emailAddress", "john.doe@example.com");
        PARAMS.put("address", "789 Elm St");
        PARAMS.put("streetAddress", "1234 Pine Ave");
        PARAMS.put("city", "Springfield");
        PARAMS.put("state", "IL");
        PARAMS.put("zip", "62701");
        PARAMS.put("zipCode", "62702");
        PARAMS.put("mailingAddress", "456 Mailing Rd");
        PARAMS.put("city2", "Chicago");
        PARAMS.put("state2", "IL");
        PARAMS.put("zip2", "60601");
        PARAMS.put("cityState", "Springfield, IL");
        PARAMS.put("cityState2", "Chicago, IL");
        PARAMS.put("fullAddress", "1234 Oak St, Springfield, IL 62701");
        PARAMS.put("phoneLand1", "+1234567890");
        PARAMS.put("phoneLand2", "+1987654321");
        PARAMS.put("firstName", "John");
        PARAMS.put("lastName", "Doe");
        PARAMS.put("recipientName", "Jane Doe");
        PARAMS.put("recipientEmail", "jane.doe@example.com");
        PARAMS.put("primaryContactName", "John Doe");
        PARAMS.put("primaryFaxNumber", "No fax available");
        PARAMS.put("primaryEmail", "john.doe@example.com");
        // Create owners as objects
        List<Owner> owners = List.of(
                new Owner(1, "John", "Doe", "123 Main St", "City A", "CA", "90001"),
                new Owner(2, "Jane", "Smith", "456 Elm St", "City B", "NY", "10001"),
                new Owner(3, "Alice", "Johnson", "789 Oak St", "City C", "TX", "75001")
        );
        PARAMS.put("owners", owners);
    }
}