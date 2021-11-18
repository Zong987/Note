DROP TABLE IF EXISTS HELLO;

CREATE TABLE HELLO(
  id INT AUTO_INCREMENT PRIMARY KEY,
  account VARCHAR(250) NOT NULL,
  password VARCHAR(250) NOT NULL,
  name VARCHAR(250) NOT NULL,
  email VARCHAR(250) NOT NULL,
  register_time datetime NOT NULL
);

INSERT INTO HELLO (account, password, name, email, register_time) VALUES
  ('todd3307699', '0000', 'todd', 'todd.3307699@gmail.com', '2021-11-18 00:00:00');
