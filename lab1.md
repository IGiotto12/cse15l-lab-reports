## **LAB REPORT 1**

For each of the commands cd, ls, and cat, and using the workspace you created in this lab:

Share an example of using the command with no arguments.
Share an example of using the command with a path to a directory as an argument.
Share an example of using the command with a path to a file as an argument.

## cd
1. **cd without any arguments** changes the current working directory to `/home` 
```
[user@sahara ~]$ cd
[user@sahara ~]$ pwd
/home
```
For this example, the working directory is `home` and this command works perfectly without errors. 

2. **cd with a path to a directory** changes the current working directory to the path directory
```
[user@sahara ~]$ cd lecture1
[user@sahara ~/lecture1]$ pwd
/home/lecture1
```
For this example, the working directory is `home` and this command works perfectly without errors. 

3. **cd with a path to a file** throws an error and prompts that the path is not a directory
```
[user@sahara ~]$ cd lecture1/Hello.java
bash: cd: lecture1/Hello.java: Not a directory
```
For this example, the working directory is `home` but this command produces an error because the given path is to a file instead of a directory. 

## ls
1. **ls without any arguments** lists all the files and directories under current working directory
```
[user@sahara ~]$ ls
lecture1
```
For this example, the working directory is `home` and this command works perfectly without errors.

2. **ls with a path to a directory** lists all the files and directories under `lecture1`
```
[user@sahara ~]$ ls lecture1
Hello.class  Hello.java  Hello.txt  messages  README
```
For this example, the working directory is `home` and this command works perfectly without errors. 

3. **ls with a path to a file**  prints the path to the file
```
[user@sahara ~]$ ls lecture1/Hello.java
lecture1/Hello.java
```
For this example, the working directory is `home` and this command works perfectly without errors. 

## cat
1. **cat without any arguments** reads the terminal by default
```
[user@sahara ~]$ cat
abc
abc
```
For this example, the working directory is `home` and this command works perfectly without errors. 

2. **cat with a path to a directory** throws an error and prompts that the path is a directory
```
[user@sahara ~]$ cat lecture1
cat: lecture1: Is a directory
```
For this example, the working directory is `home` but this command causes an error because the given path is to directory but the actual command desires a path to a file.  

3. **cat with a path to a file** prints out all the text in this file
```
[user@sahara ~]$ cat lecture1/README
To use this program:
javac Hello.java
java Hello messages/en-us.txt
```
For this example, the working directory is `home` and this command works perfectly without errors. 
