Selenium_ChromeDriver_Test
==========================

Testing ChromeDriver by navigating to url

How to use
==========

Using Intellij 13

- Download latest version chromedriver.exe for respective OS: http://chromedriver.storage.googleapis.com/index.html
- Fork project and make sure maven depencies are working. If not create new empty maven project and inport the libraries into the pom.xml:

```<dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.11</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>2.42.2</version>
        </dependency>
    </dependencies> ```
    
    
- In navigationTest.java, replace path to chromedriver.exe to whereever downloaded:

`System.setProperty("webdriver.chrome.driver", "PATH GOES HERE");`

- Make and run navigationTest.java

