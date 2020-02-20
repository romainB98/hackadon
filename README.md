# hackadon
Projet FSH – Documentation Technique










Introduction :

Dans cette action du Hackadon mais aussi pour amis FSH c’est mobilisé 2 jours pour apporter une solution de rassemblement pour les patients atteint de cette maladie et d’information sur celle-ci et les outils pour vivre avec cette maladie.







Objectifs :

Après un échanges avec Pierre Laurien et Sandrine, un constat assez simple c’est fait, très peu de patient atteint de cette maladie la connaisse vraiment. Cette maladie concerne environ 8 000 personnes en France et ces individus peuvent se rassembler, échangé sur de possible question sur la maladie ainsi que les aménagements humains et matériels qui peuvent exister.















Définition, acronymes, glossaire :


1.	AndroidStudio : AndroidStudio est une IDE spécialisé dans le développement d’application mobile Android. Elle utilise principalement les langages Java et Kotlin.
2.	IDE : un environnement de développement est un ensemble d'outils qui permet d'augmenter la productivité des programmeurs qui développent les logiciels. 
3.	JAVA et KOTLIN : Ce sont deux langages de programmations qui sont utilisé pour les applications Android.

4.	MySQLite : C’est un système qui permets de gérer une base de donnée de façon plus légère ce qui est très intéressant pour une application.

5.	SQL : est un langage basé sur un système de requête qui permet d’enregistrer et de récupérer des données.




Choix techniques :


Nous avons été obligées de faire des choix en fonction du très court temps que nous avions ainsi que du besoin qui nous a été exprimé mais aussi de leurs faisabilité technique et dans le temps.

Pour ma part la solution qui se prêtait le mieux à notre situation étais de créer une application à l’aide d’AndroidStudio dans un premier temps et dans une possible continuité de projet, faire une application en Swift qui est un langage de programmation de d’application Apple, qui sont a eux deux les leaders du marché des applications sur smartphones.
AndroidStudio dispose d’une interface plus simple a utilisé et de part ses liens avec Google, les applications Android sont mieux disposé à intégrer des Api Google tels que translate.







Exigences spécifiques:

Il n’y a pas eu d’exigences techniques spécifiques en particulier bien au contraire, ce projet nous laissait une réelle liberté qui malgré tout était contrainte par le temps.

Les besoins nous ont été clairement spécifiés, nous devions en priorité donnée de l’information sur la maladie du fsh, des informations nutritives ainsi que des exercices sportifs.
 
Base de données :

J’ai choisi d’utilisé SQLite afin de pouvoir enregistrer les informations de l’utilisateur en locale, et gérer la partie communauté que nous avions envisagé. 

Architecture technique :

L’architecture repose sur une organisation déjà ‘donnée ‘ grâce à l’ide et repose sur trois grandes parties, qui sont l’aspect physique, la partie interaction ainsi que la gestion des données que j’ai importées au sein de l’ide grâce à SQLite




Sécurité :

Pour protéger un maximum les utilisateurs et leurs données personnelles et confidentielle qui sont stockées en locale et non en réseaux. Seul le pseudo et un possible avatar apparaîtront aux autres membres de la communauté.





