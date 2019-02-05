public class CaesarSub {

    public static String encrpytCaesarCipher(String plaintext, int offset)
    {
        String caesarText="";
        int charAsciiValue; //stores the value
        int newCharNumberValue;
        char newCharValue;


        for(int i = 0; i < plaintext.length(); i++)
        {
            plaintext = plaintext.toUpperCase();
           charAsciiValue = plaintext.charAt(i);
           if(offset >= 26)
           {
               offset = offset % 26;
           }

           if(charAsciiValue+offset>90)
           {
               if (plaintext.charAt(i) == ' ')
               {
                   caesarText = caesarText + " ";
               }
               else
               {
                   newCharNumberValue = (charAsciiValue + offset)  - 26;
                   newCharValue = (char)newCharNumberValue;
                   caesarText = caesarText + newCharValue;
               }
           }
           else
           {
               if (plaintext.charAt(i) == ' ')
               {
                   caesarText = caesarText + " ";
               }
               else
               {
                   newCharNumberValue = charAsciiValue + offset;
                   newCharValue = (char) newCharNumberValue;
                   caesarText = caesarText + newCharValue;
               }
           }

        }

        return caesarText;
    }
}
