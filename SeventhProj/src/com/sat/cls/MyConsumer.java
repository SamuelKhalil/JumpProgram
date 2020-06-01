package com.sat.cls;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Cars> {

	@Override
	public void accept(Cars t) {
		System.out.println(t.getCname()+" "+t.getCbrand());		
	}

}
