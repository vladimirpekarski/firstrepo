package stringvsstringbuffer;

public class StringVsStringBuffer {
    public static void main(String[] args) {
        String testString = "Test String";
        StringBuffer testStrinBuffer = new StringBuffer("Test StringBuffer");
        int countOfIteration = 10000;


        long beforeForString = System.nanoTime();
        for (int i = 0; i < countOfIteration; i++) {
            testString += "test";
        }
        long afterForString = System.nanoTime();


        long beforeForStringBuffer = System.nanoTime();
        for (int i = 0; i < countOfIteration; i++) {
            testStrinBuffer.append("test");
        }
        long afterForStringBuffer = System.nanoTime();

        System.out.println("Time for String: " + (afterForString - beforeForString) + "ns");
        System.out.println("Time for StringBuffer: " + (afterForStringBuffer - beforeForStringBuffer) + "ns");

    }
}

