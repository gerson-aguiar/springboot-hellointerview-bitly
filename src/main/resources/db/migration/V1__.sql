CREATE TABLE short_url
(
    id              BIGINT AUTO_INCREMENT NOT NULL,
    original_url    VARCHAR(2048) NOT NULL,
    code            VARCHAR(10)   NOT NULL,
    custom_alias    VARCHAR(50) NULL,
    expiration_date datetime NULL,
    created_at      datetime      NOT NULL,
    CONSTRAINT pk_short_url PRIMARY KEY (id)
);

ALTER TABLE short_url
    ADD CONSTRAINT uc_short_url_code UNIQUE (code);

ALTER TABLE short_url
    ADD CONSTRAINT uc_short_url_customalias UNIQUE (custom_alias);