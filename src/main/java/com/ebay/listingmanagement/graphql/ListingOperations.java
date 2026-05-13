package com.ebay.listingmanagement.graphql;

/**
 * GraphQL query and mutation constants for Listing Management API.
 */
public final class ListingOperations {

    public static final String ITEM_BIDDING_ACTIVITY = """
        query ItemBiddingActivity($input: ItemBiddingActivityInput!) {
            itemBiddingActivity(input: $input) {
                itemBiddingActivity {
                    activeBidHistoryRecords {
                        paginationOutput { previousCursor nextCursor }
                        bidHistoryRecords {
                            bidAmount { original { value currency } }
                            bidder { username userId }
                        }
                    }
                    cancelledBidHistoryRecords {
                        paginationOutput { previousCursor nextCursor }
                        bidHistoryRecords {
                            bidAmount { original { value currency } }
                            bidder { username userId }
                        }
                    }
                    retractedBidHistoryRecords {
                        paginationOutput { previousCursor nextCursor }
                        bidHistoryRecords {
                            bidAmount { original { value currency } }
                        }
                    }
                    leadingBid {
                        buyerBiddingSummary {
                            bidsWithSellerPercentage
                            retractedBidCount
                            totalBidCount
                            uniqueListingCategoryBidCount
                            uniqueSellerBidCount
                            itemBids { bidCount mostRecentBidAt }
                        }
                        bidder { username userId }
                        bidAmount {
                            original { value currency }
                            converted { value currency }
                        }
                        bidMetadata {
                            ... on ActiveBidMetadata {
                                placedAt
                                isHighestBid
                            }
                        }
                    }
                }
            }
        }
        """;

    public static final String SELLER_LISTINGS = """
        query SellerListings($input: SellerListingsInput!) {
            sellerListings(input: $input) {
                listings {
                    ... on ListingSuccess {
                        listingId
                        listing {
                            listingId marketplace
                            sellerProduct { title }
                            listingTerms {
                                listingFormat
                                lifecycleTerms {
                                    listingDurationInDays
                                    actualEndAt
                                    endListingReason
                                    createdAt
                                    listingStatus
                                    scheduledEndAt
                                    startAt
                                }
                                fulfillmentTerms {
                                    ... on FulfillmentTerms {
                                        inStorePickupSupported
                                        globalShippingSupported
                                        freeShippingAvailable
                                        packageSpecifications {
                                            irregularPackage
                                            listingPackageType
                                            listingUnitOfMeasure
                                            packageDimensions { length width height }
                                            packageWeight { majorUnit minorUnit }
                                        }
                                        shippingTerms {
                                            buyerResponsibleForShipping
                                            handlingTimeDuration
                                            includedShipToLocations { country }
                                        }
                                    }
                                    ... on BusinessPolicy { businessPolicyId }
                                }
                                returnTerms {
                                    ... on ReturnTerms {
                                        domesticReturnTerms {
                                            returnAccepted
                                            listingRefundMethod
                                            returnDuration
                                            returnShipmentInvoicee
                                        }
                                    }
                                    ... on BusinessPolicy { businessPolicyId }
                                }
                                paymentTerms {
                                    ... on PaymentTerms { immediatePay }
                                    ... on BusinessPolicy { businessPolicyId }
                                }
                                hideParticipation
                                visualEnhancements { boldTitle galleryPlus }
                                bestOfferTerms {
                                    acceptBestOffer
                                    autoAcceptThresholdAmount { original { currency value } }
                                    autoDeclineThresholdAmount { original { currency value } }
                                }
                                taxTerms {
                                    salesTaxApplicableToShipping
                                    vatRecognizedBusinessSeller
                                    salesTaxTableUsed
                                }
                                itemLocation { location country postalCode }
                                totalQuantityAvailable
                            }
                            ... on VariationListing {
                                listingVariations {
                                    imagesVaryByTrait {
                                        traitName
                                        traitValueImages {
                                            traitValue
                                            traitImages { ebayImageUrl externalImageUrl order }
                                        }
                                    }
                                    variationTraits { name values }
                                }
                            }
                        }
                    }
                }
            }
        }
        """;

    public static final String SELLER_LISTING_SEARCH = """
        query SellerListingSearch {
            sellerListingSearch {
                activeListings {
                    __typename
                    ... on SellerListings {
                        listings { listingId }
                    }
                    ... on SellerListingSearchInvalidInput {
                        errorCode errorMessage
                    }
                }
                endedListings {
                    __typename
                    ... on SellerListings {
                        listings { listingId }
                    }
                    ... on SellerListingSearchInvalidInput {
                        errorCode errorMessage
                    }
                }
                scheduledListings {
                    __typename
                    ... on SellerListings {
                        listings { listingId }
                    }
                    ... on SellerListingSearchInvalidInput {
                        errorCode errorMessage
                    }
                }
            }
        }
        """;

    public static final String BULK_UPDATE_INVENTORY = """
        mutation BulkUpdateInventory($input: BulkUpdateInventoryInput!) {
            bulkUpdateInventory(input: $input) {
                __typename
                ... on BulkUpdateInventorySuccess {
                    successes {
                        listingItemIdentifier { listingId sku }
                        warnings { warningCode warningMessage additionalInformation { name value } }
                    }
                }
                ... on BulkUpdateInventoryPartialFailure {
                    errorCode errorMessage
                    successes {
                        listingItemIdentifier { listingId sku }
                        warnings { warningCode warningMessage additionalInformation { name value } }
                    }
                    failures {
                        listingItemIdentifier { listingId sku }
                        violations { violationCode violationDescription inputPath additionalInformation { name value } }
                        warnings { warningCode warningMessage additionalInformation { name value } }
                    }
                }
                ... on BulkUpdateInventoryFailure {
                    errorCode errorMessage
                    failures {
                        listingItemIdentifier { listingId sku }
                        violations { violationCode violationDescription inputPath additionalInformation { name value } }
                        warnings { warningCode warningMessage additionalInformation { name value } }
                    }
                }
            }
        }
        """;

    public static final String CREATE_LISTING = """
        mutation CreateListing($input: CreateListingInput!) {
            createListing(input: $input) {
                __typename
                ... on CreateListingSuccess {
                    listing {
                        listingId sku marketplace
                        sellerProduct {
                            title description
                            aspects { name values }
                            images { ebayImageUrl }
                            categories { primaryCategory { id } }
                            itemCondition { itemConditionId }
                        }
                        items {
                            sku
                            itemTerms {
                                availability { quantityAvailable }
                                pricingTerms { fixedPrice { original { value currency } } }
                            }
                        }
                        listingTerms {
                            fulfillmentTerms {
                                ... on FulfillmentTerms {
                                    packageSpecifications {
                                        packageDimensions { length width height }
                                        packageWeight { majorUnit minorUnit }
                                        listingUnitOfMeasure
                                    }
                                    shippingTerms {
                                        handlingTimeDuration
                                        shippingServices { rank }
                                    }
                                }
                            }
                            paymentTerms { ... on PaymentTerms { immediatePay } }
                            listingFormat
                            lifecycleTerms { listingDurationInDays startAt }
                            bestOfferTerms {
                                acceptBestOffer
                                autoAcceptThresholdAmount { original { value currency } }
                                autoDeclineThresholdAmount { original { value currency } }
                            }
                            itemLocation { country postalCode location }
                        }
                    }
                    listingFees {
                        listingFeeType
                        feeAmount { value currency }
                        promotionalDiscount { value currency }
                    }
                    warnings { warningCode warningMessage additionalInformation { name value } }
                }
                ... on CreateListingValidationError {
                    errorCode errorMessage
                    violations { violationCode violationDescription inputPath additionalInformation { name value } }
                    warnings { warningCode warningMessage additionalInformation { name value } }
                }
                ... on CreateListingValidationSuccess {
                    listing {
                        listingId sku marketplace
                        sellerProduct {
                            title description
                            aspects { name values }
                            images { ebayImageUrl }
                            categories { primaryCategory { id } }
                            itemCondition { itemConditionId }
                        }
                        items {
                            sku
                            itemTerms {
                                availability { quantityAvailable }
                                pricingTerms { fixedPrice { original { value currency } } }
                            }
                        }
                        listingTerms {
                            fulfillmentTerms {
                                ... on FulfillmentTerms {
                                    packageSpecifications {
                                        packageDimensions { length width height }
                                        packageWeight { majorUnit minorUnit }
                                        listingUnitOfMeasure
                                    }
                                    shippingTerms {
                                        handlingTimeDuration
                                        shippingServices { rank }
                                    }
                                }
                            }
                            paymentTerms { ... on PaymentTerms { immediatePay } }
                            listingFormat
                            lifecycleTerms { listingDurationInDays startAt }
                            bestOfferTerms {
                                acceptBestOffer
                                autoAcceptThresholdAmount { original { value currency } }
                                autoDeclineThresholdAmount { original { value currency } }
                            }
                            itemLocation { country postalCode location }
                        }
                    }
                    listingFees {
                        listingFeeType
                        feeAmount { value currency }
                        promotionalDiscount { value currency }
                    }
                    warnings { warningCode warningMessage additionalInformation { name value } }
                }
            }
        }
        """;

    public static final String CREATE_SECOND_CHANCE_LISTING = """
        mutation CreateSecondChanceListing($input: CreateSecondChanceListingInput!) {
            createSecondChanceListing(input: $input) {
                __typename
                ... on CreateSecondChanceListingSuccess {
                    listing {
                        listingId sku marketplace
                        sellerProduct {
                            title description
                            aspects { name values }
                            images { ebayImageUrl }
                            categories { primaryCategory { id } }
                            itemCondition { itemConditionId }
                        }
                        items {
                            sku
                            itemTerms {
                                availability { quantityAvailable }
                                pricingTerms {
                                    fixedPrice { original { value currency } }
                                    auctionPrice {
                                        startingBidPrice { original { value currency } }
                                        reservePrice { original { value currency } }
                                    }
                                }
                            }
                        }
                        listingTerms {
                            fulfillmentTerms {
                                ... on FulfillmentTerms {
                                    packageSpecifications {
                                        packageDimensions { length width height }
                                        packageWeight { majorUnit minorUnit }
                                        listingUnitOfMeasure
                                    }
                                    shippingTerms {
                                        handlingTimeDuration
                                        shippingServices { rank }
                                    }
                                }
                            }
                            paymentTerms { ... on PaymentTerms { immediatePay } }
                            listingFormat
                            lifecycleTerms { listingDurationInDays startAt }
                            itemLocation { country postalCode location }
                        }
                    }
                    warnings { warningCode warningMessage additionalInformation { name value } }
                }
                ... on CreateSecondChanceListingValidationError {
                    errorCode errorMessage
                    violations { violationCode violationDescription inputPath additionalInformation { name value } }
                    warnings { warningCode warningMessage additionalInformation { name value } }
                }
                ... on CreateSecondChanceListingValidationSuccess {
                    listing {
                        listingId sku marketplace
                        sellerProduct {
                            title description
                            aspects { name values }
                            images { ebayImageUrl }
                            categories { primaryCategory { id } }
                            itemCondition { itemConditionId }
                        }
                        items {
                            sku
                            itemTerms {
                                availability { quantityAvailable }
                                pricingTerms {
                                    fixedPrice { original { value currency } }
                                    auctionPrice {
                                        startingBidPrice { original { value currency } }
                                        reservePrice { original { value currency } }
                                    }
                                }
                            }
                        }
                        listingTerms {
                            fulfillmentTerms {
                                ... on FulfillmentTerms {
                                    packageSpecifications {
                                        packageDimensions { length width height }
                                        packageWeight { majorUnit minorUnit }
                                        listingUnitOfMeasure
                                    }
                                    shippingTerms {
                                        handlingTimeDuration
                                        shippingServices { rank }
                                    }
                                }
                            }
                            paymentTerms { ... on PaymentTerms { immediatePay } }
                            listingFormat
                            lifecycleTerms { listingDurationInDays startAt }
                            itemLocation { country postalCode location }
                        }
                    }
                    warnings { warningCode warningMessage additionalInformation { name value } }
                }
            }
        }
        """;

    public static final String END_LISTING = """
        mutation EndListing($input: EndListingInput!) {
            endListing(input: $input) {
                __typename
                ... on EndListingSuccess {
                    listing {
                        listingId sku marketplace
                        sellerProduct {
                            title description
                            aspects { name values }
                            images { ebayImageUrl }
                            categories { primaryCategory { id } }
                            itemCondition { itemConditionId }
                        }
                        items {
                            sku
                            itemTerms {
                                availability { quantityAvailable }
                                pricingTerms { fixedPrice { original { value currency } } }
                            }
                        }
                        listingTerms {
                            fulfillmentTerms {
                                ... on FulfillmentTerms {
                                    packageSpecifications {
                                        packageDimensions { length width height }
                                        packageWeight { majorUnit minorUnit }
                                        listingUnitOfMeasure
                                    }
                                    shippingTerms {
                                        handlingTimeDuration
                                        shippingServices { rank }
                                    }
                                }
                            }
                            paymentTerms { ... on PaymentTerms { immediatePay } }
                            listingFormat
                            lifecycleTerms { listingDurationInDays startAt }
                            bestOfferTerms {
                                acceptBestOffer
                                autoAcceptThresholdAmount { original { value currency } }
                                autoDeclineThresholdAmount { original { value currency } }
                            }
                            itemLocation { country postalCode location }
                        }
                    }
                    warnings { warningCode warningMessage additionalInformation { name value } }
                }
                ... on EndListingValidationError {
                    errorCode errorMessage
                    violations { violationCode violationDescription inputPath additionalInformation { name value } }
                    warnings { warningCode warningMessage additionalInformation { name value } }
                }
            }
        }
        """;

    public static final String RELIST_LISTING = """
        mutation RelistListing($input: RelistListingInput!) {
            relistListing(input: $input) {
                __typename
                ... on RelistListingSuccess {
                    listing {
                        listingId sku marketplace
                        sellerProduct {
                            title description
                            aspects { name values }
                            images { ebayImageUrl }
                            categories { primaryCategory { id } }
                            itemCondition { itemConditionId }
                        }
                        items {
                            sku
                            itemTerms {
                                availability { quantityAvailable }
                                pricingTerms { fixedPrice { original { value currency } } }
                            }
                        }
                        listingTerms {
                            fulfillmentTerms {
                                ... on FulfillmentTerms {
                                    packageSpecifications {
                                        packageDimensions { length width height }
                                        packageWeight { majorUnit minorUnit }
                                        listingUnitOfMeasure
                                    }
                                    shippingTerms {
                                        handlingTimeDuration
                                        shippingServices { rank }
                                    }
                                }
                            }
                            paymentTerms { ... on PaymentTerms { immediatePay } }
                            listingFormat
                            lifecycleTerms { listingDurationInDays startAt }
                            bestOfferTerms {
                                acceptBestOffer
                                autoAcceptThresholdAmount { original { value currency } }
                                autoDeclineThresholdAmount { original { value currency } }
                            }
                            itemLocation { country postalCode location }
                        }
                    }
                    listingFees {
                        listingFeeType
                        feeAmount { value currency }
                        promotionalDiscount { value currency }
                    }
                    warnings { warningCode warningMessage additionalInformation { name value } }
                }
                ... on RelistListingValidationError {
                    errorCode errorMessage
                    violations { violationCode violationDescription inputPath additionalInformation { name value } }
                    warnings { warningCode warningMessage additionalInformation { name value } }
                }
                ... on RelistListingValidationSuccess {
                    listing {
                        listingId sku marketplace
                        sellerProduct {
                            title description
                            aspects { name values }
                            images { ebayImageUrl }
                            categories { primaryCategory { id } }
                            itemCondition { itemConditionId }
                        }
                        items {
                            sku
                            itemTerms {
                                availability { quantityAvailable }
                                pricingTerms { fixedPrice { original { value currency } } }
                            }
                        }
                        listingTerms {
                            fulfillmentTerms {
                                ... on FulfillmentTerms {
                                    packageSpecifications {
                                        packageDimensions { length width height }
                                        packageWeight { majorUnit minorUnit }
                                        listingUnitOfMeasure
                                    }
                                    shippingTerms {
                                        handlingTimeDuration
                                        shippingServices { rank }
                                    }
                                }
                            }
                            paymentTerms { ... on PaymentTerms { immediatePay } }
                            listingFormat
                            lifecycleTerms { listingDurationInDays startAt }
                            bestOfferTerms {
                                acceptBestOffer
                                autoAcceptThresholdAmount { original { value currency } }
                                autoDeclineThresholdAmount { original { value currency } }
                            }
                            itemLocation { country postalCode location }
                        }
                    }
                    listingFees {
                        listingFeeType
                        feeAmount { value currency }
                        promotionalDiscount { value currency }
                    }
                    warnings { warningCode warningMessage additionalInformation { name value } }
                }
            }
        }
        """;

    public static final String UPDATE_LISTING = """
        mutation UpdateListing($input: UpdateListingInput!) {
            updateListing(input: $input) {
                __typename
                ... on UpdateListingSuccess {
                    listing {
                        listingId sku marketplace
                        sellerProduct {
                            title description
                            aspects { name values }
                            images { ebayImageUrl }
                            categories { primaryCategory { id } }
                            itemCondition { itemConditionId }
                        }
                        items {
                            sku
                            itemTerms {
                                availability { quantityAvailable }
                                pricingTerms { fixedPrice { original { value currency } } }
                            }
                        }
                        listingTerms {
                            fulfillmentTerms {
                                ... on FulfillmentTerms {
                                    packageSpecifications {
                                        packageDimensions { length width height }
                                        packageWeight { majorUnit minorUnit }
                                        listingUnitOfMeasure
                                    }
                                    shippingTerms {
                                        handlingTimeDuration
                                        shippingServices { rank }
                                    }
                                }
                            }
                            paymentTerms { ... on PaymentTerms { immediatePay } }
                            listingFormat
                            lifecycleTerms { listingDurationInDays startAt }
                            bestOfferTerms {
                                acceptBestOffer
                                autoAcceptThresholdAmount { original { value currency } }
                                autoDeclineThresholdAmount { original { value currency } }
                            }
                            buyerRestrictions {
                                disableBuyerRestrictions
                                quantityLimitPerBuyer
                            }
                            itemLocation { country postalCode location }
                        }
                    }
                    listingFees {
                        listingFeeType
                        feeAmount { value currency }
                        promotionalDiscount { value currency }
                    }
                    warnings { warningCode warningMessage additionalInformation { name value } }
                }
                ... on UpdateListingValidationError {
                    errorCode errorMessage
                    violations { violationCode violationDescription inputPath additionalInformation { name value } }
                    warnings { warningCode warningMessage additionalInformation { name value } }
                }
                ... on UpdateListingValidationSuccess {
                    listing {
                        listingId sku marketplace
                        sellerProduct {
                            title description
                            aspects { name values }
                            images { ebayImageUrl }
                            categories { primaryCategory { id } }
                            itemCondition { itemConditionId }
                        }
                        items {
                            sku
                            itemTerms {
                                availability { quantityAvailable }
                                pricingTerms { fixedPrice { original { value currency } } }
                            }
                        }
                        listingTerms {
                            fulfillmentTerms {
                                ... on FulfillmentTerms {
                                    packageSpecifications {
                                        packageDimensions { length width height }
                                        packageWeight { majorUnit minorUnit }
                                        listingUnitOfMeasure
                                    }
                                    shippingTerms {
                                        handlingTimeDuration
                                        shippingServices { rank }
                                    }
                                }
                            }
                            paymentTerms { ... on PaymentTerms { immediatePay } }
                            listingFormat
                            lifecycleTerms { listingDurationInDays startAt }
                            bestOfferTerms {
                                acceptBestOffer
                                autoAcceptThresholdAmount { original { value currency } }
                                autoDeclineThresholdAmount { original { value currency } }
                            }
                            buyerRestrictions {
                                disableBuyerRestrictions
                                quantityLimitPerBuyer
                            }
                            itemLocation { country postalCode location }
                        }
                    }
                    listingFees {
                        listingFeeType
                        feeAmount { value currency }
                        promotionalDiscount { value currency }
                    }
                    warnings { warningCode warningMessage additionalInformation { name value } }
                }
            }
        }
        """;

    private ListingOperations() {
        // Utility class
    }
}
