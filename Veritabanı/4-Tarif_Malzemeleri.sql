CREATE TABLE tarif_malzemeleri (
  tarif_id INT,
  malzeme_id INT,
  miktar VARCHAR(255),
  FOREIGN KEY (tarif_id) REFERENCES tarifler(tarif_id),
  FOREIGN KEY (malzeme_id) REFERENCES malzemeler(malzeme_id),
  PRIMARY KEY (tarif_id, malzeme_id)
);
