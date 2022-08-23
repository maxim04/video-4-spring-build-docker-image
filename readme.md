# Build a docker image with spring boot maven plugin

## Build docker image with "prod" profile
`./mvnw -Pprod install`

## Build docker image with "dev" profile
`./mvnw -Pdev install`

## Run docker image using docker compose providing env variable
`TEST_VAR_1=hello docker-compose up -d`
