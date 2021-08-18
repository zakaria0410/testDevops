node {
stage('scm management'){
git credentialsId: 'github', url: 'https://github.com/zakaria0410/testDevops.git'
}
stage('maven'){
def mvnHome = tool name: 'maven', type: 'maven'
def mvnCmd="${mvnHome}/bin/mvn"
sh "${mvnCmd} clean package"

}
stage('Build Docker Image'){
def dockerHome= tool name: 'docker', type: 'dockerTool'
def dockerCmd="${dockerHome}/bin/mvn"
 sh "${dockerCmd} clean package"            


}
 }