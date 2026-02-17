package com.spring.bitly.core.controller;

import com.spring.bitly.core.entity.ShortUrl;

public record ShortUrlResponseDTO(
        String originalUrl,
        String code,
        String version
) {
    public static ShortUrlResponseDTO from(ShortUrl entity) {
        return new ShortUrlResponseDTO(
                entity.getOriginalUrl(),
                entity.getCode(),
                "v0.0.5"
        );
    }
}
