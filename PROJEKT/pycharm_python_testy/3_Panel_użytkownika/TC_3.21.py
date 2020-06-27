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

editButton = driver.find_element_by_xpath('//*[@id="maincontent"]/div[3]/div[1]/div[3]/div[2]/div[2]/div[2]/a/span')
editButton.click()

firstname = driver.find_element_by_id('firstname')
firstname.click()
firstname.clear()
firstname.send_keys('aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa')

lastname = driver.find_element_by_id('lastname')
lastname.click()
lastname.clear()
lastname.send_keys('bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb')

telephone = driver.find_element_by_id('telephone')
telephone.click()
telephone.clear()
telephone.send_keys('aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa')

street = driver.find_element_by_id('street_1')
street.click()
street.clear()
street.send_keys('Niebieska 2111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111')

city = driver.find_element_by_id('city')
city.clear()
city.send_keys('aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa')

zip = driver.find_element_by_id('zip')
zip.clear()
zip.send_keys('aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa')

country = driver.find_element_by_xpath('//*[@id="country"]/option[32]').click()


saveButton = driver.find_element_by_xpath('//*[@id="form-validate"]/div/div[1]/button/span')
saveButton.click()

driver.get_screenshot_as_file('TC_3.21.png')

positiveMessage = driver.find_element_by_xpath('//*[@id="maincontent"]/div[2]/div[2]/div/div/div')
assert positiveMessage.text == 'You saved the address.'

Logout(driver)








