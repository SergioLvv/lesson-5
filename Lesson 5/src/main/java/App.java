public class App {
    static public void main(String[] argv) {
        // Розглянемо примітиви та їх об'єктні значення:
        // byte - примітив - це просто значення
        // Об'єкти - це обгортки значень, мають в собі методи для роботи з ними, порівняння, конвертації та ін.
        // 1 Byte = 8bit
        byte byteVar0 = 'a'; // ASCII symbol table 256 values  = 0000 0000 or 2^8
        byte byteVar1 = -128;
        Byte byteVar2 = 127;
        byte byteVar3 = 0x23; // HEX - #
        byte byteVar4 = 0b00000001; // BIN

        System.out.println((char) byteVar4);

        //Char or Short 2 byte = 16 bit - ~65K
        short shortVal = -32768;
        Short shortVal1 = 32767;

        // Int = 4 byte = 32 bit - 4GB of RAM memory
        int intVal1 = -2147483648;
        Integer intVal2 = 2147483647;

        // Long = 8 byte = 64 bit - 16TB of RAM memory
        long longVal1 = -9223372036854775808L;
        Long longVal2 = -9223372036854775807L;

        // Float = 4 byte = 32 bit
        float floatVal1 = 5.054F;
        Float floatVal2 = 5.054F;

        // Double = 8 byte = 64bit
        double doubleVal1 = 5.0000878778787875;
        Double doubleVal2 = -5.0000878778787875;

        // Boolean = 1 bit
        boolean boolVal1 = true; // 1
        Boolean boolVal2 = false; // 0

        // Char = 2byte = 16 bit
        char charVal1 = 'ї';
        Character CharVal2 = 'і';

        // String - immutable array of chars
        // String (oб'єкт - містить методи для роботи над самою стрінгою, але не модифікують її всередині)
        String strVal = "Привіт";

        System.out.println("Chars:");
        for (char ch: strVal.toCharArray()){
            System.out.println(ch);
        }

        System.out.println("Bytes:");
        for (byte bt: strVal.getBytes()){
            System.out.println(bt);
        }
        String strVal2 = "Привіт";

        String strVal3;// NULL
        StringBuffer strBuff = new StringBuffer("Привіт");
        strVal3 = strBuff.toString();

        System.out.println("strVal1: " + strVal);
        System.out.println("strVal2: " + strVal2);
        System.out.println("strVal3: " + strVal3);

        System.out.println("strVal = strVal2: " + (strVal == strVal2));
        System.out.println("strVal = strVal3: " + (strVal == strVal3));

        System.out.println("strVal equals strVal2: " + strVal.equals(strVal2));
        System.out.println("strVal equals strVal3: " + strVal.equals(strVal3));

        strVal3 = strVal;

        System.out.println("strVal1: " + strVal);
        System.out.println("strVal3: " + strVal3);
        System.out.println("strVal = strVal3: " + (strVal == strVal3));
        // String корректно порівнювати через метод ".equals"

        // в  програмах можна зустріти наступні вирази
        strVal.equals("some string");
        "some string".equals(strVal);

        // Format

        int num = 10;
        float coefficient = 1.5F;
        String message = "My message";
        String formatted = String.format("[%d] coefficient is %.2f message: %s %nNew line", num, coefficient, message );
        System.out.println(formatted); // \n - символ переносу строки на новий рядок, де \ - символ екранування
        // Наприклад якщо ми хочемо відобразити в лапках "My message" нам потрібно в шаблоні .format взяти в лапки стрінгу з символом екранування - \"%s\"

        ClassExample example = new ClassExample();
        System.out.println(example.getString());
        System.out.println(example.stringExample);

    }
}




