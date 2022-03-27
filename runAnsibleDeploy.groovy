
library identifier: 'jenkins-shared-library@main', 
        retriever: modernSCM(
        [$class: 'GitSCMSource',
        //remote: 'https://github.com/xiviwo/jenkins-shared-library.git',
        remote: '/var/jenkins_home/jobs/test/workspace/jenkins-shared-library',
        credentialsId: 'my-github',
        changelog: false
        ])

runAnsible()