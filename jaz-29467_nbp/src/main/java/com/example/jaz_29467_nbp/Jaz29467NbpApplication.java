package com.example.jaz_29467_nbp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jaz29467NbpApplication {

    public static void main(String[] args) {
        SpringApplication.run(Jaz29467NbpApplication.class, args);
    }

}


//Stwórz nowy projekt o nazwie jaz-numer_indeksu-nbp, który będzie aplikacją springową.
//Niech posiada ona wystawione oraz udokumentowane Rest API. Celem aplikacji jest
//wyświetlenie użytkownikowi obliczonego średniego kursu danej waluty biorąc pod uwagę
//dane z przedziału od YYYY-MM-DD do YYYY-MM-DD. Wykorzystaj do tego api NBP
//http://api.nbp.pl/.

//Każdorazowe wykonanie zapytania ma zapisać w bazie danych następujące informacje:
//id (automatycznie przypisywane), walutę dla jakiej zostało wykonane zapytanie, datę
//rozpoczynającą przedział, datę kończącą przedział, jaki został wyliczony kurs, data oraz
//godzina zapytania.

//Aplikacja ma mieć wystawiony jeden endpoint GET. Sposób przyjęcia przedziału dat oraz
//waluty jest dowolny.

//Wszystkie kody błędów które może zwrócić NBP muszą być odpowiednio obsłużone.