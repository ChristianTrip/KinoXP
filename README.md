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

| Method | Url                      | Description | Sample Valid Request Body |
|--------|--------------------------|-------------|---------------------------|
| GET    | /Customer                | Get all     |                           |
| GET    | /Customer  {Customer Id} | Get all     |                           |
| POST   | /Customer                | Create      |                           |
| PUT    | /Customer                | Update      |                           |
| DELETE | /Customer                | Detete      |                           |


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




