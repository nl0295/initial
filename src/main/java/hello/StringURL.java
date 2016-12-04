package hello;

/**
 * Created by nicol on 28/11/2016.
 */
public class StringURL {

    private String string;

    public StringURL(String s){
        String res = "";

        for(int i=0;i<s.length();i++){
         char c=s.charAt(i);
         if (c==' ') res+="%20";
         else res+=c;
        }
        string=res;
    }


    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
