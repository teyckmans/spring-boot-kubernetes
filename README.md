# spring-boot-kubernetes-basics

# local docker compose setup
./gradlew build
docker-compose up --build
curl http://localhost:8080/basics/time
docker-compose down

# local microk8s setup

note: microk8s also needs port 8080 so please stop run docker-compose down before starting with this section.

sudo snap install microk8s --classic
sudo microk8s.start
sudo microk8s.enable dns
sudo microk8s.enable ingress
sudo microk8s.kubectl apply -f kubernetes/01_postgres_deployment.yml
sudo microk8s.kubectl apply -f kubernetes/02_postgres_service.yml
sudo microk8s.kubectl apply -f kubernetes/03_spring_boot_basics_deployment.yml
sudo microk8s.kubectl apply -f kubernetes/04_spring_boot_basics_service.yml
sudo microk8s.kubectl apply -f kubernetes/05_spring_boot_basics_ingress.yml
curl http://localhost:80/basics/time


