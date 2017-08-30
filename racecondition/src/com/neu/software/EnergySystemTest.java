package com.neu.software;

public class EnergySystemTest {

	//能量盒子数量
	public static final int BOX_AMOUNT=100;
	//每个能量盒子初始能量值
	public static final int INITIAL_ENERGY=100;
	public static void main(String[] args) {
		EnergySystem eng = new EnergySystem(BOX_AMOUNT, INITIAL_ENERGY);
		
		for(int i=0;i<BOX_AMOUNT;i++){
			EnergyTransferTask task = new EnergyTransferTask(eng, i, INITIAL_ENERGY);
    		Thread t = new Thread(task,"TransferThread_"+i);
    		t.start();
		}
	}
	
}
