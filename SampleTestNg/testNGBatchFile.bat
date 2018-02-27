set projectlocation=F:\SeleniumPrograms\SampleTestNg
cd %projectlocation%
set classpath=%projectlocation%\bin;%projectlocation%\lib\*
java org.testng.TestNG %projectlocation%\testng.xml
pause