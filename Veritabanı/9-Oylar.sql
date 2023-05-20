CREATE TABLE oylar (
  kullanici_id INT,
  tarif_id INT,
  puan INT,
  FOREIGN KEY (kullanici_id) REFERENCES kullanicilar(kullanici_id),
  FOREIGN KEY (tarif_id) REFERENCES tarifler(tarif_id),
  PRIMARY KEY (kullanici_id, tarif_id)
);
