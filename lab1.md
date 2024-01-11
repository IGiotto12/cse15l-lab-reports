## **LAB1**

For each of the commands cd, ls, and cat, and using the workspace you created in this lab:

Share an example of using the command with no arguments.
Share an example of using the command with a path to a directory as an argument.
Share an example of using the command with a path to a file as an argument.


**cd**:
1. **cd** changes the current working directory to /home
```
cd
```
2. **cd lecture1** changes the current working directory to /home/lecture1
```
cd lecture1
```
3. **cd lecture1/Hello.java** prompts "Hello.java is not a directory"
```
cd lecture1/Hello.java
```

* *ls*:
1. **ls** lists all the files and directories under current working directory
```
ls
```
  2. **ls lecture1** lists all the files and directories under lecture1
```
ls lecture1
```
  3. **ls lecture1/Hello.java** literally prints the path to the file
```
ls lecture1/Hello.java
```

* *cat*:
1. **cat** changes the terminal to pure text editing mode
```
cat
```
  2. **cat lecture1** prompts lecture1 is a directory
  3. **cat lecture1/Hello.java** prints out all the text in this file
