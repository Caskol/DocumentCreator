Parser for .docx files. Changes pre-added keywords in .docx file to user's data. Write data in JavaFX Window to change all of them.
Use this keywords to do magic:
{PASSPORTNUM} - writes full RU passport number data (serie+number) into new .docx file
{PASSPORTSERIE} - writes RU passport serie
{PASSPORTNOMER} - writes RU passport number 
{LASTNAME} - writes last name of person
{FIRSTNAME} - writes first name of person
{FNAME1SYM.} - writes first character of first name with dot at the end
{SURNAME} - writes surname of person
{SNAME1SYM.} - writes first character of surname with dot at the end
{SEX} - writes sex(gender) of person
{BIRTHDATE} - writes birthdate. Use 10 symbols to describe (for example 11.03.2002)
{BDAY} - writes day of birth
{BMONTH} - writes birth month in RU using full month name
{BYEAR} - writes birth year
{BPLACE} - writes birthplace
{PASSPORTGIVENPLACE} - writes where RU passport was given
{PASSPORTGIVENDATE} - writes when RU passport was given
{PGIVENDAY} - writes day when RU passport was given
{PGIVENMONTH} - full month when RU passport was given
{PGIVENYEAR} - year when RU passport was given
{PASSPORTCODE} - department code, where passport was given
{CITYNAME} - cityname :D
{STREETNAME}
{HOUSENUM}
{BUILDINGNUM}
{HOUSINGNUM}
{APARTMENTNUM}
{FULLADDRESS} - writes full address of living. Use this when you need additional data about person's location
{POSTALCODE}
{COUNTRYPASSNUM} - international passport number
{LASTLATINNAME} - last name in latin (english alphabet)
{FIRSTLATINNAME} - first name in latin (english alphabet)
{COUNTRYPASSGIVENPLACE} - where international passport was given
{COUNTRYPASSGIVENDATE} - date when international passport was given. Use 10 symbols to describe (for example 11.03.2002)
{COUNTRYPASSGIVENDAY} - day when international passport was given
{COUNTRYPASSGIVENMONTH} - full month when international passport was given
{COUNTRYPASSGIVENYEAR} - year when international was given
{COUNTRYPASSEXPIRYDATE} - date when international passport expires. Use 10 symbols to describe (for example 11.03.2002)
{COUNTRYPASSEXPIRYDAY} - day when international passport expires
{COUNTRYPASSEXPIRYMONTH} - full month when international passport expires
{COUNTRYPASSEXPIRYYEAR} - year when international passport expires
{INDIVIDUALNUM} - person's individual number (ИНН in RU)
{WORKPLACE} - workplace of person
{WORKJOB} - which job does this person do
{JOBSPHERE} - job sphere
{CODEWORD} - person's codeword
{PHONENUM} - person's phonenumber
{FAMILYSTATUS} - person's family status (married etc.)
{EMAIL}
{DEALCREATIONDATE} - date where deal was created. Use 10 symbols to describe (for example 11.03.2002)
{DEALCREATIONDAY} - day where deal was created
{DEALCREATIONMONTH} - full month in RU where deal was created
{DEALCREATIONYEAR} - year where deal was created
{SUMNUM} - cost of deal
{SUMFULL} - full cost of deal
