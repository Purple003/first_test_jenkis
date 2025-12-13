pipeline {
    agent any
    tools {
        maven 'maven'
    }

    stages {
        stage('Build') {
            steps {
                dir('.') {   // assure que Maven s'exécute dans le dossier racine
                    bat 'mvn clean install'
                }
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t purple003/pos .'
            }
        }

        stage('Run Docker') {
            steps {
                bat 'docker rm -f test-pos || echo "no container to remove"'
                bat 'docker run --name test-pos -d -p 8585:8282 purple003/pos'
            }
        }
    }
}
