# Lab Report 5 - Putting it All Together

## Part 1 – Debugging Scenario
**Student A:** After I ran the ```test.sh``` to test my ```ListExamples.java```, I am not sure if my bash script is correct but I feel my merge method has bad implementations.
<br>![file_structure](https://igiotto12.github.io/cse15l-lab-reports/screenshots/lab5-p1.png)
<br>![failing_output](https://igiotto12.github.io/cse15l-lab-reports/screenshots/lab5-p2.png)

**TA:** Yes, the output of Junit tests show that ```testMerge1``` and ```testMerge2``` failed. Your bash script should be fine but can I see the content of your java program? Try using ```vim``` to navigate it so we can further edit on that. 
     
**Student A:** ![vim_java](https://igiotto12.github.io/cse15l-lab-reports/screenshots/lab5-p3.png)

**TA:** Great, I see the issues now. If you take a look of your while loop in merge method, the loop ends before appending all elements in both list1 and list2. This is because you set the condition to be ```a && b```, however, the codes inside of if statement block will never execute because the while loop ends at first. I suggest that change the logic to ```a || b``` and modify the behavior of appending the list subsequently. 

**Student A:** Oh yes, after I modified the logic a little bit it works perfectly right now! Thanks:>
<br>![modified_java](https://igiotto12.github.io/cse15l-lab-reports/screenshots/lab5-p4.png)
<br>![test_success](https://igiotto12.github.io/cse15l-lab-reports/screenshots/lab5-p5.png)

## Part 2 - Reflection
The most significant takeaway from the second half of labs for cse15L is about processor. Java processor is the medium to for the communication between the program and the terminal. By integrating bash commands with java programs, now I can write an autograder just like Gradescope. It is done by breaking down the grading process into steps of re-directing outputs or errors, then my program can analyze these outputs. After this, I learnt how to edit codes from command line and push to the github just like how to contribute toward a tech-company's repository in real life. One thing I found impressive is using JDB command to stop the program at certain breakpoint, so I can keep track of how variables update through the process.  
