# ToDo Specification
Created by nalaka on 5/24/2022

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

table: src/test/resources/todo_testdata.csv

* Add a new task as <taskName>
     
## User can add a new task
* <taskName> task is visible

## User can complete a task
* Select a task <taskName>
* Remaining items count is "0"

## User can check the completed task
* Select a task <taskName>
* Click on the Completed button
* <taskName> task is visible