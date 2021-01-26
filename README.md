# Aspirateur

C'est un projet Maven dévelopé par le principe de TDD. Ce repo Git contient les branches suivantes :

  1. `Master` : Pointe sur la première version stable du projet(tous les tests passe dans ce commit).
  2. `Devlop` : Pointe sur les versions intermédiaires et stables du projet.
  3. `feature/unitTests : Pointe sur le développement des tests d'intégration des différentes fonctionnalités (aucun test qui passe dans cette branche).
  4. `feature/*` : Les branches des fonctionnallités du projet.
  
  ## Prérequis
  
   - Java 8
   - Maven
   - Intellij
   - Junit 5
   
  ## Utilisation
  
   1. Clôner le repo Git : `git clone https://github.com/iskanders/Aspirateur.git`
   2. Ouvrir le projet sur Intellij
   3. Utiliser les tests d'integrations suivants pour tester les differentes fonctionnalités du projet :
      - CleanUpServiceTests :
        - `CleanUpTest` : Permet de tester le fonctionnement de l'aspirateur :
          - Modifier les paramters de la fonction `initService` pour paramétrer la dimension de la grille et de positionner l’aspirateur.
          - Passer les instructions de l'aspirateur en parametre de la fonction `cleanUp` en format `String`.
        - `CleanUp_Move_Aspirator_out_of_room` : Utiliser ce test pour provoquer l'exception de l'AspiratorException. 
   
