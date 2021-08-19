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

 sh "docker --version"            


}
 }