package org.test;

public class test implements Hardware, Software{

	@Override
	public void Antivirus() {
		System.out.println("ANTIVIRUS");
	}

	@Override
	public void facebook() {
		System.out.println("FACEBOOK");
	}

	@Override
	public void Boards() {
		System.out.println("BOARDS");
	}

	@Override
	public void Equipments() {
		System.out.println("EQUIPEMENTS");
	}
public static void main(String[] args) {
	test s=new test();
	s.Antivirus();
	s.facebook();
	s.Boards();
	s.Equipments();
}
}
