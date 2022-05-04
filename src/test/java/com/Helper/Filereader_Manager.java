package com.Helper;

public class Filereader_Manager {

	private Filereader_Manager() {

	}

	public static Filereader_Manager get_Instance_FR() {

		Filereader_Manager reader = new Filereader_Manager();
		return reader;
	}

	public confirguration_Reader get_Instance_CR() throws Throwable {

		confirguration_Reader helper = new confirguration_Reader();
		return helper;

	}

}
