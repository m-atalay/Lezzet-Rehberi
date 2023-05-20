CREATE TABLE yorumlar (
  yorum_id INT PRIMARY KEY AUTO_INCREMENT,
  yorum_icerik TEXT,
  kullanici_id INT,
  tarif_id INT,
  FOREIGN KEY (kullanici_id) REFERENCES kullanicilar(kullanici_id),
  FOREIGN KEY (tarif_id) REFERENCES tarifler(tarif_id)
);
