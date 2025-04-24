#Projekt w Spring Boot

Prosty projekt bloga stworzony w technologii **Spring Boot** oraz **HTML/CSS/JS**. Użytkownicy mogą dodawać posty, przeglądać je, a także usuwać. 

## 🔧 Technologie

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 (in-memory database)
- HTML, CSS, JavaScript (frontend)
- IntelliJ IDEA Ultimate

## 📦 Funkcjonalności

- Dodawanie nowych postów
- Usuwanie postów
- Prosty układ graficzny (CSS Grid + responsywność)
- Backend oparty na REST API

## 🚀 Uruchomienie projektu

1. Sklonuj repozytorium:

   ```bash
   git clone https://github.com/twoj-login/nazwa-repo.git
   cd nazwa-repo
Otwórz w IntelliJ IDEA.

Uruchom klasę BlogApplication.java.

Frontend znajdziesz w plikach HTML (np. index.html).

Backend dostępny pod: http://localhost:8080/api/posts

✅ Przykładowe endpointy
GET /api/posts – pobranie wszystkich postów

POST /api/posts – dodanie nowego posta

DELETE /api/posts/{id} – usunięcie posta

✍️ Autor
Szymon Rędzina
Technikum programistyczne – klasa 4
