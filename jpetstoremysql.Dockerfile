FROM mysql:5.6
MAINTAINER  AravindanArun.A <AravindanArun.A@cognizant.com>

# Copy the database schema to the /data directory
ADD ${WORKSPACE}/${JOB_NAME}/src/main/resources/database/jpetstore-hsqldb-dataload.sql   /docker-entrypoint-initdb.d/02_jpetstore-hsqldb-dataload.sql
ADD ${WORKSPACE}/${JOB_NAME}/src/main/resources/database/jpetstore-hsqldb-schema.sql   /docker-entrypoint-initdb.d/01_jpetstore-hsqldb-schema.sql
ADD ${WORKSPACE}/${JOB_NAME}/docker-entrypoint.sh /docker-entrypoint-initdb.d/03_docker-entrypoint.sh

ADD ${WORKSPACE}/${JOB_NAME}/mysqlcustom.cnf /etc/mysql/conf.d/mysqlcustom.cnf

ENV MYSQL_DATABASE=jpetstore
ENV MYSQL_PASSWORD=jpetstore
ENV MYSQL_USER=jpetstore
ENV MYSQL_ROOT_PASSWORD=admin
