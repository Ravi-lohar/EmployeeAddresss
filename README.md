<div align = "center">
  <h1> EmployeeAddress</h1>
 </div>



## Framework and Language
* Java 
* SpringBoot

## Dependencies
  * SpringWeb
  * Lombok
  * Validation
  * JPA
  * My SQL Server
    
## Database Used 
  * Sql
    
## Data flow
  **The project has four main packages which are following** 
  
* Controller - Controller package has all the api and Crud operations.
* Services - Service class has all the business logic and it will return the result of that method which is called by controller class . 
* Repository - Respository has all the datasource in it i uses SQL Database
* Model - Model class has two main class with Employee and Address
> The flow of data is from controller has all the api and logics of that api has in service class and
service class is using the repository class which has all the data it keeps data source.The api called by user call the controller method
return the logic which is written in service class so service class object is called and service class use data source of repo class.

## Project Summary 
This is EmployeeAdress Project of Maping @One to one 
We can perfom following operation 
* Adding Employee
* Updating Employee
* Deleting Employee
* Getting details of employee by id
* Getting all the employee
* Adding Address
* Updating Address
* Deleting Address
* Getting details of Address by id
* Getting all the Address
> We can perform all of the above opration and i as i have mapped address to employe so we can directly update the addresss by employee also and many more
