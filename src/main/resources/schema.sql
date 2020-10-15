--DROP TABLE IF EXISTS product_type;

CREATE TABLE IF NOT EXISTS product_type (
    id INTEGER NOT NULL AUTO_INCREMENT,
    name VARCHAR(64) NOT NULL,
    description VARCHAR(256) NOT NULL,
    PRIMARY KEY (id)
);

--DROP TABLE IF EXISTS product;

CREATE TABLE IF NOT EXISTS product (
    id INTEGER NOT NULL AUTO_INCREMENT,
    name VARCHAR(64) NOT NULL,
    description VARCHAR(256) NOT NULL,
    container INTEGER NOT NULL,
    weight_per_container FLOAT NOT NULL,
    product_type_id INTEGER NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS container (
    id INTEGER NOT NULL AUTO_INCREMENT,
    name VARCHAR(64) NOT NULL,
    description VARCHAR(256) NOT NULL,
    PRIMARY KEY (id)
);
