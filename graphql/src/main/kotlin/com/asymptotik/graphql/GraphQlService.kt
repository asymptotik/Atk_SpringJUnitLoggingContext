package com.asymptotik.graphql

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.stereotype.Service

@Suppress("unused")
@Service
@EnableConfigurationProperties(GraphQlServiceProperties::class)
class GraphQlService(private val serviceProperties: GraphQlServiceProperties) {

    val message: String?
        get() {
            return serviceProperties.message
        }
}