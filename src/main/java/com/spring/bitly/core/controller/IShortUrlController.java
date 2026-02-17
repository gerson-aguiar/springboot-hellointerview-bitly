package com.spring.bitly.core.controller;

import com.spring.bitly.core.entity.ShortUrl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@RequestMapping("/v1/short-url")
public interface IShortUrlController {

    @GetMapping
    ResponseEntity<ShortUrlResponseDTO> get(String code);

    @PostMapping
    ResponseEntity<String> createShortUrl(String shortUrl);
}
