public class RTypeInstruction extends Instruction {
    private String rd, rs, rt;
    private String funct;

    public RTypeInstruction(String opcode, String rd, String rs, String rt, String funct) {
        super(opcode);
        this.rd = rd;
        this.rs = rs;
        this.rt = rt;
        this.funct = funct;
    }

    @Override
    public String toMachineCode() {
        return opcode + RegisterMap.get(rs) + RegisterMap.get(rt) + RegisterMap.get(rd) + "00000" + funct;
    }
}
