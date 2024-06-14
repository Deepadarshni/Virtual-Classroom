package facade;

class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade(CPU cpu, Memory memory, HardDrive hardDrive) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public void start() {
        System.out.println("Starting computer...");
        cpu.start();
        memory.load();
        hardDrive.read();
        System.out.println("Computer started");
    }

    public void shutdown() {
        System.out.println("Shutting down computer...");
        hardDrive.write();
        memory.clear();
        cpu.shutdown();
        System.out.println("Computer shut down");
    }
}

