pipeline{
	agent any
    tools { 
        maven 'Maven 3.3.9' 
        
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
				
				sh 'mvn deploy'
				
			}
			
		}
		
	}
}