#Wildfly JakartaEE Archetype

A maven quickstart to create Wildfly ready JakartaEE project

##How to install

```
git clone https://github.com/fushji/wildfly-jakartaee-archetype.git
cd wildfly-jakartaee-archetype
mvn clean install
```

##How To use

```
mvn archetype:generate -DarchetypeGroupId=it.fushji.archetypes -DarchetypeArtifactId=wildfly-jakartaee-archetype -DarchetypeVersion=1.0.0 -DgroupId=com.example -DartifactId=demo-rest -Dversion=1.0.0
mvn clean wildfly:deploy
curl http://localhost:8080/demo-rest/rest/hello
```
