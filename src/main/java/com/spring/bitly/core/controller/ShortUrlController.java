package com.spring.bitly.core.controller;

import com.spring.bitly.core.entity.ShortUrl;
import com.spring.bitly.core.repository.ShortUrlRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ShortUrlController implements IShortUrlController {

    ShortUrlRepository shortUrlRepository;

    public ShortUrlController(ShortUrlRepository shortUrlRepository) {
        this.shortUrlRepository = shortUrlRepository;
    }

    @Override
    public ResponseEntity<Optional<ShortUrl>> get(String code) {
        return ResponseEntity.ok(shortUrlRepository.findByCode(code));
    }

    @Override
    public ResponseEntity<String> createShortUrl(String shortUrl) {
        return ResponseEntity.ok("POST Alo voce");
    }
}
