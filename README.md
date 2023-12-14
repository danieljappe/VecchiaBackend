# REST API for Vecchia Maniera
A REST API for use on Vecchia Maniera's [Front-end website](https://vecchia-78929.web.app/). This API handles CRUD methods on data related to the business. 
### This includes:

* Menu items
* Orders for catering
* Employee logins

# Security
To ensure that the API is not being abused, several steps have been taken to make this API work only by intended users.
This is done by only enabling access from selected origins and requiring tokens from users, who have an account and is logged in.
However, a few requests can be done without authorization by token like getting the menu and logging in. 
Visitors cannot sign up for an account.

# Hosting
Both the REST API and the MySQL Database is hosted by Azure. The url for the deployed REST API is:
>https://vecchiabackend.azurewebsites.net


# Endpoints
The [Front-end website](https://vecchia-78929.web.app/)'s home page has access to the menu and logging in without a token. The requests used are:
> /employees/login

> /menuItems

Users that access this request need a username and a password, and then they get a token:
> /token

Users that log in, will receive a token to gain access to more:
> /menuItems/{id}

> /menuItems/create

> /menuItems/delete/{itemID}

> /menuItems/update/{id}

> /employees

> /employees/create

> /employees/delete/{id}

> /employees/{id}

> /employees/update/{id}

> /orders

> /orders/create

> /orders/delete/{itemID}

> /orders/{itemID}

> /orders/update


