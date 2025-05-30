# Assignment 4: Building a multi-screen App
## Objectives
Successfully create an Android project in Android Studio that utilizes Jetpack Compose and Kotlin to create an app that navigates through multiple screens.

Required reading:  Tips and Guidance for Video Submissions

## Tasks
- Note:  You should ALWAYS start with a new project in this course.
    - Choose the "Empty Activity" template for your new project.
    - Starting from anything else may result in hard-to-debug errors.
- This assignment leverages material in Unit 4 of Android Basics with Compose, notably app architecture and app navigation
    - Be sure to consult the course materials for help as needed
- Create a customized implementation of a subset of the following project in Part 3 of Unit 4 of Android Basics with Compose: Create a My City app 
    - The app will follow the general pattern described in this codelab, but you have some latitude in how it is implemented
    - You can choose your own city, or a different one if you like.  It must be an actual city with recommendations for actual places.
- The app will follow the general guidelines in steps 3 and 4 of the codelab, namely:
    - You must a provide a minimum of 3 categories of recommendations.  You can use some of suggested categories in step 3 and/or create your own.
    - Each category much have a minimum of 4 recommendations
    - The data for the recommendations and their related images can be selected however you see fit
    - The navigation between the category list, recommendation list, and recommendation details must follow the pattern shown in the diagram in step 4 of the codelab
- Each recommendation must consist of at least:
    - The name of the recommended location
    - The address
    - Some text to describe why you recommend it
    - An image related to the location
- The layout for the main screen should be similar to the format shown in Step 4
    - Have the name of the city at the top of the screen
    - Have each entry display the name of the category at minimum.  You may optionally add an image.
- The layout for each category screen should be similar to the format shown in Step 4
    - Have the name of the category at the top of the screen
    - Have each entry display the name of the recommendation at minimum.  You may optionally add an image.
- The layout for each recommendation should be similar to the format shown in Step 4
    - The name of the recommended place should be at the top
    - Have the image below the place name
    - Text below the image with the information in this order (on different lines):
        - The address
        - The description of why it's recommended
- Structurally, your app needs to be configured in the following manner in the package named after the project:
    - A subpackage named data, where your datasource class resides
    - A subpackage named model, where your custom data classes reside
    - The pre-created ui subpackage and the MainActivity.kt remain where they were when the project was created
- When you have implemented the app with these changes, run it on an Android emulator and record your screen per the instructions below.
    - Once recorded, upload your demo video as well as the code folder (details below) per the instructions provided

The app has to run without crashing.

## Notes
This is meant to be a very focused assignment.  Most apps involve multiple screens and navigation. Responding to a user selection and passing data based on that selection is a crucial skill.  Look for examples of similar functionality that you've implemented in other codelabs that will assist you in implementing this assignment.

Also, please be aware that when writing code, naming files, etc. it is crucial that everything be to specification.  Please know that any deviation from the instructions on any work in this course, however small, will lead to a deduction.

## What to turn in
When complete, submit:
1. A video recording of your computer screen that includes all of the following:
    1. Code editor displaying a part of the app’s file structure to demonstrate conformance with the required package structure listed above.
    2. Do a quick scroll through the entirety of the code in MainActivity.kt, your ViewModel derived class, navigation code, and your composable UI elements.
        1. Have a visible comment block in all code files in the format shown in the previous Assignments
    3. The app already running in the emulator.
    4. A display of interaction to include:
        1. The initial list of categories
        2. For each category:
            1. Select the category to navigate to its recommendations list
            2. Select a recommendation to navigate to its detail screen (pause long enough for us to read the contents)
            3. Navigate back to the recommendations list
            4. Select a second recommendation from the same category to navigate to its detail screen
            5. Navigate all of the way back to the category list
            6. Repeat as needed
2. A .zip file of your project's java directory with a name formatted like LNAME_FNAME.zip (e.g., SCOVIL_RANDY.zip)
