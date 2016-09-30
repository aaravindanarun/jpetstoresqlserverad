# Pull base image
From tomcat:latest

# Maintainer
MAINTAINER "Aravindan <AravindanArun.A@cognizant.com>"

# Copy to images tomcat path
ADD jpetstore.war /usr/local/tomcat/webapps/
ADD config.properties /var/lib/tomcat7/webapps/ 
