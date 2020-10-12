CREATE TABLE IF NOT EXISTS `product_type` (
    `id`          INTEGER NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(64) NOT NULL,
    `description` VARCHAR(256) NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS product (
    id          INTEGER NOT NULL AUTO_INCREMENT,
    name VARCHAR(64) NOT NULL,
    description VARCHAR(256) NOT NULL,
    weight FLOAT NOT NULL,
    product_type_id INTEGER,
    PRIMARY KEY (id)
);