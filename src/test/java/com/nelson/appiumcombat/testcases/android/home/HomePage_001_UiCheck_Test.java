package com.nelson.appiumcombat.testcases.android.home;
import com.nelson.appiumcombat.base.BasePrepare;
import com.nelson.appiumcombat.utils.SuperAction;
import org.testng.annotations.Test;

public class HomePage_001_UiCheck_Test extends BasePrepare {
@Test 
 public void uiCheck() { 
SuperAction.parseExcel("Home","001_UiCheck",appiumUtil,platformName);
 }
}