## **LAB REPORT 2 - Server and SSH Keys**

## Part 1
My ChatServer.java raw file [here](https://igiotto12.github.io/cse15l-lab-reports/Codes/ChatServer/ChatServer.java)
```
import java.io.*;
import java.net.URI;

/**
*This is the handler class which implements the main methods of handling 
*chat queries
*
*Instance variables:
*chatHistory - store all the chat messages into this String
*/
class Handler implements URLHandler{

    private static final String NEXTLINE = "\n";
    private static final String PROMPT = "use this format: /add-message?s=<string>&user=<string>";

    private String chatHistory ="";

    public String handleRequest(URI url){
        if (url.getPath().equals("/")){
            return String.format("CHAT:"+NEXTLINE+this.chatHistory);
        }
        else if(url.getPath().equals("/add-message")){
            String query = url.getQuery();
            if (query.contains("s=") && query.contains("&user=")){
                String[] parameters = query.substring(2).split("&user=");
                String user = parameters[1];
                String msg = parameters[0];
                //this for loop deals with getQuery() results "+"
                if (msg.contains("+")){
                    String[] msg_chars = msg.split("\\+");
                    msg = "";
                    for (String chars: msg_chars){
                        msg+=chars+" ";
                    } 
                }
                String concatString = user+": "+msg; 
                this.chatHistory+=concatString+NEXTLINE;
                return this.chatHistory;
            }
            else{
                return this.PROMPT;
            }
        }
        return "404 Not Found!";
    }
}

class ChatServer{
    public static void main(String[] args) throws IOException{
        if (args.length == 0){
            System.out.println("MIssing port number! Try any number 1024 to 49151");
            return;
        }
        int port = Integer.parseInt(args[0]);
        Server.start(port, new Handler());
    }
}
```
**Output Screenshots**
  ![first e.g](https://igiotto12.github.io/cse15l-lab-reports/screenshots/p1-lab2)
  - ```handleRequest``` is called in my code.
  - The method only has one URI type variable argument, so the URL's value is passed through this method. ```chatHistory``` is a significant value or field to record queries or "chats".
  - The value of ```chatHistory``` field has updated from empty to "jpolitz: Hello" after the method call, because it keeps track of the input query.
  ![second e.g](https://igiotto12.github.io/cse15l-lab-reports/screenshots/p2-lab2)
- ```handleRequest``` is called in my code.
- The method only has one URI type variable argument, so the URL's value is passed through this method. ```chatHistory``` is a significant value or field to record queries or "chats".
- The value of ```chatHistory``` field has added "yash: How are you" after the method call, because it keeps track of all the input query. 
  
## Part 2


## Part 3
For the past two weeks of CSE15l labs, I learnt how URL works and can be implemented using Java libriary. Specifically, 
