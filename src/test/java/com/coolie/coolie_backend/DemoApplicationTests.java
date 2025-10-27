package com.coolie.coolie_backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
        "spring.datasource.url=",
        "spring.datasource.username=",
        "spring.datasource.password=",
        "spring.jpa.hibernate.ddl-auto=none"
})
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }
}
