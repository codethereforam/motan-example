package priv.thinkam.motan.service.impl;

import priv.thinkam.motan.service.FooService;

public class FooServiceImpl implements FooService {
	@Override
	public String hello(String name) {
		System.out.println(name + " invoked rpc service");
		return "hello " + name;
	}
}
