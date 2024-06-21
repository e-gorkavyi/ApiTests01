pipeline {
  agent any
  tools {
    maven 'Maven'
  }
  stages {
    stage ('Tests') {
      steps {
        sh 'mvn clean test'
      }
    }
  }
}