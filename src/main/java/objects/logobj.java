package objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logobj extends basepage {
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement Women; 
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement dress; 
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement shirts; 
	
	public logobj() {
		PageFactory.initElements(driver, this);
	}
	public WebElement getWomen () {
		return Women;}
	public WebElement getdress () {
		return dress;}
	public WebElement getshirts () {
	return shirts;
	}
	
	
		
}

		
		
 
	

