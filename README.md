# songr

## Lab Class 11
### Feature Tasks
As you work on these feature tasks, remember to consider your basic application setup. What classes should you create? How should they be related?

Ensure that you can run the Spring app.
Create a hello world route at /hello, and ensure that you can visit that route in your browser and see a rendered template come back.
Create a route that turns words into UPPER CASE. For instance, I should be able to visit /capitalize/hello and get back an HTML page containing the response HELLO, or I could visit /capitalize/this is Kinda Capitalized and get an HTML page containing the response THIS IS KINDA CAPITALIZED.
Create a basic splash page for the Songr app, available at the root route, and style it appropriately with CSS.
Create an Album class to act as a model in our app.
An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
Create a route at /albums that shows three album instances. (These will be hardcoded for today’s lab; create an array that contains three albums, and then display those three on the page.)

### Testing
Ensure you have tested the constructor, getters, and setters for the Album class.


## Lab Class 12
### Feature Tasks
Update your Album model so that it can be saved in a database.
An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
A user should be able to see information about all the albums on the site.
A user should be able to add albums to the site.

### App

* Access the Songr application by visiting `http://localhost:8080` in your web browser.

* To add a new album, click on the "Add Album" and fill out the form to add album.


## Lab Class 13
### Feature Tasks
* Create a Song model.
A Song has a title, a length (in seconds), a trackNumber, and the album on which that song appears.
Ensure that the relationship between Albums and Songs is appropriately set up.
* A user should be able to see information about all the songs on the site.
* A user should be able to view a page with data about one particular album.
* A user should be able to see the songs that belong to an album when looking at that album.
* A user should be able to add songs to an album.