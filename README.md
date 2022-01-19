# Repository for shopify backend challenge


## What you need

<ul>
 <li> Java 1.8 </li>
 <li> Maven >= 3.1 </li>
 <li> Your favorite IDE to import the code.</li>
</ul>

I used [Spring Tool Suite (STS) 4.9.0.RELEASE](https://spring.io/tools)

## Major Components

Springboot, Thymeleaf, H2 (in-memory database), Maven, and embeded Tomcat server. <br/>
A list of dependecies is available in [pom.xml](https://github.com/ptrpengdev/shopify-backend-challenge/blob/main/pom.xml)<br/>


## Features
<ul>
 <li> Inventory Items Retrivial</li>
 <li> Update/Delete Item</li>
 <li> Create Inventory Items</li>
 <li> Create Location</li>
</ul>
 


## Run the Application
Download and unzip the source code in this repository, or clone it using <b> Git: </b> `git clone https://github.com/ptrpengdev/shopify-backend-challenge.git` <br/>

Once downloaded, open STS or your favorite IDE to import the project. <hr/>
Here I use STS as example.<br/>

<div> <b>Steps 1</b>: Open STS(IDE), right click on package explorer and select import. </div>
<div> <b>Steps 2</b>: Select existing maven projects </div>
<div> <b>Steps 3</b>: For root directory, select the git repository folder cloned from https://github.com/ptrpengdev/shopify-backend-challenge.git and click finish</div>
<div> <b>Steps 4</b>: Once the project is imported, update the project via right click on the project. <b>OR</b> run <b>mvn clean install</b> </div>
<div> <b>Steps 5</b>: Select the project and run as spring boot app. <b>OR</b> run <b>mvn spring-boot:run</b>   </div>
<div> <b>Steps 6</b>: Once application completed initialization, go to browser and type: <b>localhost:8080/app/index </b>. Server port and context root are available to change in src/main/resources/application.properties</div> 
<hr/>
<p align="left">

<img src="https://github.com/ptrpengdev/shopify-backend-challenge/blob/main/readme_img/import1.png"  height="400" width="400">

<img src="https://github.com/ptrpengdev/shopify-backend-challenge/blob/main/readme_img/import2.png" height="400" width="400" >

<img src="https://github.com/ptrpengdev/shopify-backend-challenge/blob/main/readme_img/import3.png"  height="400" width="400" >

<img src="https://github.com/ptrpengdev/shopify-backend-challenge/blob/main/readme_img/update_maven.png" height="400" width="400" >
<img src="https://github.com/ptrpengdev/shopify-backend-challenge/blob/main/readme_img/run.png" height="400" width="400" >
<img src="https://github.com/ptrpengdev/shopify-backend-challenge/blob/main/readme_img/index.png" height="400" width="400" >

</p>


