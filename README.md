Parser for .docx files. Changes pre-added keywords in .docx file to user's data. Write data in JavaFX Window to change all of them.
Use these keywords to do magic:
<br>{PASSPORTNUM} - writes full RU passport number data (serie+number) into new .docx file</br>
<br>{PASSPORTSERIE} - writes RU passport serie</br>
<br>{PASSPORTNOMER} - writes RU passport number</br> 
<br>{LASTNAME} - writes last name of person</br>
<br>{FIRSTNAME} - writes first name of person</br>
<br>{FNAME1SYM.} - writes first character of first name with dot at the end</br>
<br>{SURNAME} - writes surname of person</br>
<br>{SNAME1SYM.} - writes first character of surname with dot at the end</br>
<br>{SEX} - writes sex(gender) of person</br>
<br>{BIRTHDATE} - writes birthdate. Use 10 symbols to describe (for example 11.03.2002)</br>
<br>{BDAY} - writes day of birth</br>
<br>{BMONTH} - writes birth month in RU using full month name</br>
<br>{BYEAR} - writes birth year</br>
<br>{BPLACE} - writes birthplace</br>
<br>{PASSPORTGIVENPLACE} - writes where RU passport was given</br>
<br>{PASSPORTGIVENDATE} - writes when RU passport was given</br>
<br>{PGIVENDAY} - writes day when RU passport was given</br>
<br>{PGIVENMONTH} - full month when RU passport was given</br>
<br>{PGIVENYEAR} - year when RU passport was given</br>
<br>{PASSPORTCODE} - department code, where passport was given</br>
<br>{CITYNAME} - cityname :D</br>
<br>{STREETNAME}</br>
<br>{HOUSENUM}</br>
<br>{BUILDINGNUM}</br>
<br>{HOUSINGNUM}</br>
<br>{APARTMENTNUM}</br>
<br>{FULLADDRESS} - writes full address of living. Use this when you need additional data about person's location</br>
<br>{POSTALCODE}</br>
<br>{COUNTRYPASSNUM} - international passport number</br>
<br>{LASTLATINNAME} - last name in latin (english alphabet)</br>
<br>{FIRSTLATINNAME} - first name in latin (english alphabet)</br>
<br>{COUNTRYPASSGIVENPLACE} - where international passport was given</br>
<br>{COUNTRYPASSGIVENDATE} - date when international passport was given. Use 10 symbols to describe (for example 11.03.2002)</br>
<br>{COUNTRYPASSGIVENDAY} - day when international passport was given</br>
<br>{COUNTRYPASSGIVENMONTH} - full month when international passport was given</br>
<br>{COUNTRYPASSGIVENYEAR} - year when international was given</br>
<br>{COUNTRYPASSEXPIRYDATE} - date when international passport expires. Use 10 symbols to describe (for example 11.03.2002)</br>
<br>{COUNTRYPASSEXPIRYDAY} - day when international passport expires</br>
<br>{COUNTRYPASSEXPIRYMONTH} - full month when international passport expires</br>
<br>{COUNTRYPASSEXPIRYYEAR} - year when international passport expires</br>
<br>{INDIVIDUALNUM} - person's individual number (ИНН in RU)</br>
<br>{WORKPLACE} - workplace of person</br>
<br>{WORKJOB} - which job does this person do</br>
<br>{JOBSPHERE} - job sphere</br>
<br>{CODEWORD} - person's codeword</br>
<br>{PHONENUM} - person's phonenumber</br>
<br>{FAMILYSTATUS} - person's family status (married etc.)</br>
<br>{EMAIL}</br>
<br>{DEALCREATIONDATE} - date where deal was created. Use 10 symbols to describe (for example 11.03.2002)</br>
<br>{DEALCREATIONDAY} - day where deal was created</br>
<br>{DEALCREATIONMONTH} - full month in RU where deal was created</br>
<br>{DEALCREATIONYEAR} - year where deal was created</br>
<br>{SUMNUM} - cost of deal</br>
<br>{SUMFULL} - full cost of deal</br>
<br>{DEALCREATIONMONTHNUMERICAL} - return month numerical from deal creation date field</br>
