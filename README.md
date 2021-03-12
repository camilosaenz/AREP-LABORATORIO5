# Taller de Modularización con Virtualización e Introducción a Docker y a AWS

En el Taller de Modularización con Virtualización e Introducción a Docker y a AWS se comprendera el manejo de contenedores por medio de Docker sus funcionalidades y importancias ademas usando una maquina virtual de linux gracias a AWS podremos desplegar la aplicación web en la nuve y esta podra ser vista por cualquier persona, ademas se usara un motro de base de datos Mongo para almacenar las instacias que se hagan dentro de la app web, en este caso los mensajes almacenados por el usuario.
Tanto el codigo fuente Back, Front como los recursos utilizados fueron almacenados en contenedores luego desplegados en aws y almacenados en un repositorio en DockerHub.
## PRERREQUISITOS

Para la realización y Ejecución de este programa es necesario tener los siguiente programas:
* Maven
* GIT
* Java
* CircleCI
* Docker
* AWS
* MongoDB
* Plataforma de Codigo (Eclise, NetBeans, etc...)

## INSTALACIÓN
Para poder descargar e instalar el laboratorio es necesario seguir los siguientes pasos:
1. Abrimos desde nuestros Computadores un Interprete de Comandos (Ejempo: CMD de Windows).
2. nos ubicamos en la carpeta donde se desea descargar el laboratorio.
3. Para descargar el laboratorio utilizamos el siguiente comando desde nuestro Interprete de Comandos:
```
git clone https://github.com/camilosaenz/AREP-LABORATORIO5
```
4. Finalmente ya podemos abrir.

## EJECUTAR

Para poder ejecutar el laboratorio nos ubicamos en el directorio del laboratorio y luego abrimos un Interprete de Comandos y ejecutamos el siguiente comando:
```
mvn package
```

## DOCUMENTACIÓN
Para poder generar la Documentación del laboratorio es necesario escribir el siguiente comando en el Interprte de Comandos.
```
mvn javadoc:javadoc
```

## AWS

Esta app web cuenta con el siguiente link para poder comprobar su funcionalidad, se cuentan con dos link esto porque se manejan dos puertos diferentes para la aplicación

Puertos:
* 34000
* 8087

Links:
* http://ec2-54-87-52-77.compute-1.amazonaws.com:34000/
* http://ec2-54-87-52-77.compute-1.amazonaws.com:8087/

<p align="center"> 
  <img src="https://github.com/camilosaenz/AREP-LABORATORIO5/blob/master/img/AWS-despliegue.PNG?raw=true">
</p>




## CIRCLECI

Esta aplicación cuenta con todas las restriciones de CircleCI.

 [![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=svg)](https://app.circleci.com/pipelines/github/camilosaenz/AREP-LABORATORIO4)
 
## DESARROLO

Este laboratorio fue construido con las siguiente herramientas:
* [Maven](https://maven.apache.org/)
* [Java](https://www.java.com/es/)
* [GIT](https://git-scm.com/)
* [Eclipse](https://www.eclipse.org/)
* [CircleCI](https://circleci.com/)
* [AWS](https://www.awseducate.com/student/s/)
* [DockeHub](https://hub.docker.com/)
* [Mongo](https://www.mongodb.com/es)
 
## LATEX

Este proyecto cuenta con un [archivo](https://github.com/camilosaenz/AREP-LABORATORIO5/blob/master/AREP%20-%20LABORATORIO5.pdf) realizado completamente utilizando LaTeX por medio de la aplicacion [Overleaf](https://www.overleaf.com/project) y ademas cuenta con el [Proyecto.zip](https://github.com/camilosaenz/AREP-LABORATORIO5/blob/master/AREP%20-%20LABORATORIO5.zip) que contiene un archivo.tex que al abrir por cualquier compilador de LaTeX permite ver el documento .pdf realizado. 
 
## LICENCIA

[Licencia **GNU General Public License v3.0**](https://github.com/camilosaenz/AREP-LABORATORIO5/blob/master/LICENSE)

## DERECHOS DE AUTOR

Programa desarrollado por:
[RUBIAN CAMILO SAENZ RODRIGUEZ](https://github.com/camilosaenz)
