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

| Method  | Url               | Description             | Sample Valid Request Body |
|---------|-------------------|---------------------   -|---------------------------|
| GET     | /movie            | Get all movie           |                           |
| GET     | /movie/{movieId}  | Get a movie by Id       |                           |
| POST    | /movies           | Create a movie          |                           |
| PUT     | /movies/{movieId} | Update a movieId by Id  |                           |
| DELETE  | /movies/{movieId} | DELATE a movieId  by Id |                           |
###### Customer
Create = Post.
Read = Get.
Update = PUT.
Delete = Delete.

| Method | Url                      | Description   | Sample Valid Request Body |
|--------|--------------------------|---------------|---------------------------|
| GET    | /Customer                | Get all       |                           |
| GET    | /Customer  {Customer Id} | Get all       |                           |
| POST   | /Customer                | Get all       |                           |
| PUT    | /Customer                | Get all       |                           |
| DELETE | /Customer                | Get all       |                           |

####### Reservation
Create = Post.
Read = Get.
Update = PUT.
Delete = Delete.

| Method | Url                    | Description            | Sample Valid Request Body |
|--------|------------------------|------------------------|---------------------------|
| GET    | /                      | Get all                |                           |
| GET    | /                      | Get all                |                           |
| POST   | /                      | Get all                |                           |
| PUT    | /                      | Get all by Id          |                           |
| DELETE | /                      | Get all by Id          |                           |

######## ?
Create = Post.
Read = Get.
Update = PUT.
Delete = Delete.

| Method | Url              | Description        | Sample Valid Request Body |
|--------|------------------|--------------------|---------------------------|
| GET    | /                | Get all            |                           |
| GET    | /  | Get all     |                    |
| POST   | /                | Get all            |                           |
| PUT    | /                | Get all            |                           |
| DELETE | /                | Get all            |                           |




