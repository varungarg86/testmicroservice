DROP TABLE IF EXISTS t_customer;

CREATE TABLE t_customer (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  age VARCHAR(3) NOT NULL,
  address VARCHAR(250) NOT NULL,
  account_type VARCHAR(25) NOT NULL
);

INSERT INTO t_customer (name, age, address, account_type) VALUES
  ('Varun', '34', '340 Arbor Dr MS 39157', 'Checking'),
  ('John', '30', '342 Arbor Dr MS 39157', 'Saving');
