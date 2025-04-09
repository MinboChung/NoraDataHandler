pipeline {
    agent any
    tools {
        jdk 'jdk17'
        maven 'maven3'
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/minbochung/nora-data-handler-sim.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }
}
