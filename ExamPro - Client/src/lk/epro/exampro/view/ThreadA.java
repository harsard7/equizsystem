/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.exampro.view;

/**
 *
 * @author Hafees
 */
class Demo{ 
	public static void main(String[] args) {    
		Thread t1=new Thread("One"){
			public void run(){
				for (int i = 0; i < 1000; i++){
					System.out.println(getName()+" : "+i);
				}
			}
		};
		Thread t2=new Thread("Two"){
			public void run(){
				for (int i = 0; i < 1000; i++){
					System.out.println(getName()+" : "+i);
				}
			}
		};		
		Thread t3=new Thread("Three"){
			public void run(){
				int i=0;
				while(true){
					System.out.println(getName()+" : "+i++);
				}
			}
		};		
		t1.start();
		t2.start();
		
		t3.start();
                t3.setDaemon(true);
	}
}