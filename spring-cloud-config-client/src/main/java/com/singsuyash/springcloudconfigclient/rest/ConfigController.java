package com.singsuyash.springcloudconfigclient.rest;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${user.role}")
    private String role;

    @Autowired
    private Logger logger;

    @GetMapping(
            value = "/whoami/{username}",
            produces = MediaType.TEXT_PLAIN_VALUE)
    public String whoami(@PathVariable("username") String username) {
        return String.format("Hello! You're %s and you'll become a(n) %s...\n", username, role);
    }

    @GetMapping(
            value = "/log",
            produces = MediaType.TEXT_PLAIN_VALUE
    )
    public String log() {
        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");
        return "logged";
    }
}
