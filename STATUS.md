Short description:
The application is functional (link below):
https://victorious-bush-0e1b05903.2.azurestaticapps.net

Progress so far:
We've finished all the functional requirements provided from the first meeting with the product owner.
Most, if not all of the frontend code is applicable to the functionality that would have been implemented in the backend
(sprint 2/requirements from second meeting with product owner).
As for the backend code, we have yet to accomplish the finalization of the creation of a reservation.

Jacob:
**insert personal accomplishments**

Theis:
**insert personal accomplishments**

Robert:
**insert personal accomplishments**

Christian:
Jeg startede ud med at lave et klasse- og EER- diagram så vi havde noget at arbejde ud fra.
Jeg påtog mig opgaven at lave et GitHub repository, både for backend- og frontend-delen, hvor jeg inviterede de andre fra gruppen. 
Ud fra vores klassediagram lavede jeg det første projekt (dependencies, start klasser, pakke struktur) der blev til vores backend repository (KinoXP).
Ligedes stod jeg for at oprette alt der relaterede sig til deploye delen på Azure. Det vil sige virtuel machine, app service, static web app. Vores skole Azure license tillod os ikke at dele adgang til disse ressourcer, så det var kun mig der havde adgang til det. 
På vores VM installerede jeg Docker, og oprettede et image hvor vi lavede vores MySql database.
Jeg oprettede også en SSH nøgle som vi alle fik lagt ned lokalt, så vi alle kunne tilgå vores VM og herved vores Docker miljø som kørte vores database.
Herudover arbejde jeg på Movie klasserne (repository, service, controller, dto’er, tests).
Jeg lavde også vores Enum klasser (Theaters, ShowingTimes, Genres) og seat klassen.
Jeg arbejde også på at få vores reservations klasser til at fungere, men det blev aldrig færdiggjort da vi løb tør for tid og løb ind i problemer med at reservere flere seats, som vi ikke kunne løse.

Andreas:
Jeg har været meget indenover vores github branching samt actions og i fælleskab har vi kæmpet med opsættelsen af Azure samt docker. Envidere havde vi nogle problemer med antal af connection til vores database som lukkede adgangen for query's. Det fik vi løst ved at genstarter hele docker images samt øge antallet af connections i SQL så vi ikke løb ind i samme probblem. Kodemæssigt har jeg hovedesagligt siddet på frontend og har mer eller mindre været indover alle filerne HTML / CSS  / JS.
Backend har jeg som udgangspunkt kun arbejdet i under opsættelse eller hvis jeg skulle fortage nogle ændringer, så det gav mening i forhold til frontend. Vi oplevet nogle problemer med at have mer end et modal med identiske input elemters id. Det fik vi løst vha. af en if sætning der ændrer i inputes id afhængig hvilken function der blev kaldt f.eks. "<input id="id-column-" + "delete">". Jeg vil gerne have opdelt nogle functionerne i flere filer/mapper så koden blev mer læsbar, såsom optionsForDropdowns() men det var der desværre ikke tid til. Vi nåede aldrig færdigegøre reservation, men baseret på det eksisterende frontend kan meget af koden genbruges til dette. 




Reflection on the value of the last two project weeks:
We've been forced to deal with much troubleshooting in regards to the technical aspects of the project.
Specifically, the deployment of the database proved to cause some issues, and furthermore triggered a chain reaction of other minor problems that ultimately hindered our collective flow (at least in the inception of the project).

As a result of this hinderance, we weren't able to delegate tasks as effectivly in the beginning, which meant that most of the time was spent around a single computer, contemplating and discussing questions related to the future course of the project.
After these initial hurdles we were however much better at effectivly spreading out the workload (this being from the beginning of the second sprint/iteration).

Looking back, we would have liked to be a little more structured in our approaches.
The frequency in which we conducted these Scrum meetings were too far in between, and additionally, when we held them, they tended to far exceed the goal of 15 minutes.

We would also have liked to more so utilize the opportunity that this project has been.
For the most part, the members worked on the things that they were already good at, which is just a waste.

On the brighter side, we've had a good time working together, despite the group being a mashup of people not having worked together previously.



Link to group presentation:
https://youtu.be/1-x75i0PVfM

