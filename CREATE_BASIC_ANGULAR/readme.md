# PhoneBookApp

The PhoneBookApp is a web application for managing contact lists. It provides a simple CRUD (Create, Read, Update, Delete) interface for adding, viewing, editing, and removing contacts.

## Table of Contents
- ### [Frontend](#Frontend)
  - #### [Installation](#Installation-for-frontend)
  - #### [Usage](#Usage-of-frontend)
  - #### [Examples](#Examples-how-to-use-the-frontend-app)
- ### [Backend](#Backend)
  - #### [Installation](#Installation-for-backend)
  - #### [Usage](#Usage-of-backend)
- ### [Database](#Database)
- ### [Contributing](#Contributing)
- ### [License](#License)

### * Frontend
The frontend of the PhoneBookApp is built with Angular, following the MVC (Model-View-Controller) architecture. The frontend is responsible for rendering the user interface and handling user interactions. It communicates with the backend via HTTP requests to fetch and update data from the server.

- ### Installation for frontend
  To install the frontend of the PhoneBookApp, follow these steps:

  1. Clone the repository to your local machine.
  2. Navigate to the frontend directory.
  3. Run npm install to install the dependencies.
  4. Run ng serve to start the development server.

- ### Usage of frontend
  To use the frontend of the PhoneBookApp, open your web browser and navigate to http://localhost:4200. You should see the main page of the application, which displays the list of contacts. You can add, edit, or remove contacts by clicking on the corresponding buttons.

- ### Examples how to use the frontend app
  Here's an example of how to add a new contact:

  1. Click on the "Add New" button.
  2. Fill in the form with the contact's information.
  3. Click on the "Create" button.
  4. The new contact should appear in the list.

### * Backend
The backend of the PhoneBookApp is built with Node.js and Express.js. It handles all the requests and responses coming from the frontend, and it's responsible for connecting to the database to fetch and update data.

- ### Installation for backend
  To install the backend of the PhoneBookApp, follow these steps:

  1. Clone the repository to your local machine.
  2. Navigate to the backend directory.
  3. Run npm install to install the dependencies.
  4. Run npm start to start the server.
- ### Usage of backend
  The backend of the PhoneBookApp runs on http://localhost:8025 . It provides a RESTful API for managing contacts. Here are some examples of how to use the API:


     - GET /contacts: Returns a list of all contacts.

     - POST /contacts: Adds a new contact to the database.

     - GET /contacts/:id: Returns the details of a specific contact.

     - PUT /contacts/:id: Updates the details of a specific contact.

     - DELETE /contacts/:id: Removes a specific contact from the database.

     - You can use tools like Postman or cURL to test the API endpoints.

### * Database
The PhoneBookApp uses a Postgres database to store the contact information. The backend is responsible for connecting to the database and executing queries to fetch and update data. The database configuration can be found in the backend directory.

### * Contributing
To contribute to the PhoneBookApp, please follow these guidelines:

- Fork the repository to your GitHub account.
- Create a new branch for your changes.
- Make your changes and commit them.
- Push your changes to your forked repository.
- Submit a pull request to the main repository.


### * License
The PhoneBookApp is licensed under the MIT License. See the LICENSE file for details.
