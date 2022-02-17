package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Base.TestBase;
import io.cucumber.java.en.Given;

public class GeneralInformationPage  {

	public WebDriver driver;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input'])[1]")
	WebElement lastName;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input'])[2]")
	WebElement firstName;
	
	@FindBy(id="mui-component-select-insuredBasicInfo.gender_0")
	@CacheLookup
	WebElement sex;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input'])[5]")
	WebElement DOB;

	@FindBy(id="mui-component-select-insuredBasicInfo.gender_0")
	@CacheLookup
	WebElement maritalStatus;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//input[@name='insuredOriginInfo.canadianCitizen_0'])[1]")
	WebElement canadianCitizen;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@name='insuredAddress.street_0']")
	WebElement address;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@name='insuredAddress.city_0']")
	WebElement city;
	
	@FindBy(id="mui-component-select-insuredAddress.province_0")
	@CacheLookup
	WebElement province;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@name='insuredAddress.postalCode_0']")
	WebElement postalCode;
	
	@FindBy(id="mui-component-select-type_0_0")
	@CacheLookup
	WebElement telephoneType;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//input[@name='phoneNumber_0_0']")
	WebElement telephone;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//input[@class='jss386'])[4]")
	WebElement purposeOfInsuranceMortgage;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//label[contains(@class,'MuiFormControlLabel-root sc-cSiBin')])[4]")
	WebElement purposeOfInsuranceQ2No;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//input[@name='payWithLoan.case_0'])[2]")
	WebElement purposeOfInsuranceQ3No;
	
	@FindBy(id="mui-component-select-type_0_0")
	@CacheLookup
	WebElement employmentStatus;
	
	@FindBy(how = How.XPATH, using = "//input[@name='employerInfo.employer_0']")
	@CacheLookup
	WebElement employerName;
	
	@FindBy(how = How.XPATH, using = "(//input[@name='employerInfo.occupationAssociation_0'])[2]")
	@CacheLookup
	WebElement occupationAssociateQ1;
	
	@FindBy(how = How.XPATH, using = "(//input[@name='employerInfo.occupationHeight_0'])[2]")
	@CacheLookup
	WebElement occupationAssociateQ2;
	
	@FindBy(how = How.XPATH, using = "(//input[@name='employerInfo.occupationDisability_0'])[2]")
	@CacheLookup
	WebElement occupationAssociateQ3;
	
	@FindBy(how = How.XPATH, using = "//input[@name='insuredBasicInfo.job_0']")
	@CacheLookup
	WebElement occupation;
	
	@FindBy(id="generalFinancialInfo.revenue_0")
	@CacheLookup
	WebElement annualGrossIncome;
	
	@FindBy(id="generalFinancialInfo.totalActives_0")
	@CacheLookup
	WebElement totalAssets;
	
	@FindBy(id="generalFinancialInfo.totalPassive_0")
	@CacheLookup
	WebElement totalLiabilities;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "(//input[@name='bankruptcy.history_0'])[2]")
	WebElement bankruptcy;
}
