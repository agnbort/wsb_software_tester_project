from selenium.webdriver.common.keys import Keys

def Login(driver):
    driver.get('https://www.sanibelsupply.eu/customer/account/login/referer/aHR0cHM6Ly93d3cuc2FuaWJlbHN1cHBseS5ldS9jdXN0b21lci9hY2NvdW50L2ZvcmdvdHBhc3N3b3JkLw%2C%2C/ ')

    cookie = driver.find_element_by_xpath('//*[@id="coiPage-1"]/div[2]/span[2]')
    cookie.click()

    email = driver.find_element_by_id('email')
    email.send_keys('testowaniestrony@wp.pl')

    haslo = driver.find_element_by_id('pass')
    haslo.send_keys('Tester123')

    signinButton = driver.find_element_by_id('send2')
    signinButton.send_keys(Keys.ENTER)


    urlafterlogin = driver.current_url
    assert urlafterlogin == 'https://www.sanibelsupply.eu/customer/account/'

def Logout(driver):
    signoutButton = driver.find_element_by_xpath('/html/body/div[2]/header/div[1]/div/ul/li[5]/a')
    signoutButton.send_keys(Keys.ENTER)

    urlafterlogout = driver.current_url
    assert urlafterlogout == 'https://www.sanibelsupply.eu/customer/account/logoutSuccess/'

    driver.quit()
