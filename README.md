#  TP DevOps : CI/CD avec Jenkins, Docker & GitHub

##  Objectif
Mettre en place un pipeline CI/CD automatisé avec **Jenkins** et **GitHub Webhooks**, déployé dans un conteneur Docker, afin de lancer automatiquement les builds et exécuter l’application sur le port **9090**.

---

##  Pré-requis
- Java & Maven installés
- Docker installé et fonctionnel
- Jenkins configuré (dans un conteneur ou en local)
- Compte GitHub avec repository du projet
- Ngrok pour exposer Jenkins à GitHub

---

##  Étapes du TP

### 1. Création du projet sur GitHub
- Créer un repository (ex. `first_test_jenkis`)
- Ajouter le code source (Spring Boot ou autre projet Java)
- Vérifier que le projet compile localement

---

### 2. Configuration de Jenkins
- Lancer Jenkins (via Docker ou local)
- Créer un **nouveau job** lié au repository GitHub
- Configurer le **pipeline** pour exécuter le build

<img width="1171" height="613" alt="image" src="https://github.com/user-attachments/assets/d1b435f2-586a-4b21-bdfa-0c91019e3601" />

---

### 3. Mise en place du Webhook GitHub
- Aller dans **Settings → Webhooks**
- Ajouter l’URL exposée par ngrok (ex. `http://xxxx.ngrok.io/github-webhook/`)
- Sélectionner l’événement **push**
- Vérifier que le webhook est actif
<img width="1170" height="878" alt="image" src="https://github.com/user-attachments/assets/18794a37-7502-4ea1-bf85-27f808dea667" />


---

### 4. Déclenchement automatique du build
- Faire un commit/push sur GitHub
- Jenkins reçoit l’événement et lance automatiquement le build
- Exemple : **Build #5 déclenché automatiquement**

<img width="1129" height="914" alt="image" src="https://github.com/user-attachments/assets/83ca1898-ccc7-4b50-a688-267d62259c55" />

---

### 5. Lancement de l’application
Commande utilisée :

```bash
java -jar app.jar --server.port=9090
```
### Application accessible
http://localhost:9090

## Bienfaits
- Automatisation complète du cycle de build  
- Gain de temps et réduction des erreurs manuelles  
- Démonstration claire et reproductible pour tout projet similaire  

## Démo


https://github.com/user-attachments/assets/f4feeae5-4a5f-439e-8bc8-c0b2a60f8ffd





