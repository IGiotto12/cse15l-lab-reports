## **LAB1**

For each of the commands cd, ls, and cat, and using the workspace you created in this lab:

Share an example of using the command with no arguments.
Share an example of using the command with a path to a directory as an argument.
Share an example of using the command with a path to a file as an argument.

## cd
1. **cd without any arguments** changes the current working directory to /home
```
cd
```
2. **cd with a path to a directory** changes the current working directory to the path directory
```
cd lecture1
```
3. **cd with a path to a file** throws an error and prompts that the path is not a directory
```
cd lecture1/Hello.java
```

## ls
1. **ls without any arguments** lists all the files and directories under current working directory
```
ls
```
2. **ls with a path to a directory** lists all the files and directories under lecture1
```
ls lecture1
```
3. **ls with a path to a file**  prints the path to the file
```
ls lecture1/Hello.java
```

## cat
1. **cat without any arguments** changes the terminal to pure text editing mode
```
cat
```
2. **cat with a path to a directory** throws an error and prompts that the path is a directory
```
cat lecture1
```
3. **cat with a path to a file** prints out all the text in this file
```
cat lecture1/Hello.java
```
