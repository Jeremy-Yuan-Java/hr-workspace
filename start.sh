#!/bin/sh
echo "start to deploy ibms"
cmd="git clone  update"
workspace=/opt/src/business
projectdir=/opt/ibms/

cd $workspace
echo "enter into workspace, " `pwd`
git pull

for i in `ps -ef | grep  ibms.jar | grep java | awk '{print $2}'`
do
  echo $i
  kill $i
  sleep 3
done


datetime=`date +%Y%m%d%H%M%S`
echo $datetime

mvn clean install -Dmaven.test.skip=true
mv -f  ./target/business-*.jar $projectdir/ibms.jar

cd  $projectdir
java -server     -Xms512m -Xmx1g   -jar ibms.jar --spring.profiles.active=prod &
echo "ibms service is up..."