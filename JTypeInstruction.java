public class JTypeInstruction extends Instruction {
    private String address;
    // Same Code Implemetation as RTypeinstruction
    // The Constructor that initializes J-type instruction fields
    public JTypeInstruction(String opcode, String address) {
        super(opcode);
        this.address = address;
    }

    // The Method used to convert the J-type instructions to new machine code needed
    @Override
    public String toMachineCode() {
        int addr = Integer.parseInt(address);
        String addrBinary = String.format("%26s", Integer.toBinaryString(addr)).replace(' ', '0');
        return opcode + addrBinary;
    }
}
