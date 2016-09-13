package pages.topTags;

import java.net.MalformedURLException;
import org.openqa.selenium.WebElement;
import utilities.BasicMethods;
import utilities.Enums.typeExpectedCondition;
import utilities.Enums.typeIdSelenium;

public class TopTagsPage {

	public static WebElement selectAutomationTag, selectAndroidTag,
			selectQATag, selectTeamSpiritTag, btnMore, btnFindTag,
			selectResultOfSearch;

	public static void getTopTagsPageComponents() throws MalformedURLException {
		BasicMethods.handlingWaits(typeExpectedCondition.presenceOfElementLocated,"//android.widget.TextView[@index='1']");
		selectAutomationTag = BasicMethods.getComponnet(selectAutomationTag,typeIdSelenium.xpath,"//android.widget.FrameLayout/android.widget.TextView[@text='AUTOMATION']");
		selectAndroidTag = BasicMethods.getComponnet(selectAndroidTag, typeIdSelenium.xpath,"//android.widget.FrameLayout/android.widget.TextView[@text='ANDROID']");
		selectQATag = BasicMethods.getComponnet(selectQATag, typeIdSelenium.xpath,"//android.widget.FrameLayout/android.widget.TextView[@text='QA']");
		selectTeamSpiritTag = BasicMethods.getComponnet(selectTeamSpiritTag, typeIdSelenium.xpath,"//android.widget.FrameLayout/android.widget.TextView[@text='TEAM SPIRIT']");
		btnMore = BasicMethods.getComponnet(btnMore, typeIdSelenium.id,"com.belatrixsf.connect:id/start_recommendation");
		btnFindTag = BasicMethods.getComponnet(btnFindTag, typeIdSelenium.id,"com.belatrixsf.connect:id/action_search");
	}
	
	public static void selectAndroidTag()
	{
		selectAndroidTag.click();
	}
	
	
	

}
