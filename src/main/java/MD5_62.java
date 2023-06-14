package main.java;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MD5_62 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();

        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] hash = messageDigest.digest();
            for (byte b : hash) {
                System.out.printf("%02x", b);
            }
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

    }
}
