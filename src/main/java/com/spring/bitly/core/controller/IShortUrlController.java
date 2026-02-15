package com.spring.bitly.core.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/v1/short-url")
public interface IShortUrlController {

    @GetMapping
    ResponseEntity<String> getShortUrl(String shortUrl);

    @PostMapping
    ResponseEntity<String> createShortUrl(String shortUrl);
}
