#!/bin/bash

PURPLE='0;35'
NC='\033[0m' 
VERSAO=8
	
echo  "$(tput setaf 6)[Alprime]:$(tput setaf 7) Olá! Bem vindo ao sistema de totens da Alrpime!;"
echo  "$(tput setaf 6)[ALprime]:$(tput setaf 7) Vamos com a instalação do software! "

echo  "$(tput setaf 6)[ALprime]:$(tput setaf 7) Clonando o repositório..."
git clone https://github.com/GVRO1/alprime-azure

echo  "$(tput setaf 6)[ALprime]:$(tput setaf 7) Entrando na pasta da aplicação e instalando o maven (necessário a senha sudo)..."
cd ~/Área\ de\ Trabalho/alprime-azure/aplicacaoLocal/projeto-alprime-1.0
sudo apt-get install maven

echo  "$(tput setaf 6)[ALprime]:$(tput setaf 7) Buildando o projeto com suas depêndencias..."
mvn package

echo  "$(tput setaf 6)[ALprime]:$(tput setaf 7) Executando a aplicação..."
cd target
sudo java -jar projeto-alprime-1.1-1.0-SNAPSHOT-jar-with-dependencies.jar

# ===================================================================
# Todos direitos reservados para o autor: Dra. Profa. Marise Miranda.
# Sob licença Creative Commons @2020
# Podera modificar e reproduzir para uso pessoal.
# Proibida a comercialização e a exclusão da autoria.
# ===================================================================
