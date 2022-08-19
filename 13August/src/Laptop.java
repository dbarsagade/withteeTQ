import java.util.Scanner;

/*create Laptop object 2> set values of variables noOfUSBPort,
processorSpeed using setter methods. 3> print variables noOfUSBPort,
processorSpeed using getter methods.
 */
public class Laptop {
	private int noOfUSBPort;
	private int  processorSpeed;

	public int getNoOfUSBPort() {
		return noOfUSBPort;
	}

	public void setNoOfUSBPort(int noOfUSBPort) {
		this.noOfUSBPort = noOfUSBPort;
	}

	public int getProcessorSpeed() {
		return processorSpeed;
	}

	public void setProcessorSpeed(int processorSpeed) {
		this.processorSpeed = processorSpeed;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of number of  USB port");
		int noOfUSBPort=sc.nextInt();
		System.out.println("enter processor speed");
		int processorSpeed=sc.nextInt();
		
		Laptop l = new Laptop();
		l.setNoOfUSBPort(noOfUSBPort);
		l.setProcessorSpeed(processorSpeed);
		
		System.out.println("USB port: " +noOfUSBPort);
		System.out.println("Processor Speed:"+processorSpeed);
				

	}

}
