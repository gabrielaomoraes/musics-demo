DROP TABLE IF EXISTS MUSIC;

CREATE TABLE MUSIC (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  artist VARCHAR(250) NOT NULL
);

INSERT INTO MUSIC (name, artist) VALUES
  ('Astronaut In The Ocean', 'Masked Wolf'),
  ('Have You Ever Seen The Rain', 'Creedence Clearwater Revival'),
  ('Liztomania', 'Phoenix'),
  ('Butter', 'BTS'),
  ('R U Mine?', 'Arctic Monkeys'),
  ('Levitating', 'Dua Lipa'),
  ('Peaches', 'Justin Bieber'),
  ('Save Your Tears', 'The Weeknd'),
  ('Someone You Loved', 'Lewis Capaldi'),
  ('Ruby', 'Kaiser Chiefs') ;