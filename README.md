# AccountService
En enkel Spring Boot web app med en rest endpoint. Svaret på endpointen är Json, men formatet är udda... (se Serializer-klasser).

Servicen används i min "Pattern matching" demo (se EngagementApp) som backend service.
## Installation
Bygg: `mvn clean package`

Kör: `java -jar target/account-service-0.0.1-SNAPSHOT.jar`

Endpoint: `http://localhost:8080/account/0`