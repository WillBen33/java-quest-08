public class Decipherer {
    private static String strLengthHalfDivided(String message) {
        int strLength = message.length()/2;
        String strSubstr = message.substring(5, strLength+5);
        String strReplace = strSubstr.replace("@#?", " ");
        String decryptedMessage;
        decryptedMessage = new StringBuilder(strReplace).reverse().toString();
        return decryptedMessage;
    }

    public static void main(String[] args) {
        String messageOneDecrypted = strLengthHalfDivided("0@sn9sirppa@#?ia'jgtvryko1");
        System.out.println(messageOneDecrypted);
        String messageTwoDecrypted = strLengthHalfDivided("q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj");
        System.out.println(messageTwoDecrypted);
        String messageThreeDecrypted = strLengthHalfDivided("aopi?sedohtém@#?sedhtmg+p9l!");
        System.out.println(messageThreeDecrypted);
    }
}
