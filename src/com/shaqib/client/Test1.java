package com.shaqib.client;

import com.shaqib.it.Message;

public class Test1 implements Message {
	@Override
	public void morn(){System.out.println("good morning");}
	@Override
	public void even(){System.out.println("good evening");}
	@Override
	public void gn(){System.out.println("good 9t");}
	
	
	public static void main(String[] args)
	{
	Test1 t = new Test1();
	t.morn();
	t.even();
	t.gn();
	}

}
