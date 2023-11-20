package com.shaqib.client;

import com.shaqib.helper.Helper;

public class Test2 extends Helper {

	@Override
	public void morn(){System.out.println("good morning");}
	@Override
	public void even(){System.out.println("good evening");}
	
	public static void main(String[] args)
	{
	Test2 t = new Test2();
	t.morn();
	t.even();
	t.gn();
	}

}
