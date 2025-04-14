CREATE TABLE business (
    business_id SERIAL PRIMARY KEY,
    business_name VARCHAR(255),
    business_owner INT,
    business_type_id INT,
    FOREIGN KEY (business_type_id) REFERENCES business_type (business_type_id)
);