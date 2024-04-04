package method.ex;
public class MethodEx2Ref {
    public static void main(String[] args) {
        String message = "Hello, world!";
//        for (int i = 0; i < 3; i++) {
//            System.out.println(message);
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println(message);
//        }
//        for (int i = 0; i < 7; i++) {
//            System.out.println(message);
//        }

        message(message, 3);
        message(message, 5);
        message(message, 7);
    }

    public static void message(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }
}