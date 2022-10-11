# KinoXP
First group Assaignment. We are the Couch potatos

## Explore Rest APIs (also known as Restful API)
The app defines following CRUD APIs.
API = application programming interface.
REST = architectural style.
REST = stands for representational state transfer and allows for interaction with RESTful web services.

### Annotations
Java annotations are metadata (data about data) for our program source code.
They provide additional information about the program to the compiler but are not part of the program itself. 
These annotations do not affect the execution of the compiled program.

#### JPA
JPA bruger objektet som skabalon til at oprette databasen.
Måden JPA gør dette er et @Entity
Dette er selve Objektet.
Objektet sikker alt der sker  i databasen.

##### Movie
Create = Post.
Read = Get.
Update = PUT.
Delete = Delete.

| Method | Url                | Description | Sample Valid Request Body |
|--------|--------------------|-------------|---------------------------|
| GET    | /movie             | Get all     |                           |
| GET    | /movie  {Movie Id} | Get all     |                           |
| POST   | /movies            | Create      |                           |
| PUT    | /movies            | Update      |                           |
| DELETE | /movies            | Delete      |                           |

###### Customer
Create = Post.
Read = Get.
Update = PUT.
Delete = Delete.

| Method | Url                        | Description | Sample Valid Request Body |
|--------|----------------------------|-------------|---------------------------|
| GET    | /Customers                 | Get all     |                           |
| GET    | /Customers/{CustomerEmail} | Get all     |                           |
| POST   | /Customer                  | Create      |                           |
| PUT    | /Customer/{CustomerEmail}  | Update      |                           |
| DELETE | /Customer/{CustomerEmail}  | Detete      |                           |


####### Reservation 
Create = Post.
Read = Get.
Update = PUT.
Delete = Delete.

| Method | Url                    | Description | Sample Valid Request Body |
|--------|------------------------|-------------|---------------------------|
| GET    | /                      | Get all     |                           |
| GET    | /                      | Get all     |
| POST   | /                      | Create      |                           |
| PUT    | /                      | Update      |                           |
| DELETE | /                      | Delete      |                           |




The Couch Potatoes - Gruppekontrakt
KinoXP
Medlemmer:

Andreas Hjort - andreas.hjort28@gmail.com - 20876707
Robert Witt Hansen -  funky.junky.mails.goes.to.jail@gmail.com - 60829282
Jacob Vermehren - jacobuhlig@gmail.com - 22997992
Theis Aslak Langelo - theislangelo@gmail.com - 53767668
Christian Sandholdt Trip - christianstrip@gmail.com - 61340812


Scrum master: Jacob


Dage til fremmøde: F: Fysisk - T: Teams

Uge 40:

Mandag - 08:00 - 12.00	  F
Tirsdag - 12.30 - 16.00   F
Onsdag - 08:00 - 12.00	  F
Torsdag - 12.30 - 16.00   T
Fredag - 08:00 - 12.00	  F

Uge 41: 

Mandag - 08:00 - 12.00	  T
Tirsdag - 12.30 - 16.00   F
Onsdag - 08:00 - 12.00	  T
Torsdag - 12.30 - 16.00   F
Fredag - 08:00 - 12.00	  T


Gruppe discipline: 
-	Hvis man kommer forsent informerer man gruppen.
-	Arbejder starter seneste 10 min efter mødepligt.
-	Daily scrum meeting
-	Opdater Scrum board
-	Opstår der uenigheder imellem gruppemedlemmer, så tages det op til fællesmøde.


Environment: 
Teams
Skole


Github - Branching:
(Pull request) hvor vi arbjeder på funktionsbaserede branches der slettes efter de er blevet revideret af et andet teammedlem og derigennem tilsluttet sig til main branchen.
