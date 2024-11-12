public abstract class Instruction {
    protected String opcode;

    // THe Constructor that initializes the opcode
    public Instruction(String opcode) {
        this.opcode = opcode;
    }

    // An Abstract method that converts the instruction to the new machine code needed
    public abstract String toMachineCode();
}
