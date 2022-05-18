package Locators;

import org.openqa.selenium.By;

public class Locators {

    public static final By START_PAGE = By.className("HeadBanner-Inner");
    public static final By LOGIN_PAGE = By.className("passp-auth-content");
    public static final By LOGIN_FIELD = By.xpath("//input[@name='login']");
    public static final By LOGIN_BUTTON = By.xpath("(//span[contains(text(),\"Log in\")]/ancestor::a)[1]");
    public static final By PROCEED_BUTTON = By.id("passp:sign-in");
    public static final By PASSWORD_FIELD = By.id("passp-field-passwd");
    public static final By MESSAGE_BLOCK = By.className("mail-Page-Body");
}