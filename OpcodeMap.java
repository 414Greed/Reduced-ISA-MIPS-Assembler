import java.util.HashMap;
import java.util.Map;

public class OpcodeMap {
    private static final Map<String, String> opcodeMap = new HashMap<>();

    // This class should Initialize the opcode map with the corresponding MIPS instruction opcodes
    static {
        opcodeMap.put("add", "000000");
        opcodeMap.put("addiu", "001001");
        opcodeMap.put("and", "000000");
        opcodeMap.put("andi", "001100");
        opcodeMap.put("beq", "000100");
        opcodeMap.put("bne", "000101");
        opcodeMap.put("j", "000010");
        opcodeMap.put("lui", "001111");
        opcodeMap.put("lw", "100011");
        opcodeMap.put("or", "000000");
        opcodeMap.put("ori", "001101");
        opcodeMap.put("slt", "000000");
        opcodeMap.put("sub", "000000");
        opcodeMap.put("sw", "101011");
        opcodeMap.put("syscall", "000000");
    }

    // The Method i used to get the opcode for a given instruction
    public static String get(String opcode) {
        return opcodeMap.get(opcode);
    }
}
