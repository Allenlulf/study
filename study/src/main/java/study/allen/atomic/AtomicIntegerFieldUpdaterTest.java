package study.allen.atomic;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class AtomicIntegerFieldUpdaterTest {
	public static void main(String[] args) {
		AtomicIntegerFieldUpdater<Student> a = AtomicIntegerFieldUpdater.newUpdater(Student.class, "age");
		Student student = new Student("joe", 18);
		a.getAndIncrement(student);
		System.out.println(student.getAge());
	}
}
