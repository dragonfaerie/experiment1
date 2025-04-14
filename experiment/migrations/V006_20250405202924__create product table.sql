CREATE TABLE products (
    product_id SERIAL PRIMARY KEY,
    product_type VARCHAR(255),
    product_name VARCHAR(255),
    product_price NUMERIC(6, 2)
);