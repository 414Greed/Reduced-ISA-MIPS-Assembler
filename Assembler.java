public class Assembler {
    public int generateInstruction(String line) {
        Instruction instruction = InstructionFactory.createInstruction(line);
        if (instruction != null) {
            return Integer.parseUnsignedInt(instruction.toMachineCode(), 2);
        } else {
            throw new IllegalArgumentException("Invalid instruction.");
        }
    }
}
