# Generator App
<p>The application is used to randomly assign members to four groups. The only criteria of assignment 
is member's experience level.</p>

 ## Table of Contents
* [General info](#general-info)
* [Technologies](##technologies)
* [Setup](##setup)
* [Features](##features)
* [Sources](##sources)

## General info
<p>The project has been created in cooperation with the participants of the Facebook group which 
I was part of. The group's goal was to learn programming in Java and to acquire cooperation skills 
in a team.</p>

## Technologies
<p>
    <li>Java 7+</li>
    <li>Maven</li>
</p>

## Setup
<p>You should define the "pathFile" variable before running the program. It allows you to use your own
members list. You can do that in MemberList class in method:</p>
    
    getAllMembersList()
    
<p>Next go to generator-app/src/main/java directory.<br>
Run the commands:</p>

    javac pl/generator/GeneratorApp.java
    java pl.generator.GeneratorApp
    
## Features
<p>
<ol>
    <li>Assigning members to four groups:
        <ul>
            <li>Cosmonauts</li>
            <li>Gamers</li>
            <li>Hollywood Wives</li>
            <li>Heroes</li>
        </ul>
    </li>
    <li>Assigning members based on their level of programming skills:
            <ul>
                <li>Starter</li>
                <li>Junior</li>
                <li>Ordinary</li>
                <li>Commando</li>
            </ul>
    </li>
    <li>Allowing the use of your own text file with the members list.</li>
</ol>
</p>

## Sources
<p>The inspiration to create the application was the need to evenly divide a group of 20 people 
with different level of programming skills, into four smaller groups.</p>
