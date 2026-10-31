> Create a directory for the project
> Create a file called app.py in your project directory with app code
> Create another file called requirements.txt in your project directory for app dependencies
> Create a Dockerfile and add required commands
> Define services in a Compose file - Create a file called docker-compose.yml in project directory
From project directory, start up application by running 'docker compose up'
> Enter http://localhost:8000/ in a browser. Message will appear.
'Hello World! I have been seen 1 times.'
> Add watch feature if everything works good. Whenever a file is changed, 
Compose syncs the file to the corresponding location
under '/code' inside the container. Once copied, 
the bundler updates the running application without a restart.
> From project directory, type 'docker compose watch' or 'docker compose up --watch' to build and launch the app

