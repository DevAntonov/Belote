package com.belote.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ZdrastiController {

    private static final String template = "Zdrasti, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/zdrasti")
    public Zdrasti zdrasti(@RequestParam(value = "name", defaultValue = "Svyat") String name) {
        return new Zdrasti(counter.incrementAndGet(), String.format(template, name));
    }
}
