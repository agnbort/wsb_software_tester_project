from selenium import webdriver
from Helper_zalogowany import Login
from Helper_zalogowany import Logout
from selenium.common.exceptions import NoSuchElementException


driver = webdriver.Firefox()
driver.maximize_window()
Login(driver)

bookmark_electrodes = driver.find_element_by_xpath('//*[@id="store.menu"]/nav/ul/li[3]/a/span')
bookmark_electrodes.click()

try:
    product1 = driver.find_element_by_xpath('//*[@id="layer-product-list"]/div[2]/ol/li[4]/div/div[1]/a/img')
    product1.click()

    heartButton = driver.find_element_by_xpath('//*[@id="maincontent"]/div[2]/div[1]/div[3]/div[6]/div[1]/a[1]')
    heartButton.click()

    positivMessage = driver.find_element_by_xpath('//*[@id="maincontent"]/div[2]/div[2]/div/div/div')
    assert positivMessage.text == 'Ambu® Blue Sensor™ P-00-S, bag/50 pcs has been added to your Wish List. Click here to continue shopping.'

except NoSuchElementException:
   print("product1 not found.")
   try:
        product2 = driver.find_element_by_xpath('//*[@id="layer-product-list"]/div[2]/ol/li[3]/div/div[1]/a/img')
        product2.click()

        positivMessage = driver.find_element_by_xpath('//*[@id="maincontent"]/div[2]/div[2]/div/div/div')
        assert positivMessage.text == 'Sanibel™ Infant EarCup™ Kit w/o electrodes, box/20 sets has been added to your Wish List. Click here to continue shopping.'

   except NoSuchElementException:
       print("product2 not found. The program will close. Please choose a different product.")
       driver.quit()



driver.get_screenshot_as_file('TC_6.1.png')

Logout(driver)




