pipeline {
    agent any
    tools {
        jdk 'jdk17' // or whatever JDK version is installed in Jenkins
        maven 'maven3'
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/YOUR_USERNAME/nora-data-handler-sim.git'
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
