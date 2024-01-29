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
