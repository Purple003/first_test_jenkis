pipeline {
    agent any
    tools {
        maven 'maven'
    }

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t aya/pos .'
            }
        }

        stage('Run Docker') {
            steps {
                bat 'docker rm -f test-pos || echo "no container to remove"'
                bat 'docker run --name test-pos -d -p 8585:8282 aya/pos'
            }
        }
    }
}
