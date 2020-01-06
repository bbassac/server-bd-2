# ServerBD
Refonte de mon serveur en Spring Boot

#Build (Maven + JDK prérequis)

mvn clean package

#run

cd target

java -jar server-bd-2-1.0.jar

Ca lance dans un terminal le serveur : on doit voir à la fin :

2020-01-06 15:23:20.524  WARN 23948 --- [           main] collectionBD                             : ######################################\
2020-01-06 15:23:20.525  WARN 23948 --- [           main] collectionBD                             : #              LOADER                #\
2020-01-06 15:23:20.526  WARN 23948 --- [           main] collectionBD                             : ######################################\
2020-01-06 15:23:20.536  INFO 23948 --- [           main] s.Start                                  : Started Start in 7.466 seconds (JVM running for 8.512)\

Ouvrir un navigateur (genre chrome) et taper : \

http://localhost:8080/collection

On obtient le Json :
```
[
    {
        "id": null,
        "titre": "Bran le Maudit",
        "numero": "1",
        "couvertureUrl": "https://www.bedetheque.com/media/Couvertures/Arawn1_26012008_153221.jpg"
    },
    {
        "id": null,
        "titre": "Les liens du sang",
        "numero": "2",
        "couvertureUrl": "https://www.bedetheque.com/media/Couvertures/Arawn2_22012009_150322.jpg"
     }
]
```

# explications :

l'url /collection plan match avec le controlleur CollectionControleur et son '@RequestMapping("/collection")'
De la il apelle son repository( en gros la couche service) qui renvoie une liste de BD basiques

Et la magie de Jackson fait que quand le controlleur retourne une list<Bd>, ca la convertie en Json
 
 Si tu vas sur l'url : http://localhost:8080/
 Tu trouvera un lien vers une documentation générée automatiquement des ressources rest que tu peux tester en ligne avec les bouton try out
 
 
 