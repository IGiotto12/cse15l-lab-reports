#**LAB Report 4 Vim**

**Steps:**
1. Log into ieng6       
- Key pressed: ```ssh jiw188@ieng6.ucsd.edu``` ```<enter>```
- <br>![first step](https://igiotto12.github.io/cse15l-lab-reports/screenshots/p1-lab4.png)
- In the terminal, I typed ssh command with my virtual machine account and entered. It automatically logged in without password because I had my ssh  in my local computer.
        
2. Clone your fork of the repository from your Github account (using the SSH URL)      
- Key pressed: ```git clone ``` ```<Ctrl-v>``` ```<enter>```
- <br>![second step](https://igiotto12.github.io/cse15l-lab-reports/screenshots/p2-lab4.png)
- I typed the ```git clone``` command and pasted the ssh key copied at the clipboard.
            
3. Run the tests, demonstrating that they fail
- Key pressed: ```cd l<tab>``` ```<enter>``` ```bash t<tab>``` ```<enter>```
- <br>![third step](https://igiotto12.github.io/cse15l-lab-reports/screenshots/p3-lab4.png)
- I then change the working directory to lab7 using shortcuts by ```tab```, and typed bash command to run the bash script started with letter "t", which is ```test.sh``` in the directory.
        
4. Edit the code file to fix the failing test
- Key pressed: ```vim L<tab>.<tab>``` ```<enter>``` ```?xlr2:wq!``` ```<enter>```
- <br>![fourth step](https://igiotto12.github.io/cse15l-lab-reports/screenshots/p4-lab4.png)
- Use ```vim``` to edit the ListExample.java, then I typed question mark to quickly search for "x" and moved right one space. Then I used ```r``` to replace the number '1' to '2'. At the end, I used the quit and save command. 

5. Run the tests, demonstrating that they now succeed
- Key pressed: ```bash t<tab>``` ```<enter>```
- <br>![fifth step](https://igiotto12.github.io/cse15l-lab-reports/screenshots/p5-lab4.png)
- As I did in step 3, I typed the bash command to run the test script. 

6. Commit and push the resulting change to your Github account (you can pick any commit message!)
- Key pressed: ```git commit <tab>```<.>```<tab>``` ```<enter>```
- <br>![sixth step](https://igiotto12.github.io/cse15l-lab-reports/screenshots/p6-lab4.png)
- 
