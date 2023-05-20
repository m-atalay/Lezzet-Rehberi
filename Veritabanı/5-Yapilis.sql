CREATE TABLE yapilis (
  yapilis_id INT PRIMARY KEY AUTO_INCREMENT,
  yapilis_adi VARCHAR(255) NOT NULL,
  tarif_id INT,
  FOREIGN KEY (tarif_id) REFERENCES tarifler(tarif_id)
);
