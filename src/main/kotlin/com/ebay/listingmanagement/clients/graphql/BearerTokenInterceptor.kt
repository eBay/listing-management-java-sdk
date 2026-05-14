package com.ebay.listingmanagement.clients.graphql

import com.ebay.listingmanagement.configuration.ListingManagementConfiguration
import com.ebay.listingmanagement.configuration.TokenContext
import okhttp3.Interceptor
import okhttp3.Response

/**
 * OkHttp interceptor that adds Bearer token authentication to GraphQL requests.
 * Reads token from TokenContext (per-call) or configuration (fallback).
 */
internal class BearerTokenInterceptor(private val config: ListingManagementConfiguration) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val token = TokenContext.CURRENT.get()
            ?: config.accessToken
            ?: error("No access token. Pass accessToken per-call or set ListingManagementConfiguration.accessToken.")
        return chain.proceed(
            chain.request().newBuilder()
                .header("Authorization", "Bearer $token")
                .build()
        )
    }
}
