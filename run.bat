set projectLocation=C:\Users\lenovo\Desktop\workplace\Frm_Batch30
cd %projectLocation%
set classpath= %projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml