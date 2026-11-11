PROJET INF461 - PATRON SINGLETON

Organisation :
- Cours : reproduction de l'exemple du support INF461.
- Modifie : gestionnaire unique d'une application.
- Diagrammes : diagrammes UML au format SVG.
- Livraison : sources, diagrammes, tests et rapports.

COMPILATION :
Dans le dossier Cours :
javac -encoding UTF-8 *.java
java Client

Dans le dossier Modifie :
javac -encoding UTF-8 *.java
java Client

PRINCIPE :
Singleton garantit qu'une classe ne possede qu'une seule instance.
Le constructeur est prive et getInstance() fournit le point d'acces.