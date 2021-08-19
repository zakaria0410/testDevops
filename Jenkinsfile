node {
stage('scm management'){
git credentialsId: 'github', url: 'https://github.com/zakaria0410/testDevops.git'
}
stage('maven'){
def mvnHome = tool name: 'maven', type: 'maven'
def mvnCmd="${mvnHome}/bin/mvn"
sh "${mvnCmd} clean package"

}
stage('test Docker commande'){

 sh 'docker --version'            
 

}
stage('Build Docker Image'){

 sh 'docker build -t testdevops/testdevops:lts .'            
 

}
 }