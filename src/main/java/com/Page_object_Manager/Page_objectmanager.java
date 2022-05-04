package com.Page_object_Manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Pom.Bookahotel;
import com.Pom.Confirmation;
import com.Pom.Login_page;
import com.Pom.Searchhotel;
import com.Pom.Selecthotel;


public class Page_objectmanager {

	private WebDriver driver;
	private Login_page login;
	private Searchhotel search;
	private Selecthotel select;
	private Bookahotel book;
	private Confirmation confirm;

	public WebDriver getDriver() {
		return driver;
	}

	public Login_page get_Instance_Login() {
		login = new Login_page(driver);
		return login;
	}

	public Searchhotel get_Instance_Search() {
		search = new Searchhotel(driver);
		return search;
	}

	public Selecthotel get_Instance_Select() {
		select = new Selecthotel(driver);
		return select;
	}

	public Bookahotel get_Instance_Book() {
		book = new Bookahotel(driver);
		return book;
	}

	public Confirmation get_Instance_Confirm() {
		confirm = new Confirmation(driver);
		return confirm;
	}

	public Page_objectmanager(WebDriver driver1) {

		this.driver = driver1;
		PageFactory.initElements(driver, this);

	}

}
