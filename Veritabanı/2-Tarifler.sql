CREATE TABLE tarifler (
  tarif_id INT PRIMARY KEY AUTO_INCREMENT,
  tarif_adi VARCHAR(255) NOT NULL,
  tarif_resim VARCHAR(255),
  tarif_icerik TEXT,
  kategori_id INT,
  FOREIGN KEY (kategori_id) REFERENCES kategoriler(kategori_id)
);
