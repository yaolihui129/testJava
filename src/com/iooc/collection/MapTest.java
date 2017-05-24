package com.iooc.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	
	
	/*
	 * 用来承装
	 */

	public HashMap<String, Student> students;
	
	public MapTest(){
		this.students = new HashMap<String,Student>();
	}
	
	public void testPut(){
		Scanner console = new Scanner(System.in);
		int i=0;
		while(i<3){
			System.out.println("请输入学生ID: ");
			String ID =console.next();
			Student st = students.get(ID);
			if(st == null){
				System.out.println("请输入学生姓名：");
				String name =console.next();
				Student newStudent = new Student(ID,name);
				students.put(ID, newStudent);
				System.out.println("成功添加学生："+students.get(ID).name);
				i++;
			}else{
				System.out.println("该学生ID已被占用！");
				continue;
			}
		}
	}
	
	

	
	public void testRemove(){
		System.out.println("请输入要删除学生ID：");
		Scanner console = new Scanner(System.in);
		while(true){
			System.out.println("请输入要删除学生ID：");
			String ID =console.next();
			Student st =students.get(ID);
			if(st==null){
				System.out.println("该ID不存在");
				continue;
			}
			students.remove(ID);
			System.out.println("成功删除学生："+st.name);
			break;
			
		}
	}
	
	public void testModify(){
		System.out.println("请输入要修改学生ID：");
		Scanner console = new Scanner(System.in);
		while(true){
			String ID =console.next();
			Student st =students.get(ID);
			if(st==null){
				System.out.println("该ID不存在");
				continue;
			}
			System.out.println("当前该学生ID对应的学生为："+st.name);
			System.out.println("请输入新的学生姓名：");
			String name =console.next();
		}
	}
	
	public void testEntrySet(){
		Set<Entry<String,Student>> entrySet = students.entrySet();
		for(Entry<String,Student> entry:entrySet){
			System.out.println("取得键："+entry.getKey());
			System.out.println("对应的值为："+entry.getValue().name);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapTest mt =new MapTest();
		mt.testPut();
		mt.testEntrySet();
		mt.testRemove();
		mt.testEntrySet();
	}
	
	

}
