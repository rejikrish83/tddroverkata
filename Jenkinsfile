pipeline{
	agent any
    tools { 
        maven 'maven 3.3.9'
        jdk 'JDK 8.181' 
        
    }
	
	
	stages{
		stage('Compile Stage'){
			steps{
				
				sh 'mvn clean compile'
				
			}
		}
		
		stage('Testing Stage'){
			steps{
				
				sh 'mvn test'
				
			}
			post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
		}
		
		stage('Deploy Stage'){
			steps{
				
				echo "Build Deployed successfully"
				
			}
			
		}
		
	}
}