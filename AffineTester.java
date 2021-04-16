package hw1;

public class AffineTester
{
	public static void main(String[] args)
	{
		String plainText = "thequickbrownfoxjumpedoverthelazydog.";
		int a = 31;
		int b = 17;
		AffineKey Ak = new AffineKey(a, b);
		String encryptedText = Ak.encrypt(plainText);
		String decryptedText = Ak.decrypt(encryptedText);
		System.out.println("Plain text: thequickbrownfoxjumpedoverthelazydog.");
		System.out.println("Cipher text: " + encryptedText);
		System.out.println("Decrypted text: " + decryptedText);
	}
}
