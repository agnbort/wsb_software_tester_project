from selenium import webdriver
from Helper_zalogowany import Login
from Helper_zalogowany import Logout

driver = webdriver.Chrome()
driver.maximize_window()

Login(driver)

actionSwitch = driver.find_element_by_xpath('/html/body/div[2]/header/div[1]/div/ul/li[3]/span/button')
actionSwitch.click()

my_account = driver.find_element_by_xpath('/html/body/div[2]/header/div[1]/div/ul/li[3]/div/ul/li[1]/a')
my_account.click()

editButton = driver.find_element_by_xpath('//*[@id="maincontent"]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/a[1]/span')
editButton.click()

first_name = driver.find_element_by_id('firstname')
first_name.click()
first_name.clear()
first_name.send_keys('Anna')

last_name = driver.find_element_by_id('lastname')
last_name.click()
last_name.clear()
last_name.send_keys('Kowalska')

saveButton = driver.find_element_by_xpath('//*[@id="form-validate"]/div[2]/div[1]/button')
saveButton.click()

positiveMessage = driver.find_element_by_xpath('//*[@id="maincontent"]/div[2]/div[2]/div/div/div')
assert positiveMessage.text == 'You saved the account information.'

driver.get_screenshot_as_file('TC_3.0.png')

Logout(driver)





