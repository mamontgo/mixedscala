package com.monty.java;

import java.io.InputStreamReader;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.monty.scala.Core;

public class App {

	public static void main(String[] args) {

		List<PersonBean> beans = new Gson().fromJson(new InputStreamReader(
				ClassLoader.class.getResourceAsStream("/input.json")),
				new TypeToken<List<PersonBean>>() {
				}.getType());
		
		
		System.out.println("First List Tesing");
		System.out.println("Item List");
		Core.print(beans);
		
		System.out.println();
		
		System.out.println("Total");
		System.out.println(Core.sum(beans));

		Core.incPerc(0.100d, beans);
		System.out.println();
		System.out.println();
		System.out.println("Filter 5k");

		Core.print(Core.filterGt(500d, beans));
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("Updated List Tesing");
		System.out.println("Item List");
		Core.print(beans);
		System.out.println();
		System.out.println("Total");
		System.out.println(Core.sum(beans));

	}

	static PersonBean get(String name, Double val) {
		return new PersonBean(name, val);
	}

}
