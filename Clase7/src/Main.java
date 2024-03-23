import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args){
//        try{
//            System.out.println(hashMD5("Hola"));
//        }
//        catch (NoSuchAlgorithmException ex){
//            System.err.println(ex.getMessage());
//        }
        compararObject();
    }

    public static String hashMD5(String texto) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA1");
        md.update(texto.getBytes());
        byte[] digest = md.digest();
        StringBuilder hash = new StringBuilder();
        for (byte b: digest){
            hash.append(String.format("%02X", b));
        }
        return hash.toString().toLowerCase();
    }

    public static void compararObject(){
        Integer entero = 10;
        int entero2 = 10;
        Integer entero3 = 10;

        boolean prueba = entero.equals(entero3);
        boolean prueba2 = entero == entero2;
        System.out.println(prueba);
        System.out.println(prueba2);

    }
}
