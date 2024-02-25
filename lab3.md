# Lab Report 3 - Bugs and Commands

## *Part1 - Bugs*
There are different bugs in our week4 lab activity and this lab report will address bugs in ```ArrayExamples.java```      

Failure-inducing input:   
This input will induce an error because the array was not already in reversed order so that the algorithm only change the first half part but leave the second half part same as it was. 
```
//JUNIT
  @Test
  public void testReversedInPlace_invalid() {
    int[] input1 = {1,2,3,4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4,3,2,1}, input1);
  }

//IN ArrayExamples.java
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = arr[arr.length - i - 1];
    }
  }
```
Input that doesn't induce a failure:     
This input is already in reversed order so that the algorithm will work as expected. 
```
//JUNIT
  @Test
  public void testReversedInPlace_valid() {
    int[] input1 = {1,2,2,1};
      ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{1,2,2,1}, input1);
  }

//IN ArrayExamples.java
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = arr[arr.length - i - 1];
    }
  }
```
Symptom:
![symptom](./screenshots/p1-lab3.png)  

Bug Before:
```
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = arr[arr.length - i - 1];
    }
  }
```
After fix:
```
  static void reverseInPlace(int[] arr) {
    int temp = 0;
    for(int i = 0; i < arr.length/2; i += 1) {
      temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length-i-1] = temp;
    }
  }
```
Before the fix, the program does not swap values at indexs so values lost in the loop.
After the fix, the value being swapped is temporally saved to a variable so that swapping is done successfully.

## *Part2 - Command-line options with ```find```*
###  option ```-name``` - source = "https://www.computerhope.com/unix/ufind.htm"
This block of codes shows finding repository with specific name.
```
//current working directory is docsearch/technical
$ find . -name 911report
./911report
```

This block of codes shows finding files with specific name.
```
//current working directory is docsearch/technical
$ find . -name 1468-6708-3-7.txt
./biomed/1468-6708-3-7.txt
```
     
###  option ```-user``` - source = "https://www.computerhope.com/unix/ufind.htm"
This block of code prints all files and directories owned by user(for my working machine is windows), so in this case all files.(Lines are shortened using head due to long output) 
```
//current working directory is docsearch/technical
$ find . -user windows | head
.
./docsearch
./docsearch/.git
./docsearch/.git/config
./docsearch/.git/description
./docsearch/.git/HEAD
./docsearch/.git/hooks
./docsearch/.git/hooks/applypatch-msg.sample
./docsearch/.git/hooks/commit-msg.sample
./docsearch/.git/hooks/fsmonitor-watchman.sample
```

This block of code prints nothing becuase no files or directories are owned by the user "me". It helps to distinguish files between personal or public like company's. 
```
//current working directory is docsearch/technical
$ find . -user google | head
find: ‘google’ is not the name of a known user
```

###  option ```-path``` - source = "https://www.computerhope.com/unix/ufind.htm"
This block of codes search the paths for any files ends with txt in technical/911report.
```
//current working directory is docsearch/technical
$ find ./911report -path *txt
./911report/chapter-1.txt
./911report/chapter-10.txt
./911report/chapter-11.txt
./911report/chapter-12.txt
./911report/chapter-13.1.txt
./911report/chapter-13.2.txt
./911report/chapter-13.3.txt
./911report/chapter-13.4.txt
./911report/chapter-13.5.txt
./911report/chapter-2.txt
./911report/chapter-3.txt
./911report/chapter-5.txt
./911report/chapter-6.txt
./911report/chapter-7.txt
./911report/chapter-8.txt
./911report/chapter-9.txt
./911report/preface.txt
```
  
This block of codes shows a search in /technical for all files end with txt.(Lines are shortened using head due to long output)  
```
//current working directory is docsearch/technical
$ find . -path *.txt | head
./911report/chapter-1.txt
./911report/chapter-10.txt
./911report/chapter-11.txt
./911report/chapter-12.txt
./911report/chapter-13.1.txt
./911report/chapter-13.2.txt
./911report/chapter-13.3.txt
./911report/chapter-13.4.txt
./911report/chapter-13.5.txt
./911report/chapter-2.txt
```             

###  option ```-type``` - source = "https://www.computerhope.com/unix/ufind.htm"
This block of codes searches for all paths of given type 'file' in the directory.(Lines are shortened using head due to long output) 
```
//current working directory is docsearch/technical
$  find . -type f | head
./911report/chapter-1.txt
./911report/chapter-10.txt
./911report/chapter-11.txt
./911report/chapter-12.txt
./911report/chapter-13.1.txt
./911report/chapter-13.2.txt
./911report/chapter-13.3.txt
./911report/chapter-13.4.txt
./911report/chapter-13.5.txt
./911report/chapter-2.txt
```      
   
This block of codes searches for all paths of given type 'directory' and including itself. 
```
//current working directory is docsearch/technical
$ find . -type d
.
./911report
./biomed
```
