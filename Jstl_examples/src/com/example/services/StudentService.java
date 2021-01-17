package com.example.services;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.example.demo.Student;

public class StudentService {
HashMap<String, List<Student> >studentList;
public StudentService()
{
	studentList=new HashMap<>();
	Student cs1=new Student("nikhil", 90, 47);
	Student cs2=new Student("ram", 100, 60);
	Student cs3= new Student("sham", 98, 62);
	Student cs4= new Student("bham", 99, 02);
	List<Student> csc=Arrays.asList(cs1,cs2,cs3,cs4);
	
	Student ece1=new Student("Rohi", 90, 47);
	Student ece2=new Student("Virat", 100, 60);
	Student ece3= new Student("Hardik", 98, 62);
	Student ece4= new Student("Prithvi", 99, 02);
	List<Student> ece=Arrays.asList(ece1,ece2,ece3,ece4);
	
	studentList.put("csc", csc);
	studentList.put("ece", ece);
}
public List<Student> getDetails(String branch)
{
	return this.studentList.get(branch);
}
}
