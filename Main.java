public class Main {
    public static void main(String[] args) {
        try {
            String line = args[0];
            Assembler assembler = new Assembler();
            int inst = assembler.generateInstruction(line);
            System.out.println(String.format("%08x", inst));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Got this code from a in person lecture