node{
    
    stage("clone"){
        git credentialsId: 'git_credentials', url: 'https://github.com/Swati2107/first_jenkins.git'
    }
    
    stage("package"){
        bat label: '', script: 'mvn clean package'
    }
    
    //bat label: '', script: 'java -jar target/demo-0.0.1-SNAPSHOT.jar'
    
    stage("image creation"){
        bat label: '', script: 'docker build -t java-test:1.0 .'
    }
    
    stage("run in container"){
        bat label: '', script: 'docker run -d -p 8080:8080 --name java-container java-test:1.0'
    }
    
}