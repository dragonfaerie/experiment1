CREATE TABLE IF NOT EXISTS horse (
    id SERIAL PRIMARY KEY,
    horse_name VARCHAR(255) NOT NULL,
    breed VARCHAR(255) NOT NULL,
    color VARCHAR(255) NOT NULL,
    pattern VARCHAR(255) NOT NULL DEFAULT 'none', -- Ensuring it's never NULL
    age INTEGER NOT NULL CHECK (age >= 0), -- No negative ages
    gender VARCHAR(10) NOT NULL CHECK (gender IN ('Mare', 'Stallion', 'Gelding')), -- M = Male, F = Female, G = Gelding
    value INTEGER NOT NULL CHECK (value >= 0), -- Assuming whole numbers, no decimals
    training INTEGER NOT NULL CHECK (training >= 0), -- Represents training level
    health INTEGER NOT NULL CHECK (health BETWEEN 0 AND 100), -- Health as a percentage
    vet BOOLEAN NOT NULL DEFAULT FALSE, -- Whether they need a vet visit
    farrier BOOLEAN NOT NULL DEFAULT FALSE, -- Whether they need a farrier
    food BOOLEAN NOT NULL DEFAULT FALSE, -- Whether they have been fed
    water BOOLEAN NOT NULL DEFAULT FALSE, -- Whether they have been watered
    owner INTEGER NOT NULL, -- Placeholder for users table
    current_location VARCHAR(255) NOT NULL, -- Could be 'barn', 'pasture', 'event', etc.
    home_barn INTEGER NOT NULL, -- The horse's home barn, even if traveling
    discipline VARCHAR(255) NOT NULL, -- Primary discipline, e.g., 'Dressage', 'Jumping', 'Western'
    CONSTRAINT fk_home_barn FOREIGN KEY (home_barn) REFERENCES barn(id) ON DELETE CASCADE,
    CONSTRAINT unique_horse_per_breed UNIQUE (horse_name, breed) -- Ensuring name is unique per breed
);
