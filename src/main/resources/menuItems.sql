INSERT INTO menu_items (itemid, name, description, price, category)
VALUES
    (1, 'Bruschetta Classica', 'Ristet brød m. tomat, mozzarella-ost, basilikum, hvidløg og rødløg', 50.0, 'Anti Pasti'),
    (2, 'Vitello tonnato', 'Kalvekød i skiver m. tunsause og kapers', 95.0, 'Anti Pasti'),
    (3, 'Antipasto degustazione alla Vecchia Maniera', 'Diverse italienske delikattesse-forretter', 110.0, 'Anti Pasti'),
    (4, 'Carpaccio di bresaola', 'Lufttørret oksefilét m. rucola og grana-ost', 90.0, 'Anti Pasti'),
    (5, 'Caprese reale', 'Skiver af bøffelmozzarella-ost, tomat, pesto, rucola og grana-ost', 80.0, 'Anti Pasti');

-- Inserting Pasta data
INSERT INTO menu_items (itemid, name, description, price, category)
VALUES
    (6, 'Lasagne alla Vecchia Maniera', 'Med kødsauce bolognese og bechamelsauce', 90.0, 'Pasta'),
    (7, 'Cannelloni di ricotta e spinaci', 'Pastarør m. ricotta-ost og spinat', 85.0, 'Pasta'),
    (8, 'Tortelli gratinati al gorgonzola', 'Tortelli m. spinat, ricotta-ost, gratineret m. gorgonzola', 90.0, 'Pasta');

-- Inserting Pizze data
INSERT INTO menu_items (itemid, name, description, price, category)
VALUES
    (9, 'Margherita', 'Tomat, mozzarella-ost og basilikum', 80.0, 'Pizze'),
    (10, 'Capricciosa', 'Tomat, mozzarella-ost, champignon, artiskok og skinke', 90.0, 'Pizze'),
    (11, 'Quattro stagioni', 'Tomat, mozzarella-ost, champignon, skinke, artiskok, oliven og rejer', 90.0, 'Pizze'),
    (12, 'Bolognese', 'Tomat, mozzarella-ost og kødsauce', 85.0, 'Pizze'),
    (13, 'Pesce', 'Tomat, mozzarella-ost, tun og rejer', 90.0, 'Pizze'),
    (14, 'Peperoni', 'Tomat, mozzarella-ost, peperoni, bacon, hvidløg, chili', 90.0, 'Pizze'),
    (15, 'Tartufata', 'Mozzarella-ost, KarlJohan svampe, cherrytomat, rucola, grana-ost og trøffel creme', 105.0, 'Pizze'),
    (16, 'Vecchia Maniera', 'Mozzarella-ost, rødløg, kartofler og rosemarin', 85.0, 'Pizze'),
    (17, 'Salsiccia', 'Tomat, mozzarella-ost, salsiccia, mascarpone og champignon', 90.0, 'Pizze'),
    (18, 'Gorgonzola', 'Tomat, mozzarella-ost, luft-tørret-skinke og gorgonzola', 95.0, 'Pizze'),
    (19, 'Vegetariana', 'Tomat, mozzarella-ost og frisk-grillet grøntsager', 90.0, 'Pizze'),
    (20, 'Pollo', 'Tomat, mozzarella-ost, champignon og kylling', 90.0, 'Pizze'),
    (21, 'Bresaola', 'Tomat, mozzarella-ost, bresaola, cherrytomat, rucola og grana-ost', 100.0, 'Pizze'),
    (22, 'Carni', 'Tomat, mozzarella-ost, kødstrimler, paprika og løg', 95.0, 'Pizze'),
    (23, 'Caprese', 'Tomat, bøffel mozzarella-ost, friske tomater, mozzarella-ost og pesto', 90.0, 'Pizze'),
    (24, 'Mascarpone Cotto', 'Tomat, mozzarella-ost, mascarpone, kartoffelskiver og cotto-skinke', 95.0, 'Pizze'),
    (25, 'Italia salami', 'Tomat, mozzarella-ost, stærk italiensk salami', 90.0, 'Pizze');


-- Inserting Sandwich data
INSERT INTO menu_items (itemid, name, description, price, category)
VALUES
    (26, 'Sandwich med luft-tørret skinke', 'Altid nybagt ciabatta brød, Husets dressing eller pesto, samt frisk salat', 65.0, 'Sandwich'),
    (27, 'Sandwich med mortadella', 'Altid nybagt ciabatta brød, Husets dressing eller pesto, samt frisk salat', 65.0, 'Sandwich'),
    (28, 'Sandwich med bresaola', 'Lufttørret oksefliet', 65.0, 'Sandwich'),
    (29, 'Sandwich med kalvekød', 'Plus tunsauce og kapers', 65.0, 'Sandwich'),
    (30, 'Sandwich med kylling', 'Altid nybagt ciabatta brød, Husets dressing eller pesto, samt frisk salat', 65.0, 'Sandwich'),
    (31, 'Sandwich med bøffel-mozzarella-ost og pesto', 'Altid nybagt ciabatta brød, Husets dressing eller pesto, samt frisk salat', 65.0, 'Sandwich');

-- Inserting Til Dessert data
INSERT INTO menu_items (itemid, name, description, price, category)
VALUES
    (32, 'Tiramisu Vecchia Maniera', 'Veneziansk kage med m. mascarponecreme', 50.0, 'Til Dessert'),
    (33, 'Originale Italienske Is', 'Mange varianter', 50.0, 'Til Dessert');
