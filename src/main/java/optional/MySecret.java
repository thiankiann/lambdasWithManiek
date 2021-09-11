package optional;

public class MySecret {
    String mySecret ;

    public MySecret(String mySecret) {
        this.mySecret = mySecret;
    }

    public String getMySecret() {
        return mySecret;
    }

    public void setMySecret(String mySecret) {
        this.mySecret = mySecret;
    }

    @Override
    public String toString() {
        return "MySecret{" +
                "mySecret='" + mySecret + '\'' +
                '}';
    }

    public static void main(String[] args) {
        MySecret realOne = new MySecret("I like learning and teaching Java");
        MySecret withNull = new MySecret(null);
        printSecretLength(realOne);
        printSecretLength(withNull);
    }
    public static void printSecretLength(MySecret mySecret) {
        //int secretLen = mySecret.getMySecret().length();

        int secretLen;
      secretLen= mySecret.getMySecret() != null ? mySecret.getMySecret().length() : 0;
/*     the same functionality  than that one line above
       if(mySecret.getMySecret() != null){
            secretLen = mySecret.getMySecret().length();
        }else {
            secretLen = 0;
        }
 */
       System.out.println("Mt secret has " + secretLen + " characters" );
    }
}
