package com.ebay.listingmanagement.clients.graphql

import com.ebay.listingmanagement.configuration.ListingManagementConfiguration
import com.ebay.listingmanagement.configuration.TokenContext
import com.ebay.listingmanagement.configuration.RequestOptions
import com.ebay.listingmanagement.exceptions.GraphQLException
import com.ebay.listingmanagement.generated.graphql.*
import com.ebay.listingmanagement.generated.graphql.type.*
import com.apollographql.apollo.ApolloClient
import kotlinx.coroutines.future.future
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import java.util.concurrent.CompletableFuture

/**
 * Typed GraphQL client for Listing Management operations using Apollo Kotlin.
 * Provides strongly-typed access to all 9 GraphQL operations.
 */
class ListingGraphQLClient @JvmOverloads internal constructor(
    private val apolloClient: ApolloClient,
    private val dynamicClient: DynamicGraphQLClient,
    private val config: ListingManagementConfiguration,
    private val scope: CoroutineScope = CoroutineScope(Dispatchers.IO)
) {

    // ══════════════════════════════════════════════════════════════════════════
    // QUERIES
    // ══════════════════════════════════════════════════════════════════════════

    /**
     * Get bidding activity for a specific item.
     */
    suspend fun itemBiddingActivityAsync(
        input: ItemBiddingActivityInput,
        accessToken: String? = null
    ): ItemBiddingActivityQuery.ItemBiddingActivity? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.query(ItemBiddingActivityQuery(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.itemBiddingActivity
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    /**
     * Get seller listings by filter criteria.
     */
    suspend fun sellerListingsAsync(
        input: SellerListingsInput,
        accessToken: String? = null
    ): SellerListingsQuery.SellerListings? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.query(SellerListingsQuery(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.sellerListings
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    /**
     * Search seller's active, ended, and scheduled listings.
     */
    suspend fun sellerListingSearchAsync(
        accessToken: String? = null
    ): SellerListingSearchQuery.SellerListingSearch? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.query(SellerListingSearchQuery()).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.sellerListingSearch
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    // ══════════════════════════════════════════════════════════════════════════
    // MUTATIONS
    // ══════════════════════════════════════════════════════════════════════════

    /**
     * Bulk update inventory quantities and prices.
     */
    suspend fun bulkUpdateInventoryAsync(
        input: BulkUpdateInventoryInput,
        accessToken: String? = null
    ): BulkUpdateInventoryMutation.BulkUpdateInventory? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(BulkUpdateInventoryMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.bulkUpdateInventory
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    /**
     * Create a new listing.
     */
    suspend fun createListingAsync(
        input: CreateListingInput,
        accessToken: String? = null
    ): CreateListingMutation.CreateListing? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(CreateListingMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.createListing
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    /**
     * Create a second chance listing.
     */
    suspend fun createSecondChanceListingAsync(
        input: CreateSecondChanceListingInput,
        accessToken: String? = null
    ): CreateSecondChanceListingMutation.CreateSecondChanceListing? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(CreateSecondChanceListingMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.createSecondChanceListing
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    /**
     * End a listing.
     */
    suspend fun endListingAsync(
        input: EndListingInput,
        accessToken: String? = null
    ): EndListingMutation.EndListing? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(EndListingMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.endListing
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    /**
     * Relist a listing.
     */
    suspend fun relistListingAsync(
        input: RelistListingInput,
        accessToken: String? = null
    ): RelistListingMutation.RelistListing? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(RelistListingMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.relistListing
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    /**
     * Update a listing.
     */
    suspend fun updateListingAsync(
        input: UpdateListingInput,
        accessToken: String? = null
    ): UpdateListingMutation.UpdateListing? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(UpdateListingMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.updateListing
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    // ══════════════════════════════════════════════════════════════════════════
    // JAVA-FRIENDLY COMPLETABLE FUTURE WRAPPERS
    // ══════════════════════════════════════════════════════════════════════════

    fun itemBiddingActivityFuture(input: ItemBiddingActivityInput, accessToken: String?) =
        scope.future { itemBiddingActivityAsync(input, accessToken) }

    fun sellerListingsFuture(input: SellerListingsInput, accessToken: String?) =
        scope.future { sellerListingsAsync(input, accessToken) }

    fun sellerListingSearchFuture(accessToken: String?) =
        scope.future { sellerListingSearchAsync(accessToken) }

    fun bulkUpdateInventoryFuture(input: BulkUpdateInventoryInput, accessToken: String?) =
        scope.future { bulkUpdateInventoryAsync(input, accessToken) }

    fun createListingFuture(input: CreateListingInput, accessToken: String?) =
        scope.future { createListingAsync(input, accessToken) }

    fun createSecondChanceListingFuture(input: CreateSecondChanceListingInput, accessToken: String?) =
        scope.future { createSecondChanceListingAsync(input, accessToken) }

    fun endListingFuture(input: EndListingInput, accessToken: String?) =
        scope.future { endListingAsync(input, accessToken) }

    fun relistListingFuture(input: RelistListingInput, accessToken: String?) =
        scope.future { relistListingAsync(input, accessToken) }

    fun updateListingFuture(input: UpdateListingInput, accessToken: String?) =
        scope.future { updateListingAsync(input, accessToken) }

    // ══════════════════════════════════════════════════════════════════════════
    // ESCAPE HATCH: RAW GRAPHQL
    // ══════════════════════════════════════════════════════════════════════════

    /**
     * Execute arbitrary GraphQL query/mutation.
     * Escape hatch for operations not yet wrapped in typed methods.
     */
    fun executeRaw(
        query: String,
        variables: Any?,
        accessToken: String?,
        requestOptions: RequestOptions? = null
    ) = dynamicClient.execute(query, variables, accessToken, requestOptions)
}
