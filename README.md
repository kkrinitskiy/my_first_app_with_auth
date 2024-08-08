my first app that supports auth (also bcrypt password hashing, jwt token)

command to start docker container with database:
docker run --name login-app-postgres -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=admin -e POSTGRES_DB=login_app -p 5432:5432 -d postgres
