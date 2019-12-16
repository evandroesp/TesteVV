#!/bin/bash

DIR=~/TesteVV

SIKULI="sikulix-2.0.1.jar"
SIKULI_DIR=${DIR}/Sikuli

LAMP="xampp-linux-x64-7.1.33-1-installer.run"
LAMP_DIR=${DIR}/LAMP

echo -e "\e[1;32m Atualizando...\e[0m"
sudo apt update

sudo cp start_vv.sh ${DIR}/start_vv.sh
sudo mv -f vv_final.sql ${DIR}/vv_final.sql
sudo mv -f sikuliProj.sikuli ${DIR}/sikuliProj.sikuli
sudo mv -f Trabalho2_Evandro ${DIR}/Trabalho2_Evandro

echo -e "\e[1;32m Instalando git...\e[0m"
sudo apt install git
git --version

echo -e "\e[1;32m Preparando ambiente...\e[0m"
#sudo rm -r ${DIR}/java
#mkdir -p ${DIR}/java

echo -e "\e[1;32m Instalando JDK\e[0m"
sudo apt install openjdk-11-jdk -y

#echo -e "\e[1;32m Instalando Apache\e[0m"
#sudo apt install apache2 -y

#echo -e "\e[1;32m Instalando mysql-server\e[0m"
#sudo apt install mysql-server -y
#sudo mysql -u root -p < vvTrabFinal.sql

#Download LAMP (XAMPP)
if [ -f "${LAMP_DIR}/${LAMP}" ]
then
	echo "$LAMP Encontrado!"
else
	#echo "$LAMP not found."
	sudo rm -r ${LAMP_DIR}
	mkdir -p ${LAMP_DIR}
	wget -P ${LAMP_DIR} https://www.apachefriends.org/xampp-files/7.1.33/xampp-linux-x64-7.1.33-1-installer.run
fi

echo -e "\e[1;32m Preparando Requisitos para Sikuli\e[0m"
sudo apt install libopencv3.2-java -y
sudo apt install tesseract-ocr -y
sudo apt install wmctrl -y

sudo ln -s /usr/lib/jni/libopencv_java320.so /usr/lib/libopencv_java.so

echo -e "\e[1;32m Instalando Sikuli\e[0m"

#teste
#sudo rm -r ${SIKULI_DIR}
#echo -e "\e[1;32m ${SIKULI_DIR}/${SIKULI}\e[0m"

if [ -f "${SIKULI_DIR}/${SIKULI}" ]
then
	echo "$SIKULI Encontrado!"
else
	#echo "$SIKULI not found."
	sudo rm -r ${SIKULI_DIR}
	mkdir -p ${SIKULI_DIR}
	wget -P ${SIKULI_DIR} https://launchpad.net/sikuli/sikulix/2.0.1/+download/sikulix-2.0.1.jar
	wget -P ${SIKULI_DIR} https://repo1.maven.org/maven2/org/python/jython-standalone/2.7.1/jython-standalone-2.7.1.jar
fi

java -jar ${SIKULI_DIR}/${SIKULI} -r ${DIR}/sikuliProj.sikuli
