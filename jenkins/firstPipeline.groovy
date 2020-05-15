pipelineJob("First Pipeline") {
   agent any

   stages {
      stage('Hello') {
         steps {
            echo "Hello World"
         }
      }
      stage('Stage 2') {
         steps {
            echo "Hello World2"
         }
      }
   }
}
