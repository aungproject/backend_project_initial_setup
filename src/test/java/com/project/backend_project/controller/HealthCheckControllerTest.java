package com.project.backend_project.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class HealthCheckControllerTest {
    private HealthCheckController controller;

    @BeforeEach
    void setUp() {
        this.controller = new HealthCheckController();
    }

    @Test
    void testHealth() {
        String expectedResponse = "ok";
        String actualResponse = controller.index();

        assertThat("Health Check returned invalid response", actualResponse.equals(expectedResponse));
    }
}
