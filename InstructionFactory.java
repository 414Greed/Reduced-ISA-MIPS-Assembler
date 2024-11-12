public class InstructionFactory {
    public static Instruction createInstruction(String line) {
        String[] parts = line.trim().replaceAll("[,\\s]+", " ").split(" ");
        String opcode = parts[0];

        switch (opcode) {
            case "add":
                return new RTypeInstruction(OpcodeMap.get(opcode), parts[1], parts[2], parts[3], "100000");
            case "and":
                return new RTypeInstruction(OpcodeMap.get(opcode), parts[1], parts[2], parts[3], "100100");
            case "or":
                return new RTypeInstruction(OpcodeMap.get(opcode), parts[1], parts[2], parts[3], "100101");
            case "slt":
                return new RTypeInstruction(OpcodeMap.get(opcode), parts[1], parts[2], parts[3], "101010");
            case "sub":
                return new RTypeInstruction(OpcodeMap.get(opcode), parts[1], parts[2], parts[3], "100010");
            case "addiu":
            case "andi":
            case "beq":
            case "bne":
            case "lui":
            case "lw":
            case "ori":
            case "sw":
                return new ITypeInstruction(OpcodeMap.get(opcode), parts[1], parts[2], parts[3]);
            case "j":
                return new JTypeInstruction(OpcodeMap.get(opcode), parts[1]);
            case "syscall":
                return new RTypeInstruction(OpcodeMap.get(opcode), "00000", "00000", "00000", "001100");
            default:
                throw new IllegalArgumentException("Invalid opcode: " + opcode);
        }
    }
}
