pipeline {
    agent any
    
    tools{
        jdk "Java8"
        maven "maven"
    }

    stages {
        stage('Recuperation des sources'){
            steps {
                git url:'https://github.com/Amtilaw/javaBuildHtml', branch:"main"
            }
        }
        stage('Build'){
            steps {
                sh """
                java -version
                echo "Lancement de la compilation"
                mvn compile
                """
            }
        }
    }
}

