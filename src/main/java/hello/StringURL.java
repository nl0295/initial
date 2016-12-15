package hello;


public class StringURL {

    private String string;

    public StringURL(String s){
        String res = "";

        for(int i=0;i<s.length();i++){
         char c=s.charAt(i);
         if (c==' ') res+="%20";
//         else if (c=='é') res+="%E9";
//         else if (c=='è') res+="%E8";
//         else if (c=='ê') res+="%EA";
//         else if (c=='ë') res+="%EB";
//         else if (c=='à') res+="%E0";
//         else if (c=='î') res+="%EE";
//         else if (c=='ï') res+="%EF";
//         else if (c=='ô') res+="%F4";
//         else if (c=='ù') res+="%E0";
//         else if (c=='<') res+="%3C";
//         else if (c=='>') res+="%3E";
//         else if (c=='#') res+="%23";
//         else if (c=='%') res+="%25";
//         else if (c=='+') res+="%2B";
//         else if (c=='/') res+="%2F";
//         else if (c=='$') res+="%24";
//         else if (c=='&') res+="%26";
         else if (c==',') res+="%2C";
//         else if (c==';') res+="%3B";
//         else if (c=='=') res+="%3D";
//         else if (c=='?') res+="%3F";
//         else if (c=='@') res+="%40";
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
