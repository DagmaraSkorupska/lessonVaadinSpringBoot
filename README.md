1.	Stwórz aplikacje W SpringBoot, która będzie miała klasę encji JPA „Rectangle”. Klasa ma mieć pola: id, height, width.
2.	Z użyciem biblioteki Vaadin stwórz UI pozwalający na dodawanie nowych prostokątów do bazy danych
3.	Dostęp do BD ma być widoczny pod endpointem „localhost:8090/figureDB
4.	Po ponownym uruchomieniu aplikacji dane w bazie mają zostać usunięte.
5.	Utwórz endpoint, dzięki któremu po przekazaniu w parametrze nazwy figury (dla prostokąta i trójkąta) oraz długości boków zwraca obwód danej figury np.: figure=rectangle&a=10&b=20 zwraca 60
6.	Umieść w pliku konfiguracyjnym stwórz 4 zestawy danych dla prostokątów. Wczytaj te 4 prostokąty do programu (w momencie startu) a następnie umieść je w BD
7.	W GUI umieść pole tekstowe które w zależności od podanej wartości wyświetla prostokąty z bazy danych (wykorzystanie repo) – duże i małe (np. małe gdzie obwód nie przekracza 20j)
