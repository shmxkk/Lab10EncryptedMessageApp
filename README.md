## Lab 10 - EncryptedMessageApp

[javadoc](https://github.com/CSU-CompSci-CS163-4/Lab10EncryptedMessageApp/edit/main/README.md)
 
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
  [javadoc](javadoc/)

* The following classes will be modified:
   * [Contact](javadoc/Contact.html)
   * [Email](javadoc/Email.html)
   * [Message](javadoc/Message.html)
   * [PhoneNumber](javadoc/PhoneNumber.java)
   * [ShiftingCaesarCipher](javadoc/ShiftingCaesarCipher.html)
   * [SubstitutionCipher](javadoc/SubstitutionCipher.html)
    
At the **minimum** you will implement the *public* methods as listed
in each of the [javadocs](javadoc/), and you should implement
the field variables as we did. Note that they are  all ```final``` for this assignment. 
Details are given in the method description of how they are supposed to work. 

You are free to add additional methods to help you out! We will not
be grading your splashScreen or exitScreen, but we still encourage you to have fun
with them. 

Last but not least,  you **must** write tests for your methods in
a separate main method (see [javadoc](javadoc/) for details). You can run
this separate main method in intelliJ by clicking the green
arrow next to it. We will check to
make sure you wrote the tests. It is also common practice writing tests
for each of your classes you write to ensure they are correct before moving on.
This skill is essential for larger programs, and eventually your final summative project!

## Step 1: Self-Explanation
Take a look at:
1. The cleanNumber() method in [Contact](javadoc/Contact.html)
2. The TODOs in [PhoneNumber](javadoc/PhoneNumber.java)
3. The shift() and simpleCaesarEncode() methods in [ShiftingCaesarCipher](javadoc/ShiftingCaesarCipher.html)
4. The encrypt() method in [SubstitutionCipher](javadoc/SubstitutionCipher.html)
Brainstorm some ideas on how to implement these methods, and write your thoughts down.

## Step 2: Implementation
Follow the [javadoc](javadoc/) and implement the methods marked with `TODO`. Make sure to write tests for your code as you work on each method.

## Step 3: Self-Reflection
Please write a reflection about this program and show your TA or submit it online. Something to consider in your reflection -
this application is stateless. That means whenever the application closes all information
is lost, including the messages. How would you keep state between times when the application
runs? If you think about it, a word file is storing the 'state' of what you are
typing. What if you want to keep the messages for storing them later?

## Step 4: Finishing up
To turn in your assignment, click through the link on
Canvas, upload your files to the project and click submit for grading. Note you can do 
this more than once.

## Step 5: Going Further  
If you enjoyed this application, you really will want to look at the
[Networking and Cyber Security Concentration](https://compsci.colostate.edu/new-computer-science-major/)
for computer science (netsec). You can also learn more about the [field](https://en.wikipedia.org/wiki/Network_security).
Additionally, what happens if you scale the program up to 1,000,000 clients or more?
[Computing Systems](https://compsci.colostate.edu/new-computer-science-major/) is critical
to understanding how we scale applications for large audiences, among other areas.
