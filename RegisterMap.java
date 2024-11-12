import java.util.HashMap;
import java.util.Map;

public class RegisterMap {
    private static final Map<String, String> registerMap = new HashMap<>();

    static {
        registerMap.put("$zero", "00000");
        registerMap.put("$at", "00001");
        registerMap.put("$v0", "00010");
        registerMap.put("$v1", "00011");
        registerMap.put("$a0", "00100");
        registerMap.put("$a1", "00101");
        registerMap.put("$a2", "00110");
        registerMap.put("$a3", "00111");
        registerMap.put("$t0", "01000");
        registerMap.put("$t1", "01001");
        registerMap.put("$t2", "01010");
        registerMap.put("$t3", "01011");
        registerMap.put("$t4", "01100");
        registerMap.put("$t5", "01101");
        registerMap.put("$t6", "01110");
        registerMap.put("$t7", "01111");
        registerMap.put("$s0", "10000");
        registerMap.put("$s1", "10001");
        registerMap.put("$s2", "10010");
        registerMap.put("$s3", "10011");
        registerMap.put("$s4", "10100");
        registerMap.put("$s5", "10101");
        registerMap.put("$s6", "10110");
        registerMap.put("$s7", "10111");
        registerMap.put("$t8", "11000");
        registerMap.put("$t9", "11001");
        registerMap.put("$k0", "11010");
        registerMap.put("$k1", "11011");
        registerMap.put("$gp", "11100");
        registerMap.put("$sp", "11101");
        registerMap.put("$fp", "11110");
        registerMap.put("$ra", "11111");
    }

    public static String get(String register) {
        return registerMap.get(register);
    }
}
