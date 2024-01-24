package memory;

public class MemoryTester {
	public static void main(String[] args) {
		RAMManager ramManager = new RAMManager();
		DiskManager diskManager = new DiskManager();

		ramManager.allocateMemory(8);
		diskManager.allocateMemory(256);

		ramManager.freeMemory();
		diskManager.freeMemory();

		System.out.println(MemoryManager.getMemoryType());
	}
}
