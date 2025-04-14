CREATE TABLE inventory (
    inventory_id SERIAL PRIMARY KEY,
    business_id INT,
    product_id INT,
    quantity INT,
    FOREIGN KEY (business_id) REFERENCES business (business_id),
    FOREIGN KEY (product_id) REFERENCES products (product_id)
);