package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entity.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao  {
	@Autowired
	private JdbcTemplate jdbctemplate;

	
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}
	
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	public int insert(Student student) {
		String query="insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbctemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}

	@Override
	public int change(Student student) {
		String query="update student set name=?, city=? where id=?";
		int i = this.jdbctemplate.update(query,student.getName(), student.getCity(),student.getId());
		return i;
	}

	@Override
	public int delete(Student student) {
		String query="delete from student where id=?";
		int i = this.jdbctemplate.update(query,student.getId());
		return i;
	}

	@Override
	public Student getStudent(int studentId) {

		String Query="Select * from student where id=?";
			RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student=this.jdbctemplate.queryForObject(Query,rowMapper,studentId);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		
		String query="select * from student";
		List<Student> students=this.jdbctemplate.query(query, new RowMapperImpl());
		
		return students;
	}
	
}
