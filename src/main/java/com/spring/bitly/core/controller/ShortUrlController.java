package com.spring.bitly.core.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShortUrlController implements IShortUrlController {

    @Override
    public ResponseEntity<String> getShortUrl(String shortUrl) {
        return ResponseEntity.ok("GET Alo voce");
    }

    @Override
    public ResponseEntity<String> createShortUrl(String shortUrl) {
        return ResponseEntity.ok("POST Alo voce");
    }
}
