import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] args){
        String inputText = setText();
        int key = setKey();
        if (args.length>0) {
            setAppMod(args[0], inputText, key);
        } else {
            String emptyFlag = "";
            setAppMod(emptyFlag, inputText, key);
        }
    }

    static void setAppMod(String flag)
    {
        if (flag.equals("encrypt".toLowerCase())){
            System.out.println("running encryption-mod");
            System.out.println(encrypt());
        } else if (flag.equals("decrypt".toLowerCase())){
            System.out.println("running decryption-mod:");
            System.out.println(decrypt());
        } else {
            String appMod = inputMod();
            setAppMod(appMod, inputText, key);
        }
    }
    static String setText()
    {
        Scanner ioScan = new Scanner(System.in);
        System.out.println("copy/paste your secret text: ");
        String text = ioScan.nextLine();
        return text;
    }
    static int setKey()
    {
        Scanner ioScan = new Scanner(System.in);
        System.out.println("write your secret key: ");
        int key = ioScan.nextInt();
        return key;
    }
    static String inputMod(){
        Scanner ioScan = new Scanner(System.in);
        System.out.println("select application mod: type 'decrypt' to decrypt or 'encrypt' to encrypt");
        String mod = ioScan.nextLine();
        return mod;
    }
    /*static char[] generateAlphabet()
    {
        char[] alphabet = new char[27];
        for (int i = 0; i < 27; i++) {
            alphabet[i] = (char)(65+i); //only uppercase letters
        }
        return alphabet;
    }*/
    
    /*static String encrypt (String originalText, int key)
    {
        String encryptedText="";
        originalText = originalText.toUpperCase();
        for (int i = 0; i < originalText.length(); i++) {
            if (originalText.charAt(i) >= 'A' && originalText.charAt(i) <= 'Z') {
                if ((int) originalText.charAt(i) + key % 26 > (int) 'Z') {
                    encryptedText += (char) ((int) originalText.charAt(i) + key % 26 - 26);
                } else {
                    encryptedText += (char) ((int) originalText.charAt(i) + key % 26);
                }
            } else {
                encryptedText += originalText.charAt(i);
            }
        }
        return encryptedText;
    }*/
    static String encrypt ()
    {
        String originalText = setText(); 
        int key = setKey();
        String encryptedText="";
        
        originalText = originalText.toUpperCase();
        for (int i = 0; i < originalText.length(); i++) {
            if (originalText.charAt(i) >= 'A' && originalText.charAt(i) <= 'Z') {
                if ((int) originalText.charAt(i) + key % 26 > (int) 'Z') {
                    encryptedText += (char) ((int) originalText.charAt(i) + key % 26 - 26);
                } else {
                    encryptedText += (char) ((int) originalText.charAt(i) + key % 26);
                }
            } else {
                encryptedText += originalText.charAt(i);
            }
        }
        return encryptedText;
    }
    /*static String decrypt (String cipher, int key)
    {
        String decryptedText = "";
        cipher = cipher.toUpperCase();
        for (int i = 0; i < cipher.length(); i++) {
            if (cipher.charAt(i) >= 'A' && cipher.charAt(i) <= 'Z') {
                if ((int) cipher.charAt(i) - key % 26 < (int) 'A') {
                    decryptedText += (char) ((int) cipher.charAt(i) - key % 26 + 26);
                } else {
                    decryptedText += (char) ((int) cipher.charAt(i) - key % 26);
                }
            } else {
                decryptedText += cipher.charAt(i);
            }
        }
        return decryptedText;
    }*/
    static String decrypt ()
    {
        String cipher setText();
        int key = setKey();
        String decryptedText = "";
        
        cipher = cipher.toUpperCase();
        for (int i = 0; i < cipher.length(); i++) {
            if (cipher.charAt(i) >= 'A' && cipher.charAt(i) <= 'Z') {
                if ((int) cipher.charAt(i) - key % 26 < (int) 'A') {
                    decryptedText += (char) ((int) cipher.charAt(i) - key % 26 + 26);
                } else {
                    decryptedText += (char) ((int) cipher.charAt(i) - key % 26);
                }
            } else {
                decryptedText += cipher.charAt(i);
            }
        }
        return decryptedText;
    }
}
