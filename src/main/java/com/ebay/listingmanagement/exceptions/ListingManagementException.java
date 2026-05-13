package com.ebay.listingmanagement.exceptions;

/**
 * Base exception for Account Management SDK errors.
 */
public class ListingManagementException extends RuntimeException {
    public ListingManagementException(String message) {
        super(message);
    }

    public ListingManagementException(String message, Throwable cause) {
        super(message, cause);
    }
}
