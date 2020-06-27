from selenium import webdriver
import time

driver = webdriver.Chrome()
driver.maximize_window()
driver.get('https://www.sanibelsupply.eu/customer/account/login/referer/aHR0cHM6Ly93d3cuc2FuaWJlbHN1cHBseS5ldS9jdXN0b21lci9hY2NvdW50L2ZvcmdvdHBhc3N3b3JkLw%2C%2C/')

cookie = driver.find_element_by_xpath('//*[@id="coiPage-1"]/div[2]/span[2]')
cookie.click()

createButton = driver.find_element_by_xpath('//*[@id="maincontent"]/div[3]/div/div[2]/div[2]/div[2]/div/div/a/span')
createButton.click()

urlafterclick = driver.current_url
assert urlafterclick == 'https://www.sanibelsupply.eu/customer/account/create/'

time.sleep(4)

driver.get_screenshot_as_file('TC_2.9.png')

driver.quit()



