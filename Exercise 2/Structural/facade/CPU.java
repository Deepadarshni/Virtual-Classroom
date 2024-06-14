package facade;

//CPU class
class CPU {
 public void start() {
     System.out.println("CPU started");
 }

 public void shutdown() {
     System.out.println("CPU shut down");
 }
}

//Memory class
class Memory {
 public void load() {
     System.out.println("Memory loaded");
 }

 public void clear() {
     System.out.println("Memory cleared");
 }
}

//HardDrive class
class HardDrive {
 public void read() {
     System.out.println("HardDrive read");
 }

 public void write() {
     System.out.println("HardDrive write");
 }
}
