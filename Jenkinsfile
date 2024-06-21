pipeline {
  agent any
  tools {
    maven 'maven-3.8.7'
  }
  stages {
    stage ('Tests') {
      steps {
        sh 'mvn clean test'
      }
    }
  }
}