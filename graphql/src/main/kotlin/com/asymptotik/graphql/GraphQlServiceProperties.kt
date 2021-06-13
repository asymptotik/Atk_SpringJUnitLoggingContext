package com.asymptotik.graphql

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("service")
class GraphQlServiceProperties {
    /**
     * A message for the service.
     */
    var message: String? = null
}