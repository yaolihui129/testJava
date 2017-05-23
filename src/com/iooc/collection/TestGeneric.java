package com.iooc.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
	/*
	 * 带有泛型的list属性
	 */
	public List<Course>courses;
	
	public TestGeneric(){
		this.courses=new ArrayList<Course>();
	}
	
	public void testAdd(){
		Course cr1 = new Course("1","大学语文");
		courses.add(cr1);
		Course cr2 = new Course("2","JAVA基础");
		courses.add(cr2);
	}
	
	public void testForEach(){
		for(Course cr:courses){
			System.out.println(cr.id+":"+cr.name);;
		}
	}
	public void testChild(){
		ChildCourse ccr= new ChildCourse();
		ccr.id="3";
		ccr.name="我是子类型的课程对象";
		courses.add(ccr);
	}
	
	public void testBasicType(){
		List<Integer> list =new ArrayList<Integer>();
		list.add(1);
		System.out.println("泛型类型必须使用包装类");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGeneric tg = new TestGeneric();
		tg.testAdd();
		tg.testForEach();
		tg.testChild();
		tg.testForEach();
		tg.testBasicType();
	}

}
