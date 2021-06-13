package com.asymptotik.graphql

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.test.context.SpringBootTest

private val logger = LoggerFactory.getLogger(GraphQlServiceTests::class.java)

@SpringBootTest("service.message=Hello")
class GraphQlServiceTests {
    @Autowired
    private val service: GraphQlService? = null

    @Test
    fun contextLoads() {
        logger.info("service?.message ${service?.message}")
        assertThat(service?.message).isNotNull
    }

    @SpringBootApplication
    internal open class TestConfiguration
}