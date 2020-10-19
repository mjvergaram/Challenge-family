1. Generar componente:
mvn clen install -DskipTest=true

2. Construir los dos contenerdores: 
docker-compose up

3. Url para consumir la api:
http://localhost:8080/challenge/people/

4. Ejemplo del JSON a enviar(POST):
{
    "id": 2,
    "fullname": "MJVERGARA",
    "birth": "2020-10-1T00:00:00",
    "typePerson": "Child"
}
