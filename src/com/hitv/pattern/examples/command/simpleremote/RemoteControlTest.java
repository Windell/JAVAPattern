package com.hitv.pattern.examples.command.simpleremote;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
		
		/**
		 * 本例场景为统一遥控器用以控制不同的家电.<br>
		 * 命令模式将"请求"封装成请求者对象(在特定'接收者'上绑定一组动作来封装一个请求)<br>
		 * 实现调用者(RemoteControl)和请求接收者(Light,Garage)的解耦<br>
		 * 且更方便于组合多个对象完成一连串的任务
		 * 
		 * **/
	}
}
