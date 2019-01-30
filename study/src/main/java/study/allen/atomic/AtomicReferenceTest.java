package study.allen.atomic;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceTest {
	public static void main(String[] args) {
		AtomicReference<Person> ar=new AtomicReference<Person>();
		Person person=new Person("Allen", 25);
		ar.set(person);
		Person upPerson=new Person("joe", 26);
		ar.compareAndSet(person, upPerson);
		System.out.println(ar.get().getName());
		System.out.println(ar.get().getAge());	
	}
}
