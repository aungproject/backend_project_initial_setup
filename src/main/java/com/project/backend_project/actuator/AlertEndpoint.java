package com.project.backend_project.actuator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "alert")
public class AlertEndpoint {
    private static final Logger logger = LoggerFactory.getLogger(AlertEndpoint.class);

    @WriteOperation
    public ResponseEntity<String> generateAlert(String level, String message, int repeat) {
        if (message == null || message.isBlank() || repeat == 0) {
            return ResponseEntity.badRequest().body("Invalid input.");
        }
        for (int i = 0; i < repeat; i++) {
            switch (level.toUpperCase()) {
                case "TRACE":
                    logger.trace(message);
                    break;
                case "DEBUG":
                    logger.debug(message);
                    break;
                case "INFO":
                    logger.info(message);
                    break;
                case "WARN":
                    logger.warn(message);
                    break;
                case "ERROR":
                    logger.error(message);
                    break;
                default:
                    return ResponseEntity.badRequest().body("Invalid log level.");
            }
        }
        return ResponseEntity.ok("ok");
    }

}
