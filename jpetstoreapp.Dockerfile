# Pull base image
From tomcat:latest

# Maintainer
MAINTAINER "Aravindan <AravindanArun.A@cognizant.com>"

# Copy to images tomcat path
ADD ${WORKSPACE}/${JOB_NAME}/target/jpetstore.war /usr/local/tomcat/webapps/
ADD ${WORKSPACE}/${JOB_NAME}/config.properties /var/lib/tomcat7/webapps/ 
