DROP TABLE IF EXISTS product_type;

CREATE TABLE product_type (
    id INTEGER NOT NULL AUTO_INCREMENT,
    name VARCHAR(64) NOT NULL,
    description VARCHAR(256) NOT NULL,
    PRIMARY KEY (id)
);

DROP TABLE IF EXISTS product;

CREATE TABLE product (
    id INTEGER NOT NULL AUTO_INCREMENT,
    name VARCHAR(64) NOT NULL,
    description VARCHAR(256) NOT NULL,
    weight FLOAT NOT NULL,
    product_type_id INTEGER,
    PRIMARY KEY (id)
);