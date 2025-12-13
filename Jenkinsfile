pipeline {
    agent any
    tools {
        maven 'maven'
    }

    stages {
        stage('Git Clone') {
            steps {
                git branch: 'main', url: 'https://github.com/Purple003/first_test_jenkis.git'
            }
        }

        stage('Build') {
            steps {
                dir('.') {   // assure que Maven s'exécute dans le dossier où se trouve pom.xml
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
