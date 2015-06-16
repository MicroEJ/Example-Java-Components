/*
 * Java
 *
 * Copyright 2015 IS2T. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be found at http://www.is2t.com/open-source-bsd-license/.
 */
package com.is2t.examples.hello.publisher;

import com.is2t.examples.hello.Hello;

/**
 * Say hello to people by printing on the {@link System#out}.
 */
public class HelloPrint implements Hello {

	@Override
	public void sayHello(String name) {
		System.out.println("Hello " + name);
	}

}