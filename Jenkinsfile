pipeline {
    agent {label 'slave'}


    stages {
        stage('Git clone') {
            steps {
                git 'https://github.com/MaryamWahbi1/JenkinsHW.git'
            }
        }
        
        stage('Build') {
            steps {
                    sh "chmod +x gradlew"

            }
        }
        
        stage('run the app') {
            steps {
                sh 'jps | grep demo-0.0.1 | awk \'{print "kill -9 "$1}\' | bash -x'
                
                sh 'JENKINS_NODE_COOKIE=do_not_kill nohup java -jar build/libs/demo-0.0.1-SNAPSHOT.jar &'
            }
            
        }
        
    }
}