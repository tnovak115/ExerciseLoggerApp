# Exercise Logger App

This is a Google Pixel Watch app (designed around a rectangular interface) that lets the user log their weight-lifting exercises. It is designed after my exercise schedule, which consists of a push, pull, and legs day.

## Design
### Home Page

![alt-text](/imgs/apphomepage.png)

The home page features three buttons, indicating the three workout days.

### Exercise Page

![alt-text](/imgs/pullpage.png)

After clicking on an exercise day, a list of workouts is pressed. Clicking on any of these will prompt the user to a page where the user can log the amount of weight lifted. When the user scrolls to the bottom the user will find a "Back" button that will send the user back to the home page.

### Logger Page

![alt-text](/imgs/exercisepage.png)

This page allows users to input the weight they lifted for a specific exercise. By clicking the app's buttons, the user can add 5 or subtract 5 from the total weight the user lifted. After pressing the "Done" button the user is sent back to the home page and the data is sent into a SQL database.

### Database Format

![alt-text](/imgs/db.png)

### Future Updates
- Find a way to graph progress on each exercise
- Allow the user to view the graph of progress from the watch app
- Remember the last weight entered for each exercise, and next time the user clicks on the exercise the number shown is pre-set to the last weight lifted
- Allow support for adding new exercises
