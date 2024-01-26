# Przykład 05

Uruchom aplikację w trybie debugowania i wykonaj ją krok po kroku. 
Przyjrzyj się w jaki sposób i w którym momencie powstaje obiekt d klasy Dog.
Zaobserwuj, co dzieje się z polem *name* w trakcie:

- wywołania konstruktura `Dog()`
- wywołania metody `setName()`

Zobacz w jaki sposób metoda `getName()` zwraca imię psa.

Zwróć uwagę, że gdy metoda `println()` wypisuje obiekt klasy Dog, to po cichu wywołuje
metodę `toString()`, żeby zamienić obiekt klasy Dog na łańcuch tekstowy który można wyświetlić
na ekranie.

## Zadanie

Wzorując się na klasie utwórz klasę Cat dla kota.

1. W projekcie, w folderze `src` dodaj nową klasę Javy o nazwie `Cat`.
2. Dodaj pole prywatne pamiętające imię kota.
3. Dodaj konstruktor ustawiający imię kota.
4. Usuń komentarz z linii `Cat c=...` i sprawdź, czy program się kompiluje i uruchamia.
5. Dodaj metodę `getName()` zwracającą imię kota. Usuń komentarz z kolejnej linii. Uruchom 
program. Jeśli wszystko działa poprawnie możesz iść dalej.
6. Dodaj metodę `toString()`. Usuń kolejny komentarz i przetestuj działanie tej  metody.
7. Dodaj metodę `meow()`. Usuń kolejny komentarz i przetestuj czy kotek miauczy.
7. Dodaj metodę `setName()` która zmieni imię kota. Usuń komentarze z wszystkich kolejnych
linii i sprawdź, czy imię faktycznie się zmienia.

