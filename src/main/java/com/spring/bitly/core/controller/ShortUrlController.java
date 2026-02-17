package com.spring.bitly.core.controller;

import com.spring.bitly.core.entity.ShortUrl;
import com.spring.bitly.core.repository.ShortUrlRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
public class ShortUrlController implements IShortUrlController {

    ShortUrlRepository shortUrlRepository;

    public ShortUrlController(ShortUrlRepository shortUrlRepository) {
        this.shortUrlRepository = shortUrlRepository;
    }

    @Override
    public ResponseEntity<ShortUrlResponseDTO> get(String code) {
        ShortUrl entity = shortUrlRepository.findByCode(code)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        ShortUrlResponseDTO responseDTO = ShortUrlResponseDTO.from(entity);
        return ResponseEntity.ok(responseDTO);
    }

    @Override
    public ResponseEntity<String> createShortUrl(String shortUrl) {
        return ResponseEntity.ok("POST Alo voce");
    }
}
