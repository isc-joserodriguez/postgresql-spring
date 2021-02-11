INSERT INTO pais(nombre) VALUES ('México');
INSERT INTO pais(nombre) VALUES ('Estados Unidos');
INSERT INTO pais(nombre) VALUES ('Canadá');
INSERT INTO pais(nombre) VALUES ('España');

INSERT INTO estado(paisid, nombre) VALUES (1, 'Chihuahua');
INSERT INTO estado(paisID, nombre) VALUES (1, 'Nayarit');
INSERT INTO estado(paisID, nombre) VALUES (2, 'Ohio');
INSERT INTO estado(paisID, nombre) VALUES (2, 'Texas');
INSERT INTO estado(paisID, nombre) VALUES (3, 'Manitoba');
INSERT INTO estado(paisID, nombre) VALUES (3, 'Alberta');
INSERT INTO estado(paisID, nombre) VALUES (4, 'Madrid');
INSERT INTO estado(paisID, nombre) VALUES (4, 'Alicante');
		
INSERT INTO ciudad(estadoID, nombre) VALUES (1, 'Juárez');
INSERT INTO ciudad(estadoID, nombre) VALUES (1, 'Chihuahua');
INSERT INTO ciudad(estadoID, nombre) VALUES (2, 'La palma');
INSERT INTO ciudad(estadoID, nombre) VALUES (2, 'Tepic');
INSERT INTO ciudad(estadoID, nombre) VALUES (3, 'Columbus');
INSERT INTO ciudad(estadoID, nombre) VALUES (3, 'Springfield');
INSERT INTO ciudad(estadoID, nombre) VALUES (4, 'San Antonio');
INSERT INTO ciudad(estadoID, nombre) VALUES (4, 'Austin');
INSERT INTO ciudad(estadoID, nombre) VALUES (5, 'Winnipeg');
INSERT INTO ciudad(estadoID, nombre) VALUES (5, 'Winkler');
INSERT INTO ciudad(estadoID, nombre) VALUES (6, 'Lacombe');
INSERT INTO ciudad(estadoID, nombre) VALUES (6, 'Calgary');
INSERT INTO ciudad(estadoID, nombre) VALUES (7, 'El Alrazar');
INSERT INTO ciudad(estadoID, nombre) VALUES (7, 'Madrid');
INSERT INTO ciudad(estadoID, nombre) VALUES (8, 'Santa Pola');
INSERT INTO ciudad(estadoID, nombre) VALUES (8, 'El Campello');

INSERT INTO usuario(ciudadId, nombre, edad) VALUES (4, 'Mauricio', 63);