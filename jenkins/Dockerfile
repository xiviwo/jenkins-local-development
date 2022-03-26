FROM jenkins/jenkins:lts
USER root
COPY jobs /usr/share/jenkins/ref/jobs/
COPY resources/maven-settings.xml /usr/share/jenkins/ref/org.jenkinsci.plugins.configfiles.GlobalConfigFiles.xml
RUN chown -R jenkins.jenkins /usr/share/jenkins/ref/jobs/
RUN sed -i 's#http://deb.debian.org#http://mirrors.163.com#g' /etc/apt/sources.list
RUN apt-get update && apt-get install -y pip docker.io ansible
# RUN docker images 
# RUN which docker 
# RUN groupadd docker
RUN usermod -aG docker jenkins 
# USER jenkins 
# RUN docker images 
# RUN pip install pip --upgrade
# RUN pip install ansible 