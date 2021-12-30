## Lab 10 - EncryptedMessageApp
 
## Scenario 
You have been hired to build a simple console/terminal based program that either encrypts
a String using a [Caesar Cipher](https://en.wikipedia.org/wiki/Caesar_cipher), or 
that performs a [Lossy Compression](https://en.wikipedia.org/wiki/Lossy_compression). You
will also be given the challenge activity to write a [Run-Length Encoder](https://en.wikipedia.org/wiki/Run-length_encoding)
which is a lossless data compression scheme. 

While the Encrypted Message App is relatively simple, it is actually at the
heart of a lot of internet/networking traffic. Any traffic on the internet goes
through other computers, and even the neighbor sitting next to you has the ability to
analyze the packets of information you are sending. Encrypting such information becomes
critical for a security layer. While most encryption is more complicated than this class,
a cipher is a way to start thinking about it. Furthermore, sending data
online is expensive, and the more we can compress that data the faster and cheaper
it is to send it. All modern websites compress the data before it arrives at your browser, 
and then it is uncompressed. With some compression you loose a bit of original information,
but you can still understand it (JPEG images). In other compression algorithms
the information is fully reproducible (lossless), but at a greater expense. 
The Encrypted Message App helps you explore these concepts. 


## Requirements
The App will take in client input from the commandline, simply asking for a message
and then a scheme to follow. The application will manipulate the message and simply
print out the result. The program will continue to loop until someone types exit for the
message. 

Here are some examples of the program running:

```text
=== Practical 2 ===
Enter Message: the answer to the ultimate question of life, the universe, and everything.
Cipher,Encode,Compress: compress
th answr t th ultmt qstn of lf, th unvrs, and evrythng.
Enter Message: Ada is cool
Cipher,Encode,Compress: cipher:2
Cfc"ku"eqqn
Enter Message: AAAAbbbccccdddeeee
Cipher,Encode,Compress: encode
4A3b4c3d4e
Enter Message: exit
Have fun!
```

###  Program Specifications: 

*  The options for manipulation are:
   * cipher:N - where N is the amount of caesar cipher shift
   * encode - (OPTIONAL)  performs run-length encoding
   * compress - removes all vowels from words, unless the vowel starts a word.
* The message can be anything, but once ```exit``` (lowercase) is typed, the program ends. 
* The program will print the message to the screen with the modification and repeat. 


### Coding Specifications
For grading purposes, we are asking you to follow this format:
  [javadoc](javadoc/allclasses-index.html)

* The following classes will be modified:
   * [Contact](javadoc/Contact.html)
   * [Email](javadoc/Email.html)
   * [Message](javadoc/Message.html)
   * [PhoneNumber](javadoc/PhoneNumber.java)
   * [StringManipulator](javadoc/StringManipulator.html)
    
At the **minimum** you will implement the *public* methods as listed
in each of the [javadocs](javadoc/), and you should implement
the field variables as we did. Note that they are  all ```final`` for this assignment. 
Details are given in the method description of how they are supposed to work. 
Most of your work will be in StringManipulator.java. 

You are free to add additional methods to help you out! We will not
be grading your splashScreen or exitScreen, but we still encourage you to have fun
with them. 

Last but not least,  you **must** write tests for StringManipulator.java in
a separate main method (see [javadoc](javadoc/) for details). You can run
this separate main method in intelliJ by clicking the green
arrow next to it. We will check to
make sure you wrote the tests. It is also common practice writing tests
for each of your classes you write to ensure they are correct before moving on.
This skill is essential for larger programs, and eventually your final summative project!

##  Where to Start?
Here are some hints on how to start:

1. Write down on paper what you want to do! 
   * Do you understand the specifications? If not, ask on MS Teams!
   * Draw out the program flow. Can you picture how the program will work?  
    The picture doesn't have to be clear, but seeing a picture can help you see
    how classes interact.
2. Look at the problems, divide and conquer.
   * What do you know how to do?
   * Are you confident on the user input part and writing to console? Start in [EncryptedMessageApp](javadoc/EncryptedMessageApp.html).
   * Are you more interested in tackling the cipher or compress? Start in [StringManipulator](javadoc/StringManipulator.html)
3. DON'T write everything at once.
   * Make sure to write a few lines at a time, compile, repeat - really
   * Try to figure out ways to test. When we started, we would just run the program
     without any of it working, but it was displaying. We then wrote 'empty' methods often
     returning a String that was just the method name, to make sure our 'if' statement
     was calling the correct method.  

The hardest part of this assignment is **starting** and **setup**. Make sure to do that
right away and get *something* showing up on your screen. 



## Finishing up
To turn in your assignment, click through the Practical 2 link on
Canvas, upload your files to the project and click submit for grading. Note you can do 
this more than once, as there is probably a test case you all forgot.

Please complete the reflection in Canvas. Something to consider in your reflection -
this application is stateless. That means whenever the application closes all information
is lost, including the messages. How would you keep state between times when the application
runs? If you think about it, a word file is storing the 'state' of what you are
typing. What if you want to keep the messages for storing them later?

> **Going Further**  
> If you enjoyed this application, you really will want to look at the
> [Networking and Cyber Security Concentration](https://compsci.colostate.edu/new-computer-science-major/)
> for computer science (netsec). You can also learn more about the [field](https://en.wikipedia.org/wiki/Network_security).
> Additionally, what happens if you scale the program up to 1,000,000 clients or more?
> [Computing Systems](https://compsci.colostate.edu/new-computer-science-major/) is critical
> to understanding how we scale applications for large audiences, among other areas.

# Lab 09 - 

Today's lab will focus on conditionals, or `if`, `else if`, and `else` statements, while also reviewing `Strings`. 

## Step 1: Compiling 
Take a moment to look through the provided code for the lab. If you end up running the code at this moment, you will find there is a *Syntax Error* and the code won't compile. (hint: The syntax error is the method that has the 'Step 1' comment).

Fix this syntax error now. While there are many ways to fix it, we suggest simply putting in a `return "";` at the bottom of the method for now. Compile / run the code. 

## Step 2: Self-Explanation
Reading through the `laneCheck(int)` method, you should write out *in your own words* what you think the code does. What happens when certain parameters are passed into the method? How does it respond? Write directly in your code as a comment above the method. It is alright to talk it out, but know it is not important that you get it correct! It is more important that you write out what you think. 

## Step 3: Runtime Errors
It is possible to have your code run, and it not run correct. Take a moment to open the [javadoc](javadoc), and review the `laneCheck(int)` method. The javadoc provides a description of the method, including given a certain input, you should have a specific output. Using that method **description**, ask yourself the following questions:

1. How well does it match your self-explanation of the method?
2. Does the code do what is described in the javadoc? If so, you are good, if not - write notes about what it isn't doing right (you can add them as comments to the file)
3. Look at the code, does it match the following diagram of how the if statements should be working?


Now take a moment to run the code. You will notice the `main` method is calling a test method `testLaneCheck()`. It is *very common* (required in industry) to test every method you write! This lab mimics that idea, and we have tests for every method. When you run the program, you will find the tests aren't doing what you it should be doing!

**Your action** Fix the method so it passes the tests and matches what is described in the javadoc. 

## Step 4: Working with Strings
Look at `streatLight1()`. When you ran the tests in Step3, you will have noticed that this method is also failing tests! However, the return types seem correct. Take a moment to look through this method, and work on the following:

1. Create a diagram similar to the example in Step 3. 
2. Fix this method so that it works. 
3. Describe in your own words (as the comment) why you needed to make the change that you made. 


## Step 5: Tree Diagrams and Testing
Creating Tree Diagrams are extremely helpful in working out your logic, and while the logic for these problems are 'simple', as your logic gets more complex, you will thank yourself for creating it. Create a tree diagram for `streetLight2A(String)` and `streetLight2B(String)`.

Compare the diagrams, are they functionally the same or different? 

Look at `testStreeLight2AB()`. Looking at the *tree diagram* write tests that test every 'path' of that tree. Similar to the tests for the past two methods, but you should ask yourself if you tested every condition of `streetLight2A(String)` and `streetLight2B(String)`.

Now, change the `.equalsIgnoreCase()` in `streetLight2B(String)` to `.contains()`. How did this change the tests you wrote? Why did some of them end up failing (if any). Can you write a test that causes a failing condition?


## Step 6: Turning In / Receiving Credit

To recieve credit for this lab you need to do the following:
1. In Zybook, submit the lab for grading (after clicking through the canvas link again!).

2. On-campus students, have a TA look over that you completed the self-explanations, your diagrams, and the tests you created (we are not autograding those). Just show what you completed at the end of the course period, even if it isn't fully complete.

3. Online students, there will be a discussion assignment in canvas. Copy your self-explanations, your diagrams, and your tests you created as part of the discussion post. A TA will review your submission. 


## Step 7: Extra Practice (optional) 
Look at `streetLight3(String)`. Create a tree diagram for it, along with additional tests (don't forget to add a method call to those tests in main). Ask yourself the following questions:

* Are the 'else if' statements in streetLight3() necessary? 
* Or could we substitute in an 'if' in this case and not change the functionality of our code?
* If instead of .equalsIgnoreCase() we used .contains(), would your answer still apply?


## Additional Background Information
Read through the following if you are stuck, or simply seek better understanding of if/else statements. 


## Javadoc
[javadoc](https://github.com/CSU-CompSci-CS163-4/Lab09/tree/main/javadoc)
