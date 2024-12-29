package com.example.SBD_EnvironmentVariable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Value("${TEST_ENV_VAR}")
    private String testEnvVar;

    @GetMapping("/hello")
    public String hello() {
        return "Environment Variable Value  : " + testEnvVar;
    }
}
