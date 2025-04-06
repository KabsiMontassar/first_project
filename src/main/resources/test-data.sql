-- Insert a test restaurant
INSERT INTO restaurant (nom, nb_places_max) 
VALUES ('Restaurant Test', 100);

-- Insert a test chaine restauration
INSERT INTO chaine_restauration (libelle, date_creation) 
VALUES ('Chaine Test', CURRENT_DATE);
