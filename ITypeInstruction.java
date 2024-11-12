public class ITypeInstruction extends Instruction {
    private String rt, rs, immediate;

    public ITypeInstruction(String opcode, String rt, String rs, String immediate) {
        super(opcode);
        this.rt = rt;
        this.rs = rs;
        this.immediate = immediate;
    }

    @Override
    public String toMachineCode() {
        int imm = Integer.parseInt(immediate);
        String immBinary = String.format("%16s", Integer.toBinaryString(imm & 0xFFFF)).replace(' ', '0');
        return opcode + RegisterMap.get(rs) + RegisterMap.get(rt) + immBinary;
    }
}
